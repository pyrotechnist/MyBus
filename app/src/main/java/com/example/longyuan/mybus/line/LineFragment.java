package com.example.longyuan.mybus.line;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.longyuan.mybus.R;
import com.example.longyuan.mybus.pojo.line.LinesItem;
import com.example.longyuan.mybus.utils.LineListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.longyuan.mybus.line.LineActivity.EXTRA_LINE_TYPE;

/**
 * A placeholder fragment containing a simple view.
 */
public class LineFragment extends Fragment implements LineContract.View{

    @BindView(R.id.recylerview_lines)
    RecyclerView mRecyclerView_lines;

    private LineListAdapter mLineListAdapter;


    private LineContract.Presenter mPresenter;

    private int mType;

    public LineFragment() {
    }

    public static LineFragment getInstance(int type) {

        LineFragment lineFragment = new LineFragment();
        Bundle args = new Bundle();
        args.putInt(EXTRA_LINE_TYPE, type);
        lineFragment.setArguments(args);
        return lineFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (getArguments() != null) {
            mType = getArguments().getInt(EXTRA_LINE_TYPE);
        }


        View view = inflater.inflate(R.layout.frag_metro, container, false);

        ButterKnife.bind(this, view);

        mLineListAdapter = new LineListAdapter(new ArrayList<LinesItem>(), getContext());

        mRecyclerView_lines.setAdapter(mLineListAdapter);

        mRecyclerView_lines.setLayoutManager(new GridLayoutManager(mRecyclerView_lines.getContext(), 3));

        return view;
    }


    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start(mType);
    }

    @Override
    public void setPresenter(LineContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void errorToast(String error) {

    }

    @Override
    public void updateData(List<LinesItem> linesItems) {
        mLineListAdapter.updateData(linesItems);
    }
}

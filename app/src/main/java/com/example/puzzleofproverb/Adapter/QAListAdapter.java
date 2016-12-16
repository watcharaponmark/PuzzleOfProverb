package com.example.puzzleofproverb.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.puzzleofproverb.R;
import com.example.puzzleofproverb.model.QA;

import java.util.ArrayList;

/**
 * Created by Mark on 12/16/16.
 */
public class QAListAdapter extends ArrayAdapter<QA> {

    private Context mContext;
    private int mLayoutResId;
    private ArrayList<QA> mQAList;

    public QAListAdapter(Context context, int resource, ArrayList<QA> QAList) {
        super(context, resource, QAList);

        this.mContext = context;
        this.mLayoutResId = resource;
        this.mQAList = QAList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemLayout = View.inflate(mContext, mLayoutResId, null);

        TextView tv_Q=(TextView) itemLayout.findViewById(R.id.tv_Q) ;

        QA qa = mQAList.get(position);
        tv_Q.setText(qa.getmCOL_Que());

        return super.getView(position, convertView, parent);
    }
}

package com.youhao.drippple.view.bucket_list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.youhao.drippple.R;
import com.youhao.drippple.view.base.BaseViewHolder;

import butterknife.BindView;

public class BucketViewHolder extends BaseViewHolder {

    @BindView(R.id.bucket_layout)
    View bucketLayout;
    @BindView(R.id.bucket_name)
    TextView bucketName;
    @BindView(R.id.bucket_shot_count)
    TextView bucketCount;
    @BindView(R.id.bucket_shot_chosen)
    ImageView bucketChosen;

    public BucketViewHolder(View itemView) {
        super(itemView);
    }
}

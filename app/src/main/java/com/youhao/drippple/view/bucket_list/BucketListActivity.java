package com.youhao.drippple.view.bucket_list;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;


import com.youhao.drippple.R;
import com.youhao.drippple.view.base.SingleFragmentActivity;

import java.util.ArrayList;

public class BucketListActivity extends SingleFragmentActivity {

    @NonNull
    @Override
    protected Fragment newFragment() {
        boolean isChoosingMode = getIntent().getExtras().getBoolean(
                BucketListFragment.KEY_CHOOSING_MODE);
        ArrayList<String> chosenBucketIds = getIntent().getExtras().getStringArrayList(
                BucketListFragment.KEY_COLLECTED_BUCKET_IDS);
        return BucketListFragment.newInstance(null, isChoosingMode, chosenBucketIds);
    }

    @NonNull
    @Override
    protected String getActivityTitle() {
        return getString(R.string.choose_bucket);
    }
}

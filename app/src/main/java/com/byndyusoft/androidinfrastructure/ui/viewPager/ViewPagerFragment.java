package com.byndyusoft.androidinfrastructure.ui.viewPager;

import android.support.annotation.NonNull;
import android.view.View;

import com.byndyusoft.androidinfrastructure.R;
import com.byndyusoft.androidinfrastructure.ui.main.MainFragment;

/**
 * Created by Dmitrii Komiakov
 * komiakov.dmitrii@gmail.com
 * komyakovds@byndyusoft.com
 * on 31.10.2016.
 */

public class ViewPagerFragment extends MainFragment {

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_view_pager;
    }

    @Override
    protected void onViewInflated(@NonNull View view) {

    }

}

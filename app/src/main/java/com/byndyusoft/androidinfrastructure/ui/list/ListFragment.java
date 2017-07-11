package com.byndyusoft.androidinfrastructure.ui.list;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.byndyusoft.androidinfrastructure.R;
import com.byndyusoft.androidinfrastructure.core.listItem.ListItem;
import com.byndyusoft.androidinfrastructure.ui.main.MainFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitrii Komiakov
 * komiakov.dmitrii@gmail.com
 * komyakovds@byndyusoft.com
 * on 31.10.2016.
 */

public class ListFragment extends MainFragment {

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_list;
    }

    @Override
    protected void onViewInflated(@NonNull View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        getMainFragmentCallback().setToolbar(toolbar);

        ListAdapter listAdapter = new ListAdapter();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list_view);
        recyclerView.setAdapter(listAdapter);

        List<ListItem> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(new ListItem("John", "Doe", 25 + i));
        }
        listAdapter.setDataList(list);
    }

    @Override
    protected boolean isNavMenuEnabled() {
        return true;
    }

    @Override
    protected boolean isOptionsMenuEnabled() {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                getMainFragmentCallback().showNavigationMenu();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

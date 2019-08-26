package com.omelchenkoaleks.baseandroid._008_navigation_tabs;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;

import com.omelchenkoaleks.baseandroid.R;

public class NavigationTabsActivity extends AppCompatActivity
        implements ActionBar.TabListener {
    private final String TAG = "TAB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_008_navigation_tabs);

        ActionBar bar = getSupportActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab = bar.newTab();
        tab.setText("tab1");
        tab.setTabListener(this);
        bar.addTab(tab);

        tab = bar.newTab();
        tab.setText("tab2");
        tab.setTabListener(this);
        bar.addTab(tab);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        Log.d(TAG, "selected tab: " + tab.getText() + " position: " + tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        Log.d(TAG, "unselected tab: " + tab.getText());
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        Log.d(TAG, "reselected tab: " + tab.getText());
    }
}

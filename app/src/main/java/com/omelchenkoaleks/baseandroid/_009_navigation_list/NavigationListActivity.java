package com.omelchenkoaleks.baseandroid._009_navigation_list;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

import com.omelchenkoaleks.baseandroid.R;

public class NavigationListActivity extends AppCompatActivity
        implements ActionBar.OnNavigationListener {
    private final String TAG = "List";

    private String[] data = new String[] {"one", "two", "three"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_009_navigation_list);

        ActionBar bar = getSupportActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, data);
        bar.setListNavigationCallbacks(adapter, this);
    }

    @Override
    public boolean onNavigationItemSelected(int itemPosition, long itemId) {
        Log.d(TAG,
                "selected: position = " + itemPosition
                + ", id = " + itemId
                + ", " + data[itemPosition]);

        return false;
    }
}

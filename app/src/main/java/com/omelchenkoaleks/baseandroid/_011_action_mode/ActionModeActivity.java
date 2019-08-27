package com.omelchenkoaleks.baseandroid._011_action_mode;

import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.omelchenkoaleks.baseandroid.R;

public class ActionModeActivity extends AppCompatActivity {
    private ActionMode mActionMode;

    // создаем обработчик этого ActionMode
    private ActionMode.Callback mCallback = new CallBack();

    private final String TAG = "ActionMode";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_011_action_mode);

        getSupportActionBar().hide();
    }

    public void actionModeOnClick(View view) {
        if (mActionMode == null) {
            mActionMode = startActionMode(mCallback);
        } else {
            mActionMode.finish();
        }
    }

    private class CallBack implements ActionMode.Callback {

        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            mode.getMenuInflater().inflate(R.menu._011_context, menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            Log.d(TAG, "Prepare");
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            Log.d(TAG, "item " + item.getTitle());
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            Log.d(TAG, "destroy");
            mActionMode = null;
        }
    }
}

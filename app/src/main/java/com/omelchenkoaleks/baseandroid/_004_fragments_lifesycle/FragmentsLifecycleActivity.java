package com.omelchenkoaleks.baseandroid._004_fragments_lifesycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.omelchenkoaleks.baseandroid.R;

public class FragmentsLifecycleActivity extends AppCompatActivity {
    private static final String TAG = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_004_fragments_lifecycle);

        getInitFragment();

        Toast.makeText(this, "Activity: onCreate()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Activity: onCreate()");
    }

    private void getInitFragment() {
        getFragmentManager().beginTransaction()
                .add(R.id.frame_fragments_lifecycle, new LifecycleFragment()).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Activity: onStart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Activity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity: onResume()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Activity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Activity: onPause()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Activity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Activity: onStop()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Activity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Activity: onDestroy()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Activity: onDestroy()");
    }
}


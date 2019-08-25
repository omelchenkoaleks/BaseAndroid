package com.omelchenkoaleks.baseandroid._005_send_data_from_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.omelchenkoaleks.baseandroid.R;

public class SendDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_005_send_data);

        DataFragment dataFragment = DataFragment.getInstance("Hello World");
        getFragmentManager().beginTransaction().add(R.id.send_activity_frame_layout, dataFragment).commit();
    }
}

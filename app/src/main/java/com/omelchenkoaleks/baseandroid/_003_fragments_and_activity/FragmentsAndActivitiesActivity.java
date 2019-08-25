package com.omelchenkoaleks.baseandroid._003_fragments_and_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.omelchenkoaleks.baseandroid.R;

public class FragmentsAndActivitiesActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mResultForSecondFragmentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_003_fragments_and_activities);

        mResultForSecondFragmentTextView = findViewById(R.id.result_for_fragment_text_view);

        initSecondFragment();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Fragment fragment = getFragmentManager().findFragmentById(R.id.first_fragment);
        Button button = fragment.getView().findViewById(R.id.hello_activity_button);
        button.setOnClickListener(this);
    }

    private void initSecondFragment() {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frame_second_fragment, new Communication_2_Fragment());
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View v) {
        mResultForSecondFragmentTextView.setText("Hello from First Fragment :)");
    }
}

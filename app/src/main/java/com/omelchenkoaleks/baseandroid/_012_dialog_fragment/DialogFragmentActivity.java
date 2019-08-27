package com.omelchenkoaleks.baseandroid._012_dialog_fragment;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import com.omelchenkoaleks.baseandroid.R;

public class DialogFragmentActivity extends AppCompatActivity {
    DialogFragment mFirstDialogFragment;
    DialogFragment mSecondDialogFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_012_dialog_fragment);

        mFirstDialogFragment = new FirstDialogFragment();
        mSecondDialogFragment = new SecondDialogFragment();
    }


    public void dialogFragmentOnClick(View view) {
        switch (view.getId()) {
            case R.id.first_dialog_button:
                mFirstDialogFragment.show(getSupportFragmentManager(), "dialog_1");
                break;
            case R.id.second_dialog_button:
                mSecondDialogFragment.show(getSupportFragmentManager(), "dialog_2");
                break;
            default:
                break;
        }
    }
}

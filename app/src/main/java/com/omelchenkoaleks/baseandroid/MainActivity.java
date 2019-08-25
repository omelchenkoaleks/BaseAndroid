package com.omelchenkoaleks.baseandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.omelchenkoaleks.baseandroid._001_login_or_password.LoginOrPasswordActivity;
import com.omelchenkoaleks.baseandroid._002_adding_fragment.AddingFragmentActivity;
import com.omelchenkoaleks.baseandroid._003_fragments_and_activity.FragmentsAndActivitiesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id._001_fragment_button:
                Intent intentFragment = new Intent(this, LoginOrPasswordActivity.class);
                startActivity(intentFragment);
                break;

            case R.id._002_dynamic_fragment:
                Intent dynamicFragmentIntent = new Intent(this, AddingFragmentActivity.class);
                startActivity(dynamicFragmentIntent);

            case R.id._003_fragments_and_activities:
                Intent fragmentAndActivityIntent = new Intent(this, FragmentsAndActivitiesActivity.class);
                startActivity(fragmentAndActivityIntent);

            default:
                finish();
        }
    }
}

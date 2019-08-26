package com.omelchenkoaleks.baseandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.omelchenkoaleks.baseandroid._001_login_or_password.LoginOrPasswordActivity;
import com.omelchenkoaleks.baseandroid._002_adding_fragment.AddingFragmentActivity;
import com.omelchenkoaleks.baseandroid._003_fragments_and_activity.FragmentsAndActivitiesActivity;
import com.omelchenkoaleks.baseandroid._004_fragments_lifesycle.FragmentsLifecycleActivity;
import com.omelchenkoaleks.baseandroid._005_send_data_from_activity.DataFragment;
import com.omelchenkoaleks.baseandroid._005_send_data_from_activity.SendDataActivity;
import com.omelchenkoaleks.baseandroid._006_fragment_example.ExampleFragment;
import com.omelchenkoaleks.baseandroid._006_fragment_example.RegisterOrLoginActivity;
import com.omelchenkoaleks.baseandroid._007_menu.MainMenuActivity;

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
                break;

            case R.id._003_fragments_and_activities:
                Intent fragmentAndActivityIntent = new Intent(this, FragmentsAndActivitiesActivity.class);
                startActivity(fragmentAndActivityIntent);
                break;

            case R.id._004_fragments_lifecycle:
                Intent fragmentsLifecycle = new Intent(this, FragmentsLifecycleActivity.class);
                startActivity(fragmentsLifecycle);
                break;

            case R.id._005_send_data_from_activity_to_fragment:
                Intent sendDataIntent = new Intent(this, SendDataActivity.class);
                startActivity(sendDataIntent);
                break;

            case R.id._006_fragment_example:
                Intent fragmentExample = new Intent(this, RegisterOrLoginActivity.class);
                startActivity(fragmentExample);
                break;

            case R.id._007_menu_example:
                Intent menuExampleIntent = new Intent(this, MainMenuActivity.class);
                startActivity(menuExampleIntent);
                break;

            default:
                finish();
        }
    }
}

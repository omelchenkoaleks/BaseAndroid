package com.omelchenkoaleks.baseandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.omelchenkoaleks.baseandroid._001_login_or_password.LoginOrPasswordActivity;
import com.omelchenkoaleks.baseandroid._002_adding_fragment.AddingFragmentActivity;

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

            default:
                finish();
        }
    }
}

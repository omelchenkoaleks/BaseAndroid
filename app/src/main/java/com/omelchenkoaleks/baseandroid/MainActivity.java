package com.omelchenkoaleks.baseandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.omelchenkoaleks.baseandroid._001_login_or_password.LoginOrPasswordActivity;
import com.omelchenkoaleks.baseandroid._002_adding_fragment.AddingFragmentActivity;
import com.omelchenkoaleks.baseandroid._003_fragments_and_activity.FragmentsAndActivitiesActivity;
import com.omelchenkoaleks.baseandroid._004_fragments_lifesycle.FragmentsLifecycleActivity;
import com.omelchenkoaleks.baseandroid._005_send_data_from_activity.SendDataActivity;
import com.omelchenkoaleks.baseandroid._006_fragment_example.RegisterOrLoginActivity;
import com.omelchenkoaleks.baseandroid._007_menu.MainMenuActivity;
import com.omelchenkoaleks.baseandroid._008_navigation_tabs.NavigationTabsActivity;
import com.omelchenkoaleks.baseandroid._009_navigation_list.NavigationListActivity;
import com.omelchenkoaleks.baseandroid._010_dynamic_action_bar.DynamicActionBarActivity;
import com.omelchenkoaleks.baseandroid._011_action_mode.ActionModeActivity;
import com.omelchenkoaleks.baseandroid._012_dialog_fragment.DialogFragmentActivity;

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

            case R.id._008_navigation_tabs:
                Intent navigationTabsIntent = new Intent(this, NavigationTabsActivity.class);
                startActivity(navigationTabsIntent);
                break;

            case R.id._009_navigation_list:
                Intent navigationListIntent = new Intent(this, NavigationListActivity.class);
                startActivity(navigationListIntent);
                break;

            case R.id._010_dynamic_action_bar:
                Intent dynamicActionBarIntent = new Intent(this, DynamicActionBarActivity.class);
                startActivity(dynamicActionBarIntent);
                break;

            case R.id._011_action_mode:
                Intent actionModeIntent = new Intent(this, ActionModeActivity.class);
                startActivity(actionModeIntent);
                break;

            case R.id._012_dialog_fragment:
                Intent dialogFragmentIntent = new Intent(this, DialogFragmentActivity.class);
                startActivity(dialogFragmentIntent);

            default:
                finish();
        }
    }
}

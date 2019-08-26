package com.omelchenkoaleks.baseandroid._007_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.omelchenkoaleks.baseandroid.R;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_007_main_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_007_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.settings_menu:
                Toast.makeText(this, "You pick settings! :)", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.about_author_menu:
                Fragment fragment = getFragmentManager().findFragmentByTag(AuthorFragment.TAG);
                if (fragment == null) {
                    getFragmentManager().beginTransaction()
                            .add(R.id.frame_layout_menu, new AuthorFragment(), AuthorFragment.TAG).commit();
                } else {
                    getFragmentManager().beginTransaction().remove(fragment).commit();
                }
                return true;

            case R.id.official_site_menu:
                Intent intent = new Intent(this, OfficialSiteActivityActivity.class);
                startActivity(intent);
                return true;
        }

        return true;
    }
}

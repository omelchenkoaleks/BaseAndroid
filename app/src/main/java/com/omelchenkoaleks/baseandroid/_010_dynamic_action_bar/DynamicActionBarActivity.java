package com.omelchenkoaleks.baseandroid._010_dynamic_action_bar;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.omelchenkoaleks.baseandroid.R;

public class DynamicActionBarActivity extends AppCompatActivity implements View.OnClickListener {
    private final int MENU_ID = 1;

    private CheckBox mAddCheckBox;
    private CheckBox mShowCheckBox;

    private Fragment mCurrentFragment;
    private Fragment mFirstFragment;
    private Fragment mSecondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_010_dynamic_action_bar);

        mAddCheckBox = findViewById(R.id.add_check_box);
        mShowCheckBox = findViewById(R.id.show_check_box);

        mAddCheckBox.setOnClickListener(this);
        mShowCheckBox.setOnClickListener(this);

        // будем в нем хранить ссылку на текущий объект - по-умолчанию это первый фрагмент
        mCurrentFragment = new FirstDynamicActionBarFragment();
        mFirstFragment = new FirstDynamicActionBarFragment();
        mSecondFragment = new SecondDynamicActionBarFragment();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu._010_menu_group, menu);
        menu.setGroupVisible(R.id.menu_group, mShowCheckBox.isChecked());

        if (mAddCheckBox.isChecked()) {
            menu.add(0, MENU_ID, 0, "New item")
                    .setIcon(R.drawable.ic_action_delete)
                    .setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS | MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        } else {
            menu.removeItem(MENU_ID);
        }

        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add_check_box:
            case R.id.show_check_box:
                invalidateOptionsMenu();
                break;
            case R.id.fragment_action_bar_button:
                mCurrentFragment = (mCurrentFragment == mFirstFragment) ? mSecondFragment : mFirstFragment;
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_frame_layout, mCurrentFragment).commit();
                break;
            default:
                break;
        }
    }

}

package com.omelchenkoaleks.baseandroid._002_adding_fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.omelchenkoaleks.baseandroid.R;

import java.util.Set;

public class AddingFragmentActivity extends AppCompatActivity {
    private FragmentManager mFragmentManager;
    private FirstFragment mFirstFragment;
    private SecondFragment mSecondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_002_adding_fragment);

        mFirstFragment = new FirstFragment();
        mSecondFragment = new SecondFragment();

        mFragmentManager = getSupportFragmentManager();
    }


    public void dynamicFragmentOnClick(View view) {
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();

        switch (view.getId()) {

            case R.id.add_button:
                if (mFragmentManager.findFragmentByTag(FirstFragment.TAG) == null) {
                    fragmentTransaction.add(R.id.content_fragment_linear_layout,
                            mFirstFragment, FirstFragment.TAG);
                }
                break;

            case R.id.remove_button:
                if (mFragmentManager.findFragmentByTag(SecondFragment.TAG) != null) {
                    fragmentTransaction.remove(mSecondFragment);
                }
                if (mFragmentManager.findFragmentByTag(FirstFragment.TAG) != null) {
                    fragmentTransaction.remove(mFirstFragment);
                }
                break;

            case R.id.replace_button:
                if (mFragmentManager.findFragmentByTag(SecondFragment.TAG) != null) {
                    fragmentTransaction.replace(R.id.content_fragment_linear_layout,
                            mFirstFragment, FirstFragment.TAG);
                }
                if (mFragmentManager.findFragmentByTag(FirstFragment.TAG) != null) {
                    fragmentTransaction.replace(R.id.content_fragment_linear_layout,
                            mSecondFragment, SecondFragment.TAG);
                }
                break;

        }
        fragmentTransaction.commit();
    }
}

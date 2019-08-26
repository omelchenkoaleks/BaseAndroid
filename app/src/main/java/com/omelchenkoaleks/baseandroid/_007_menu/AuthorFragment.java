package com.omelchenkoaleks.baseandroid._007_menu;


import android.app.Fragment;
import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.omelchenkoaleks.baseandroid.R;

public class AuthorFragment extends Fragment {
    public static final String TAG = "AuthorFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_007_author, container, false);
    }

}

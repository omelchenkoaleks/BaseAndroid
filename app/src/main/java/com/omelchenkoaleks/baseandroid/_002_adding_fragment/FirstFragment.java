package com.omelchenkoaleks.baseandroid._002_adding_fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.omelchenkoaleks.baseandroid.R;

public class FirstFragment extends Fragment {
    public static final String TAG = "FirstFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_002_first, null);
        return view;
    }

}

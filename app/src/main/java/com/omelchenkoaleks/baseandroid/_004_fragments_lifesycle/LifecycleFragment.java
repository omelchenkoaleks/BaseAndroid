package com.omelchenkoaleks.baseandroid._004_fragments_lifesycle;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.omelchenkoaleks.baseandroid.R;

public class LifecycleFragment extends Fragment {
    private static final String TAG = "Lifecycle";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Toast.makeText(getActivity(), "Fragment: onAttach()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Fragment: onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(), "Fragment: onCreate()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Fragment: onCreate()");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getActivity(), "Fragment: onCreateView()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Fragment: onCreateView()");

        return inflater.inflate(R.layout.fragment_004_lifecycle, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Toast.makeText(getActivity(), "Fragment: onActivityCreated()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Fragment: onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(getActivity(), "Fragment: onStart()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Fragment: onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(), "Fragment: onResume()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Fragment: onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(getActivity(), "Fragment: onPause()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Fragment: onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(getActivity(), "Fragment: onStop()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Fragment: onStop()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getActivity(), "Fragment: onDestroy()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Fragment: onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Toast.makeText(getActivity(), "Fragment: onDetach()", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Fragment: onDetach()");
    }
}

package com.omelchenkoaleks.baseandroid._003_fragments_and_activity;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.omelchenkoaleks.baseandroid.R;

public class Communication_1_Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_003_communication_1, container, false);
    }

}

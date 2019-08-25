package com.omelchenkoaleks.baseandroid._003_fragments_and_activity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import com.omelchenkoaleks.baseandroid.R;

public class Communication_2_Fragment extends Fragment implements View.OnClickListener {
    private TextView mResultFromActivityTextView;
    private Button mHelloFirstFragmentButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_003_communication_2, null);
        mResultFromActivityTextView = view.findViewById(R.id.result_for_activity_text_view);
        mHelloFirstFragmentButton = view.findViewById(R.id.hello_first_fragment_button);
        mHelloFirstFragmentButton.setOnClickListener(this);
        return view;
    }

    // с активити обращаемся сюда во второй фрагмент
    @Override
    public void onResume() {
        super.onResume();
        Button activityButton = getActivity().findViewById(R.id.hello_second_fragment_button);
        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mResultFromActivityTextView.setText("Hello from Activity! ;)");
            }
        });
    }

    // со второго фрагмента обращаемся к первому
    @Override
    public void onClick(View v) {
        Activity activity = getActivity();
        FragmentManager fragmentManager = activity.getFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.first_fragment);
        TextView textView = fragment.getView().findViewById(R.id.result_for_second_fragment_text_view);
        textView.setText("Hello from second Fragment ;)");
    }
}

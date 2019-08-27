package com.omelchenkoaleks.baseandroid._012_dialog_fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.omelchenkoaleks.baseandroid.R;

public class FirstDialogFragment extends DialogFragment implements View.OnClickListener {
    private static final String TAG = "Dialog";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        getDialog().setTitle("Title");
        View view = inflater.inflate(R.layout.cact_view_012_first_dialog_layout, null);

        view.findViewById(R.id.button).setOnClickListener(this);
        view.findViewById(R.id.button2).setOnClickListener(this);
        view.findViewById(R.id.button3).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "First Dialog: " + ((Button) v).getText());
        dismiss();
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        Log.d(TAG, "First Dialog: onDismiss");
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        Log.d(TAG, "First Dialog: onCancel");
    }
}

package com.omelchenkoaleks.baseandroid._012_dialog_fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class SecondDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {
    private static final String TAG = "Dialog";

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder adb = new AlertDialog.Builder(getActivity())
                .setTitle("Title")
                .setPositiveButton("Yes", this)
                .setNegativeButton("No", this)
                .setNeutralButton("Maybe", this)
                .setMessage("You agree with us?");

        return adb.create();
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        switch (which) {
            case Dialog.BUTTON_POSITIVE:
                Log.d(TAG, "Second Dialog: " + "Yes");
                break;
            case Dialog.BUTTON_NEGATIVE:
                Log.d(TAG, "Second Dialog: " + "No");
                break;
            case Dialog.BUTTON_NEUTRAL:
                Log.d(TAG, "Second Dialog: " + "Maybe");
                break;
        }
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        Log.d(TAG, "Dialog 2: onDismiss");
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        Log.d(TAG, "Dialog: onCancel");
    }
}

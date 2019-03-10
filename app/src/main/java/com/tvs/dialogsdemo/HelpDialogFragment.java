package com.tvs.dialogsdemo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HelpDialogFragment extends DialogFragment  {

    private static HelpDialogFragment inputDialogFragment = null;
    private int n;

    public static HelpDialogFragment newInstance() {
        if (inputDialogFragment == null) {
            inputDialogFragment = new HelpDialogFragment();
        }
        return inputDialogFragment;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        // This is older way of creating dialog and not recommended

        AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity())
                .setTitle("This is alert dialog")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Ok is clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dismiss();
                    }
                })
                .setMessage("This is the message");
        return dialog.create();
    }

}

package com.tvs.dialogsdemo;

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

public class InputDialogFragment extends DialogFragment {

    private static InputDialogFragment inputDialogFragment = null;
    private int n;

    public static InputDialogFragment newInstance() {
        if (inputDialogFragment == null) {
            inputDialogFragment = new InputDialogFragment();
        }
        return inputDialogFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.input_dialog_layout, container, false);
        final EditText editText = view.findViewById(R.id.editText);


        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(editText.getText().toString())) {
                    n = Integer.valueOf(editText.getText().toString());
                    Toast.makeText(getActivity(), ""+n+" is entered", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getActivity(),"Please enter non zero number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Button cancel = view.findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(inputDialogFragment != null)
                   inputDialogFragment.dismiss();
            }
        });

        return view;
    }
}

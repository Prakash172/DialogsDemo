package com.tvs.dialogsdemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button showDialogBtn, showDialogBuilderBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showDialogBtn = findViewById(R.id.dialog_fragment_btn);
        showDialogBuilderBtn = findViewById(R.id.dialog_builder_btn);


        showDialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInputDialog();
            }
        });
        showDialogBuilderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogFromBuilder();
            }
        });

    }

    private void showDialogFromBuilder() {
        HelpDialogFragment helpDialogFragment = HelpDialogFragment.newInstance();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        helpDialogFragment.show(transaction,"help");
    }

    public void showInputDialog(){
        InputDialogFragment inputDialogFragment = InputDialogFragment.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        inputDialogFragment.show(fragmentTransaction,"input-fragment-dialog");
    }
}

/*
* 1.Dialogs are based on fragment from android 3.0 and it is recommended to use fragments dialog not activity
* 2.Dialogs are asynchronous
* 3. Steps for the dialog fragment
*   > Create a dialog fragment
*   > Get a fragment transaction
*   > Show the dialog using the fragment transaction from step 2
* */

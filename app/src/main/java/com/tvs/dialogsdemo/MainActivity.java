package com.tvs.dialogsdemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showInputDialog();
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

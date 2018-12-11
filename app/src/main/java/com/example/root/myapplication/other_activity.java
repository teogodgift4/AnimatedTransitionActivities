package com.example.root.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by root on 11/12/2018.
 */

public class other_activity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.another_activity);
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        overridePendingTransition(R.anim.godown,R.anim.goup);
    }

}

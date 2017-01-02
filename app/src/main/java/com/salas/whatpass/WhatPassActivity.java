package com.salas.whatpass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WhatPassActivity extends AppCompatActivity {
    private TextView mStartTextView;
    private Button mStartButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_pass);

        mStartTextView = (TextView) findViewById(R.id.startTextView);
        mStartButton = (Button) findViewById(R.id.startButton);

        View.OnClickListener startListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };

        mStartButton.setOnClickListener(startListener);

//        public void onClick(View v) {
//        String fact = mFactBook.getFact();
//        int color = mColorWheel.getColor();
//
//        //Update the screen with our dynamic fact
//        mFactTextView.setText(fact);
//        mRelativeLayout.setBackgroundColor(color);
//        mShowFactButton.setTextColor(color);
//        Toast.makeText(FunFactsActivity.this, "GOOD JOB!", Toast.LENGTH_SHORT).show();
//        Log.d(TAG, "We're logging from the onCreate() method!");
    }
}

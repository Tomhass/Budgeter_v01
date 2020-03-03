package com.example.budgeter_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;


public class setup_activity extends AppCompatActivity {
    public static int monthlyPayment;
    public static int monthlySaving;
    public static Boolean busTravel;
    public static Boolean carTravel;
    public static Boolean notAvailable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_activity);

        // Initialising UI elements
        final SeekBar monthlySBar = (SeekBar) findViewById(R.id.seekBar);
        final SeekBar savingSBar = (SeekBar) findViewById(R.id.seekBar2);
        final TextView mnthlyTxtView = (TextView) findViewById(R.id.monthlyTxtView);
        final TextView savingTxtView = (TextView) findViewById(R.id.savingTxtView);
        final Button continueButton = (Button) findViewById(R.id.Btn_Continue);


        monthlySBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int y = seekBar.getProgress();
                mnthlyTxtView.setText(String.valueOf(y));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                monthlyPayment = seekBar.getProgress();
            }
        });


        savingSBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int y = seekBar.getProgress();
                savingTxtView.setText(String.valueOf(y));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                monthlySaving = seekBar.getProgress();
                continueButton.setVisibility(View.VISIBLE);
            }
        });
    }
}


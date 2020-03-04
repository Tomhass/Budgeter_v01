package com.example.budgeter_v01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;


public class setup_activity extends AppCompatActivity {
    public static int monthlyPayment;
    public static int monthlySaving;
    public static Boolean busTravel;
    public static Boolean carTravel;
    public static Boolean notApplicable;


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
        final Switch carTravelSwitch = (Switch) findViewById(R.id.switchCar);
        final Switch busTravelSwitch = (Switch) findViewById(R.id.switchBus);
        final Switch NATravelSwitch = (Switch) findViewById(R.id.switchNA);

        // SEEK BAR LISTENERS
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

        // SWITCH LISTENERS
        carTravelSwitch.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()) {
                    carTravel = true;
                    notApplicable = false;
                    NATravelSwitch.setChecked(false);
                } else {
                    carTravel = false;
                }
            }
        });
        busTravelSwitch.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()) {
                    busTravel = true;
                    notApplicable = false;
                    NATravelSwitch.setChecked(false);
                } else {
                    busTravel = false;
                }
            }
        });
        NATravelSwitch.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()) {
                    notApplicable = true;
                    busTravel = false;
                    carTravel = false;

                    busTravelSwitch.setChecked(false);
                    carTravelSwitch.setChecked(false);
                }
            }
        });

    }
}


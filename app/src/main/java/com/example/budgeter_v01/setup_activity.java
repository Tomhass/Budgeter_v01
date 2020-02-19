package com.example.budgeter_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;


public class setup_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_activity);

        // Variables for seek bar
        final SeekBar monthlySBar = (SeekBar) findViewById(R.id.seekBar);
        final SeekBar savingSBar = (SeekBar) findViewById(R.id.seekBar2);
        final TextView mnthlyTxtView = (TextView) findViewById(R.id.monthlyTxtView);
        final TextView savingTxtView = (TextView) findViewById(R.id.savingTxtView);
        final Button continueButton = (Button) findViewById(R.id.Btn_Continue);



        monthlySBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int x = seekBar.getProgress();
                mnthlyTxtView.setText(String.valueOf(x));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { }
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
                continueButton.setVisibility(View.VISIBLE);
            }
        });
    }

    private void configureContinueBtn() {
        final Button continueButton = (Button) findViewById(R.id.Btn_Continue);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(setup_activity.this, CarTravelActivity.class));
            }
        });
    }
}

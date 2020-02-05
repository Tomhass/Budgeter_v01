package com.example.budgeter_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;

public class setup_activity extends AppCompatActivity {
    private SeekBar monthlySBar;
    private EditText monthlyEditTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_activity);
        monthlySBar = (SeekBar) findViewById(R.id.seekBar);
        monthlyEditTxt = (EditText) findViewById(R.id.MnthlyEditTxt);
        monthlySBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int progressNumber;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // When the value on the seek bar is changed, the value on the associated edit text is also changed
                progressNumber = progress;
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                monthlyEditTxt.setText(progressNumber);
            }
        });
        CurrentUser user = new CurrentUser();

    }

}

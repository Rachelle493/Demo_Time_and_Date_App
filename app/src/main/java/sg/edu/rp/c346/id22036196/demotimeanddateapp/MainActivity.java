package sg.edu.rp.c346.id22036196.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp=findViewById(R.id.datePicker);
        tp=findViewById(R.id.timePicker);
        btnDisplayDate=findViewById(R.id.buttonDisplayDate);
        btnDisplayTime=findViewById(R.id.buttonDisplayTime);
        tvDisplay=findViewById(R.id.textViewDisplay);
        btnReset=findViewById(R.id.buttonReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour = tp.getCurrentHour();
                int minutes = tp.getCurrentMinute();
                tvDisplay.setText("Time is " + hour + ":" + minutes);
            }
        });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int month=dp.getMonth();
                int dayMonth=dp.getDayOfMonth();
                int year=dp.getYear();
                tvDisplay.setText("Date is "+dayMonth+"/"+month+"/"+year+"/");


            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnReset.isClickable()){
                    int hour = tp.getCurrentHour();
                    int minutes = tp.getCurrentMinute();
                    tvDisplay.setText("Time is " + hour + ":" + minutes);
                }


            }
        });


    }



}
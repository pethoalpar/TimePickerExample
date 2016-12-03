package com.pethoalpar.timepickerexamplet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private Button button;
    private TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button = (Button) this.findViewById(R.id.button2);
        timePicker = (TimePicker) this.findViewById(R.id.timePicker);

        timePicker.setIs24HourView(true);
        timePicker.setHour(15);
        timePicker.setMinute(42);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour = timePicker.getHour();
                int minute = timePicker.getMinute();

                Toast.makeText(getBaseContext(),"Hour:"+hour+" Minute:"+minute,Toast.LENGTH_SHORT).show();
            }
        });
    }
}

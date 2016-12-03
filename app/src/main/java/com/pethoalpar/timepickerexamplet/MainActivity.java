package com.pethoalpar.timepickerexamplet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) this.findViewById(R.id.button);
        datePicker = (DatePicker) this.findViewById(R.id.datePicker);

        datePicker.updateDate(2018,01,01);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year = datePicker.getYear();
                int month = datePicker.getMonth();
                int day = datePicker.getDayOfMonth();

                Toast.makeText(getBaseContext(),"Year:"+year+" Month:"+month+"Day:"+day,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getBaseContext(),Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.pert4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;

public class RadioActivity extends AppCompatActivity {
    CheckBox checkbox_cheese, checkbox_meat;
    RadioButton radio_pirates, radio_ninjas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        RadioButton radio_ninjas = findViewById(R.id.radio_ninjas);
        RadioButton radio_pirates = findViewById(R.id.radio_pirates);

        radio_ninjas.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Log.d("RadioButton", "RadioButton 2 is selected");
                }
            }
        });

        radio_pirates.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Log.d("RadioButton","RadioButton1 is selected");
                }
            }
        });

        checkbox_cheese = (CheckBox) findViewById(R.id.checkbox_cheese);
        checkbox_meat = (CheckBox) findViewById(R.id.checkbox_meat);
        checkbox_cheese.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        //logika yang akan dieksekusi saat status checkbox berubah
                        if (isChecked){
                            Log.d("Checkbox", "cheese is ot selected");
                        }
                        else {
                            Log.d("Checkbox","meat is not selected");
                        }
                    }
                }
        );
    }
}
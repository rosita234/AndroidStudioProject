package com.example.pert4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class tugasButtonActivity extends AppCompatActivity {
    RadioButton button_male, button_female;
    CheckBox coding, reading, traveling;

    ImageButton reset_btn, submit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tugas_button);

        coding = (CheckBox) findViewById(R.id.coding);
        reading = (CheckBox) findViewById(R.id.reading);
        traveling = (CheckBox) findViewById(R.id.traveling);

        final EditText nama = findViewById(R.id.username_input);
        final RadioGroup gender = findViewById(R.id.radioGroup);

        ImageButton reset_btn = findViewById(R.id.reset_btn);
        ImageButton submit_btn = findViewById(R.id.submit_btn);

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama.setText("");
                gender.clearCheck();

                coding.setChecked(false);
                reading.setChecked(false);
                traveling.setChecked(false);

                Toast.makeText(tugasButtonActivity.this, R.string.popup_message, Toast.LENGTH_SHORT).show();
            }
        });

        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama.setText("");
                gender.clearCheck();


                coding.setChecked(false);
                reading.setChecked(false);
                traveling.setChecked(false);

                Toast.makeText(tugasButtonActivity.this, R.string.popup_message, Toast.LENGTH_SHORT).show();
            }
        });

        coding.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Log.d("CheckBox", "Hobi yang dipilih adalah Coding");
                }
            }
        });

        RadioButton button_female = findViewById(R.id.button_female);
        RadioButton button_male = findViewById(R.id.button_male);

        button_male.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Log.d("RadioButton","Gender yang dipilih adalah pria");
                }
            }
        });

        button_female.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Log.d("RadioButton","Gender yang dipilih adalah wanita");
                }
            }
        });

    }

}
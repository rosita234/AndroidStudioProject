package com.example.pert4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class toDoList extends AppCompatActivity {

    EditText inputActName;
    RadioButton radioOutdoor, radioIndoor;
    CheckBox chkBox_sport, chkBox_walk, chkBox_eat, chkBox_study;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inputActName = (EditText) findViewById(R.id.inputActName);
        radioOutdoor = (RadioButton) findViewById(R.id.radioOutdoor);
        radioIndoor = (RadioButton) findViewById(R.id.radioIndoor);
        chkBox_sport = (CheckBox) findViewById(R.id.sport);
        chkBox_walk = (CheckBox) findViewById(R.id.walk);
        chkBox_eat = (CheckBox) findViewById(R.id.eat);
        chkBox_study = (CheckBox) findViewById(R.id.study);
        submit = (Button) findViewById(R.id.submit_btn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String act = inputActName.getText().toString();
                String place = "";
                if(radioOutdoor.isChecked()){
                    place = "Luar Ruangan";
                }
                if(radioIndoor.isChecked()){
                    place = "Dalam Ruangan";
                }
                StringBuilder actType = new StringBuilder("\n");
                if (chkBox_sport.isChecked()) {
                    actType.append("- Olahraga\n");
                }
                if (chkBox_walk.isChecked()) {
                    actType.append("- Jalan-Jalan\n");
                }
                if (chkBox_eat.isChecked()) {
                    actType.append("- Makan\n");
                }
                if (chkBox_study.isChecked()) {
                    actType.append("- Belajar\n");
                }
                String message = "Berhasil Disimpan" +
                        "\nNama Kegiatan    : " + act +
                        "\nTempat Kegiatan : " + place +
                        "\nJenis Kegiatan: " + actType.toString();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(toDoList.this, message, duration);
                toast.show();
            }
        });
    }
}
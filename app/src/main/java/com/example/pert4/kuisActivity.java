package com.example.pert4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class kuisActivity extends AppCompatActivity {

    LinearLayout gotoProfil;
    LinearLayout gotoToDo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis1);

        gotoProfil = (LinearLayout) findViewById(R.id.gotoProfil);
        gotoToDo = (LinearLayout) findViewById(R.id.gotoToDo);

        gotoProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kuisActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

        gotoToDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kuisActivity.this, toDoList.class);
                startActivity(intent);
            }
        });
    }
}
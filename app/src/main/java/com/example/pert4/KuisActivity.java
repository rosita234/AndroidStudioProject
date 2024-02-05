package com.example.pert4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class kuisActivity extends AppCompatActivity {

    LinearLayout keProfil;
    LinearLayout keToDo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis1);

        keProfil = (LinearLayout) findViewById(R.id.keProfil);
        keToDo = (LinearLayout) findViewById(R.id.keToDo);

        keProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kuisActivity.this, profilActivity.class);
                startActivity(intent);
            }
        });

        keToDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(kuisActivity.this, TodoListActivity.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.pert4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfilActivity extends AppCompatActivity {

    TextView isiNama;
    TextView isiNIM;
    TextView isiJurusan;
    TextView isiHobi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        isiNama = (TextView) findViewById(R.id.isiNama);
        isiNama.setText("Rosita");
        isiNIM = (TextView) findViewById(R.id.isiNIM);
        isiNIM.setText("03081220014");
        isiJurusan = (TextView) findViewById(R.id.isiJurusan);
        isiJurusan.setText("Sistem Informasi");
        isiHobi = (TextView) findViewById(R.id.isiHobi);
        isiHobi.setText("Mendengarkan musik");
    }
}
package com.example.pert4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity {
    Button supabutton, btnOut;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_button);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        btnOut = (Button) findViewById(R.id.btnOut);
        supabutton = (Button) findViewById(R.id.supabutton);
        supabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("BUTTONS", "Button Supabutton di klik");

                Intent intent =
                        new Intent(ButtonActivity.this, RadioActivity.class);
                startActivity(intent);
            }
        });

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        btnOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // set title dialog
                alertDialogBuilder.setTitle("Keluar dari aplikasi?");

                // set pesan dari dialog
                alertDialogBuilder
                        .setMessage("Klik Ya untuk keluar!")
                        .setIcon(R.mipmap.ic_launcher)
                        .setCancelable(false)
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // jika tombol diklik, maka akan menutup activity ini
                                ButtonActivity.this.finish();
                            }
                        })

                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // jika tombol ini diklik, akan menutup dialog
                                // dan tidak terjadi apa2
                                dialog.cancel();
                            }
                        });

                // membuat alert dialog dari builder
                AlertDialog alertDialog = alertDialogBuilder.create();

                // menampilkan alert dialog
                alertDialog.show();
            }
        });

//        @Override
//        public boolean onOptionsItemSelected(MenuItem item){
//            switch (item.getItemId()) {
//                case R.id.action_settings:
//                    // User chooses the "Settings" item. Show the app settings UI.
//                    return true;
//
//                case R.id.action_favorite:
//                    // User chooses the "Favorite" action. Mark the current item as a
//                    // favorite.
//                    return true;
//
//                default:
//                    // The user's action isn't recognized.
//                    // Invoke the superclass to handle it.
//                    return super.onOptionsItemSelected(item);
//            }
//
//        }
    }
}


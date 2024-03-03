package com.example.pert4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.example.pert4.adapterProduk;
import com.example.pert4.produk;

import java.util.ArrayList;

public class listViewActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<produk> produkArrayList;
    private static adapterProduk adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = (ListView) findViewById(R.id.listView);
        produkArrayList = new ArrayList<>();

        produk product1 = new produk("Kacang Garuda 300g", 30000, R.drawable.garuda);
        produk product2 = new produk("HIT Electric", 20000, R.drawable.hit);
        produk product3 = new produk("Aqua 300ml", 5000, R.drawable.aqua);
        produk product4 = new produk("Pocari Sweat 250ml", 10000, R.drawable.pocari);
        produk product5 = new produk("Indomie Kari Ayam 150g", 3000, R.drawable.indomie);
        produk product6 = new produk("Ultra Milk 500ml", 15000, R.drawable.ultra);
        produk product7 = new produk("Minyak Goreng Sania 2L", 20000, R.drawable.sania);
        produk product8 = new produk("Minyak Goreng Tropical 2L", 20000, R.drawable.tropical);

        produkArrayList.add(product1);
        produkArrayList.add(product2);
        produkArrayList.add(product3);
        produkArrayList.add(product4);
        produkArrayList.add(product5);
        produkArrayList.add(product6);
        produkArrayList.add(product7);
        produkArrayList.add(product8);

        adapter = new adapterProduk(produkArrayList, getApplicationContext());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(
                        listViewActivity.this,
                        "Selected product : " + adapter.getItem(i).getName(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
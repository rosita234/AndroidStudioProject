package com.example.pert4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.pert4.produk;
import com.example.pert4.R;

import java.util.ArrayList;

public class adapterProduk extends ArrayAdapter<produk> {

    private ArrayList<produk> produkArrayList;

    Context context;

    public adapterProduk(ArrayList<produk> produkArrayList, Context context) {
        super(context, R.layout.item_list, produkArrayList);
        this.produkArrayList = produkArrayList;
        this.context = context;
    }

    public adapterProduk(@NonNull Context context, int resource) {
        super(context, resource);
    }

    private static class MyViewHolder {
        ImageView imageProduct;
        TextView textProductName, textProductPrice;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        produk product = getItem(position);

        final View result;
        MyViewHolder myViewHolder;


        if (convertView == null) {

            myViewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list, parent, false);

            myViewHolder.imageProduct = (ImageView) convertView.findViewById(R.id.imageProduct);
            myViewHolder.textProductName = (TextView) convertView.findViewById(R.id.textProductName);
            myViewHolder.textProductPrice = (TextView) convertView.findViewById(R.id.textProductPrice);

            convertView.setTag(myViewHolder);

        } else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }

        result = convertView;
        myViewHolder.imageProduct.setImageResource(product.getPicture());
        myViewHolder.textProductName.setText(product.getName());
        myViewHolder.textProductPrice.setText("IDR. "+ product.getPrice());
        return result;
    }
}


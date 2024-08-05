package com.example.s_shop.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.s_shop.R;
import com.example.s_shop.model.City;

import java.util.List;

public class CityAdapter extends ArrayAdapter<City> {

    public CityAdapter(@NonNull Context context, int resource, @NonNull List<City> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_spinner_selected, parent,false);
        TextView tvSeleted = convertView.findViewById(R.id.tvSeleted);
        City city = this.getItem(position);
        if(city != null) {
            tvSeleted.setText(city.getProvinceName());
        }
        return convertView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_spinner, parent,false);
        TextView tvSpinner = convertView.findViewById(R.id.tvSpinner);
        City city = this.getItem(position);
        if(city != null) {
            tvSpinner.setText(city.getProvinceName());
        }
        return convertView;
    }
}
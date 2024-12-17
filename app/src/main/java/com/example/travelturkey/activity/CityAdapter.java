package com.example.travelturkey.activity;


import android.content.Intent;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.example.travelturkey.data.MainCity;
import com.example.travelturkey.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.CityHolder> {
    ArrayList<City> cityArrayList;

    public CityAdapter(ArrayList<City> cityArrayList) {
        this.cityArrayList = cityArrayList;
    }

    @NonNull
    @Override
    public CityHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new CityHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CityHolder holder, int position) {
        holder.recyclerRowBinding.cityNumber.setText(cityArrayList.get(position).number);
        holder.recyclerRowBinding.mainCityTextView.setText(cityArrayList.get(position).name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                City selectCity = cityArrayList.get(position);
                MainCity.setMainCity(selectCity);
                Intent intent = new Intent(holder.itemView.getContext(), CityInfoActivity.class);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return cityArrayList.size();
    }

    public static class CityHolder extends RecyclerView.ViewHolder{
        RecyclerRowBinding recyclerRowBinding ;
        public CityHolder(RecyclerRowBinding recyclerRowBinding) {
            super(recyclerRowBinding.getRoot());
            this.recyclerRowBinding = recyclerRowBinding;
        }
    }
}

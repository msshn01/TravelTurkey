package com.example.travelturkey.activity;


import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.travelturkey.data.ListTutucu;
import com.example.travelturkey.databinding.ActivityNameCityBinding;

import java.util.ArrayList;

public class NameCityActivity extends AppCompatActivity {
    private ActivityNameCityBinding binding;
    ArrayList<City> mainList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNameCityBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        ListTutucu listTutucu = new ListTutucu();
        mainList = listTutucu.getArrayList();

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CityAdapter cityAdapter = new CityAdapter(mainList);
        binding.recyclerView.setAdapter(cityAdapter);
    }
}
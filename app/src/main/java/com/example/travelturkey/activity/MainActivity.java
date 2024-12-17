package com.example.travelturkey.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

import com.example.travelturkey.data.DataCity;
import com.example.travelturkey.data.ListTutucu;
import com.example.travelturkey.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private String bolgeName;
    private ActivityMainBinding binding;
    ArrayList<City> cityArrayList;
    ArrayList<City> icAnadoluList;
    ArrayList<City> egeList;
    ArrayList<City> marmaraList;
    ArrayList<City> karadenizList;
    ArrayList<City> akdenizList;
    ArrayList<City> doguAnadoluList;
    ArrayList<City> guneyDoguAnadoluList;
    ListTutucu listTutucu;
    Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        icAnadoluList = new ArrayList<>();
        marmaraList = new ArrayList<>();
        doguAnadoluList = new ArrayList<>();
        akdenizList = new ArrayList<>();
        egeList = new ArrayList<>();
        guneyDoguAnadoluList = new ArrayList<>();
        karadenizList = new ArrayList<>();
        cityArrayList = new ArrayList<>();
        dataGet();
        listTutucu = new ListTutucu();
        res = getResources();
    }



    public void dataGet(){
        DataCity dataCity = new DataCity();
        cityArrayList =dataCity.getDataCity(getResources());

        for (City city : cityArrayList){
            if (Objects.equals(city.bolge, "Akdeniz")){
                akdenizList.add(city);
            } else if (Objects.equals(city.bolge, "Guneydogu Anadolu")) {
                guneyDoguAnadoluList.add(city);
            }else if (Objects.equals(city.bolge, "Ege")) {
                egeList.add(city);
            }else if (Objects.equals(city.bolge, "Karadeniz")) {
                karadenizList.add(city);
            }else if (Objects.equals(city.bolge, "Marmara")) {
                marmaraList.add(city);
            }else if (Objects.equals(city.bolge, "Dogu Anadolu")) {
                doguAnadoluList.add(city);
            }else if (Objects.equals(city.bolge, "Ic Anadolu")) {
                icAnadoluList.add(city);
            }
        }

        for (City c : icAnadoluList){
            System.out.println(c.name);
        }
    }



    public void ege(View view){
        Intent intent = new Intent(this, NameCityActivity.class);
        listTutucu.setArrayList(egeList);
        startActivity(intent);
    }

    public void karadeniz(View view){
        Intent intent = new Intent(this,NameCityActivity.class);
        listTutucu.setArrayList(karadenizList);
        startActivity(intent);
    }
    public void akdeniz(View view){
        Intent intent = new Intent(this,NameCityActivity.class);
        listTutucu.setArrayList(akdenizList);
        startActivity(intent);
    }
    public void guneyDoguAnadolu(View view){
        Intent intent = new Intent(this,NameCityActivity.class);
        listTutucu.setArrayList(guneyDoguAnadoluList);
        startActivity(intent);
    }
    public void marmara(View view){
        Intent intent = new Intent(this,NameCityActivity.class);
        listTutucu.setArrayList(marmaraList);
        startActivity(intent);
    }
    public void icAnadalu(View view){
        Intent intent = new Intent(this,NameCityActivity.class);
        listTutucu.setArrayList(icAnadoluList);
        startActivity(intent);
    }
    public void doguAnadolu(View view){
        Intent intent = new Intent(this,NameCityActivity.class);
        listTutucu.setArrayList(doguAnadoluList);
        startActivity(intent);
    }

}
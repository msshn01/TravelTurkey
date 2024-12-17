package com.example.travelturkey.data;




import android.content.res.Resources;

import com.example.travelturkey.activity.City;
import com.example.travelturkey.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class DataCity {

    public ArrayList<City> getDataCity(Resources resources){
        String dataChar ="";
        try {
            // InputStream nesnesi oluştur
            InputStream inputStream = resources.openRawResource(R.raw.citydata);

            int data;
            // Dosyadaki veriyi byte byte oku (-1 sona gelindiğini belirtir)


            while ((data = inputStream.read()) != -1) {
                ;// Byte'ı karaktere dönüştürüp yazdır
                dataChar+=(char) data;
            }
            // Akışı kapat
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] list = dataChar.split("\n");
        System.out.println("--------------------------------");
        ArrayList<City> cityArrayList = new ArrayList<>();
        for (String s : list){
            String[] ak = s.split("#");
            String name = ak[0];
            String number = ak[1];
            String bolge = ak[2];
            String comment = ak[3];
            City city = new City(name,number,comment,bolge);
            cityArrayList.add(city);
        }

        return cityArrayList;
    }
}



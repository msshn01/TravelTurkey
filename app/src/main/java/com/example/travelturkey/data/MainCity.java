package com.example.travelturkey.data;

import com.example.travelturkey.activity.City;

public class MainCity {
    public static City mainCity;

    public static City getMainCity() {
        return mainCity;
    }

    public static void setMainCity(City mainCity) {
        MainCity.mainCity = mainCity;
    }
}

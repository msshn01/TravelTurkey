package com.example.travelturkey.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.travelturkey.data.MainCity;
import com.example.travelturkey.databinding.ActivityCityInfoBinding;
import com.squareup.picasso.Picasso;

public class CityInfoActivity extends AppCompatActivity {
    ActivityCityInfoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCityInfoBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        City mainCity = MainCity.getMainCity();
        binding.commentCity.setText(mainCity.comment);
        binding.nameCity.setText(mainCity.name.toUpperCase());
        binding.mainInCityName.setText(mainCity.name);
        binding.bolgeCity.setText("https://gezimanya.com/search/google?keys=" + mainCity.name);

    }
}
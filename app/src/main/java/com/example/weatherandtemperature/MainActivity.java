package com.example.weatherandtemperature;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button weather;
    private Button temperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weather = findViewById(R.id.weather);
        temperature = findViewById(R.id.temperature);

        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWeather();
            }
        });

        temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTemperature();
            }
        });

    }

    private void openWeather() {
        Intent intent = new Intent(this, WeatherActivity.class);
        startActivity(intent);
    }


    private void openTemperature() {
        Intent intent = new Intent(this, TemperatureActivity.class);
        startActivity(intent);
    }

}

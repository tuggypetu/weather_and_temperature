package com.example.weatherandtemperature;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TemperatureActivity extends AppCompatActivity {

    private Button CtoF, FtoC;
    private TextView result;
    private EditText editTemp;
    double result0;

    private Button home_screen;
    private Button weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        CtoF = findViewById(R.id.CtoF);
        FtoC = findViewById(R.id.FtoC);
        result = findViewById(R.id.result);
        editTemp = findViewById(R.id.editTemp);

        CtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double temp = Double.parseDouble(editTemp.getText().toString());
                    result0 = (temp * 1.8) + 32;
                    result.setText(String.format("%.2f°F", result0));
                }
                catch (Exception e){
                    result.setText(String.valueOf("Enter temperature"));
                }
            }
        });

        FtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double temp = Double.parseDouble(editTemp.getText().toString());
                    result0 = (temp - 32) / 1.8;
                    result.setText(String.format("%.2f°C", result0));
                }
                catch (Exception e){
                    result.setText(String.valueOf("Enter temperature"));
                }
            }
        });

        home_screen = findViewById(R.id.home_screen);
        weather = findViewById(R.id.weather);

        home_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });

        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWeather();
            }
        });

    }

    private void openWeather() {
        Intent intent = new Intent(this, WeatherActivity.class);
        startActivity(intent);
    }

    private void openHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
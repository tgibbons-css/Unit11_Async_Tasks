package edu.css.unit11_async_tasks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvStatus;
    Button btnSynch, btnAsynch;
    WeatherSynch mSynchWeather;
    WeatherAsynch mAsyncWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvStatus = findViewById(R.id.textView);
        btnSynch = findViewById(R.id.buttonSynch);
        btnAsynch = findViewById(R.id.buttonAsynch);
        mSynchWeather = new WeatherSynch();
        mAsyncWeather = new WeatherAsynch();

        btnSynch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                tvStatus.setText("Synch Button Pressed");
                String weather = mSynchWeather.getWeatherSynch();
                tvStatus.setText(weather);
            }
        });

        btnAsynch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                tvStatus.setText("Asynch Button Pressed");
                mAsyncWeather.execute(tvStatus);
                //String weather = mAsyncWeather.getWeatherSynch();
                //tvStatus.setText(weather);
            }
        });

    }
}

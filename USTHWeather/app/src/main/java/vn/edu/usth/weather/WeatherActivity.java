package vn.edu.usth.weather;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";

    private ViewPager viewPager;
    private WeatherPagerAdapter weatherPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i(TAG, "onCreate");


        viewPager = findViewById(R.id.weatherViewPager);
        weatherPagerAdapter = new WeatherPagerAdapter(getSupportFragmentManager());


        weatherPagerAdapter.addFragment(new WeatherAndForecastFragment());
        weatherPagerAdapter.addFragment(new WeatherAndForecastFragment());
        weatherPagerAdapter.addFragment(new WeatherAndForecastFragment());


        viewPager.setAdapter(weatherPagerAdapter);

        viewPager.setOffscreenPageLimit(3);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }
}

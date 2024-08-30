package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;


    public class WeatherActivity extends AppCompatActivity {
        private static final String TAG ="WeatherActivity";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_weather);
            Log.i(TAG, "onCreate");
            if (findViewById(R.id.container) !=null)  {

                if (savedInstanceState != null) {
                    return;
                }
                ForecastFragment forecastFragment = new ForecastFragment();
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container, forecastFragment).commit();
            }
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
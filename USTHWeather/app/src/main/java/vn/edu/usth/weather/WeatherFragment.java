package vn.edu.usth.weather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WeatherFragment extends Fragment {

    private TextView weatherDescription;
    private TextView weatherTemperature;
    private TextView weatherHumidity;
    private ImageView weatherIcon;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the fragment layout for the weather
        View view = inflater.inflate(R.layout.fragment_weather, container, false);

        // Find the views
        weatherDescription = view.findViewById(R.id.weather_description);
        weatherTemperature = view.findViewById(R.id.weather_temperature);
        weatherHumidity = view.findViewById(R.id.weather_humidity);
        weatherIcon = view.findViewById(R.id.weather_icon);

        // Set data (you can replace this with real data from an API or database)
        weatherDescription.setText("Cloudy");
        weatherTemperature.setText("22°C");
        weatherHumidity.setText("Humidity: 55%");
        weatherIcon.setImageResource(R.drawable.weather_cloudy); // Make sure you have the correct drawable

        return view;
    }
}

package vn.edu.usth.weather;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder> {

    // Number of forecast days
    private static final int NUM_DAYS = 7;

    // data for weather conditions
    private String[] weatherConditions = {"Sunny", "Rainy", "Stormy", "Cloudy", "Sunny", "Rainy", "Sunny"};
    private int[] temperatures = {20, 22, 18, 19, 23, 21, 24};
    private int[] windSpeeds = {10, 15, 20, 12, 8, 11, 5};  // Wind speed in km/h
    private int[] humidities = {50, 60, 80, 55, 40, 65, 45}; // Humidity percentage

    @NonNull
    @Override
    public ForecastViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate a view for each forecast day
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.forecast_day_item, parent, false);
        return new ForecastViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ForecastViewHolder holder, int position) {
        // Set the day, temperature, and weather conditions
        holder.dayTextView.setText("Day " + (position + 1));
        holder.tempTextView.setText("Temp: " + temperatures[position] + "°C");
        holder.windTextView.setText("Wind: " + windSpeeds[position] + " km/h");
        holder.humidityTextView.setText("Humidity: " + humidities[position] + "%");

        // Set weather icon based on condition
        switch (weatherConditions[position]) {
            case "Sunny":
                holder.weatherIcon.setImageResource(R.drawable.weather_sunny);
                break;
            case "Rainy":
                holder.weatherIcon.setImageResource(R.drawable.weather_rain);
                break;
            case "Stormy":
                holder.weatherIcon.setImageResource(R.drawable.weather_storm);
                break;
            // Add more conditions as needed
            default:
                holder.weatherIcon.setImageResource(R.drawable.weather);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return NUM_DAYS;  // Return number of forecast days
    }

    static class ForecastViewHolder extends RecyclerView.ViewHolder {
        TextView dayTextView;
        TextView tempTextView;
        TextView windTextView;
        TextView humidityTextView;
        ImageView weatherIcon;

        ForecastViewHolder(View itemView) {
            super(itemView);
            dayTextView = itemView.findViewById(R.id.dayTextView);
            tempTextView = itemView.findViewById(R.id.tempTextView);
            windTextView = itemView.findViewById(R.id.windTextView);
            humidityTextView = itemView.findViewById(R.id.humidityTextView);
            weatherIcon = itemView.findViewById(R.id.weatherIcon);
        }
    }
}

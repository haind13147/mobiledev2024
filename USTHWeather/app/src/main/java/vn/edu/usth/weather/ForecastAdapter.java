package vn.edu.usth.weather;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder> {

    private String[] days;
    private String[] descriptions;
    private String[] temperatures;
    private int[] weatherIcons;

    public ForecastAdapter(String[] days, String[] descriptions, String[] temperatures, int[] weatherIcons) {
        this.days = days;
        this.descriptions = descriptions;
        this.temperatures = temperatures;
        this.weatherIcons = weatherIcons;
    }

    @NonNull
    @Override
    public ForecastViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_forecast, parent, false);
        return new ForecastViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ForecastViewHolder holder, int position) {
        holder.textViewDay.setText(days[position]);
        holder.textViewDescription.setText(descriptions[position]);
        holder.textViewTemperature.setText(temperatures[position]);
        holder.imageViewWeatherIcon.setImageResource(weatherIcons[position]);
    }

    @Override
    public int getItemCount() {
        return days.length;
    }

    public static class ForecastViewHolder extends RecyclerView.ViewHolder {

        TextView textViewDay;
        TextView textViewDescription;
        TextView textViewTemperature;
        ImageView imageViewWeatherIcon;

        public ForecastViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewDay = itemView.findViewById(R.id.textView_day);
            textViewDescription = itemView.findViewById(R.id.textView_weather_description);
            textViewTemperature = itemView.findViewById(R.id.textView_temperature);
            imageViewWeatherIcon = itemView.findViewById(R.id.imageView_weather_icon);
        }
    }
}

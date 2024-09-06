package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {
    // Fragment initialization parameters
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public ForecastFragment() {
        // Required empty public constructor
    }

    public static ForecastFragment newInstance(String param1, String param2) {
        ForecastFragment fragment = new ForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Create a LinearLayout for the forecast area
        LinearLayout forecastLayout = new LinearLayout(getActivity());
        forecastLayout.setOrientation(LinearLayout.VERTICAL);
        forecastLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));

        // Set the background color to blue
        forecastLayout.setBackgroundColor(Color.parseColor("#ADD8E6")); // Light Blue color

        // Example forecast content for one day
        for (int i = 0; i < 7; i++) {
            // Create a horizontal LinearLayout for each day (date + weather icon)
            LinearLayout dayLayout = new LinearLayout(getActivity());
            dayLayout.setOrientation(LinearLayout.HORIZONTAL);
            dayLayout.setPadding(16, 16, 16, 16);  // Add padding for better spacing
            dayLayout.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));

            // Create a TextView for the day
            TextView dayTextView = new TextView(getActivity());
            dayTextView.setText("Day " + (i + 1)); // Example: Day 1, Day 2, etc.
            dayTextView.setTextSize(18);
            dayTextView.setTextColor(Color.BLACK);
            dayTextView.setLayoutParams(new LinearLayout.LayoutParams(
                    0,
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    1.0f // Weight to evenly distribute space
            ));

            // Create an ImageView for the weather icon
            ImageView weatherIcon = new ImageView(getActivity());
            weatherIcon.setImageResource(R.drawable.weather_sunny);  // Replace with your weather icon resource
            weatherIcon.setLayoutParams(new LinearLayout.LayoutParams(
                    100,
                    100
            ));

            // Add the TextView and ImageView to the horizontal layout
            dayLayout.addView(dayTextView);
            dayLayout.addView(weatherIcon);

            // Add the day layout to the forecast layout
            forecastLayout.addView(dayLayout);
        }

        // Return the forecast layout as the fragment's view
        return forecastLayout;
    }
}

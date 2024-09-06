package vn.edu.usth.weather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ForecastFragment extends Fragment {

    public ForecastFragment() {
        // Required empty public constructor
    }

    public static ForecastFragment newInstance() {
        return new ForecastFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // No need to check for arguments since we aren't using any
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_forecast, container, false);

        // Initialize RecyclerView
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view_forecast);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Create the adapter and set it to RecyclerView
        ForecastAdapter forecastAdapter = new ForecastAdapter();
        recyclerView.setAdapter(forecastAdapter);



        return rootView;
    }
}

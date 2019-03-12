package com.example.jsu.lab4b;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class DistanceConverter extends Fragment implements View.OnClickListener {


    public DistanceConverter() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_distance_converter, container, false);
    }

    public void onClick(View v){
        EditText miles = getView().findViewById(R.id.Miles);

        EditText kilom =  getView().findViewById(R.id.Kilometers);

        if(miles.getText().toString().isEmpty()){
            if(!kilom.getText().toString().isEmpty()){
                double km = Double.parseDouble(kilom.getText().toString());
                double mi = km / 1.60934;
                miles.setText(getString(R.string.numberToString, mi));

            }
        }
        else {
            double mi = Double.parseDouble(miles.getText().toString());
            double km = mi * 1.60934;
            kilom.setText(getString(R.string.numberToString, km));
        }
    }
}



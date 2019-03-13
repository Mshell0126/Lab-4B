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
public class TempConverter extends Fragment implements View.OnClickListener {


    public TempConverter() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_temp_converter, container, false);
        Button b = (Button)view.findViewById(R.id.CalculateTempButton); // Acquire button reference
        b.setOnClickListener(this);
        return view;
    }

    public void onClick(View v){
        EditText fahrenheit = getView().findViewById(R.id.Fahrenheit);

        EditText celsius = getView().findViewById(R.id.Celsius);

        if(fahrenheit.getText().toString().isEmpty()){
            if(!celsius.getText().toString().isEmpty()){
                double c = Double.parseDouble(celsius.getText().toString());
                double f = (c * 9 / 5) + 32;
                fahrenheit.setText(getString(R.string.numberToString, f));
            }
        }
        else{
            double f = Double.parseDouble(fahrenheit.getText().toString());
            double c = (f - 32) * 5 / 9;
            celsius.setText(getString(R.string.numberToString, c));
        }

    }

}

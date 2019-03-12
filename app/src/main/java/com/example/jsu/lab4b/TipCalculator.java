package com.example.jsu.lab4b;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import java.text.DecimalFormat;


/**
 * A simple {@link Fragment} subclass.
 */
public class TipCalculator extends Fragment implements View.OnClickListener {


    public TipCalculator() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tip_calculator, container, false);
        ((TextView)view.findViewById(R.id.CalculatedTip)).setText("$");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tip_calculator, container, false);
    }

    public void onClick(View v){


        double total = Double.parseDouble(((EditText)getView().findViewById(R.id.TotalBill)).getText().toString());
        int bills = Integer.parseInt(((EditText)getView().findViewById(R.id.NumberOfPeople)).getText().toString());
        double prcntg = Double.parseDouble(((EditText)getView().findViewById(R.id.TipPercentage)).getText().toString());
        double tip = (total * (prcntg/100) / bills);
        DecimalFormat nearestCent = new DecimalFormat("#.00");
        ((TextView) getView().findViewById(R.id.CalculatedTip)).setText(getString(R.string.MonetarySymbol, nearestCent.format(tip)));
    }


}

package com.example.myapplication;

import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class TemperatureFragment extends Fragment {

    public static TemperatureFragment create(int index){
        TemperatureFragment f = new TemperatureFragment();
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);
        return f;
    }

    public int getIndex(){
        int index = getArguments().getInt("index", 0);
        return index;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ImageView temperature = new ImageView(getContext());
        TypedArray imgs = getResources().obtainTypedArray(R.array.temperature);
        temperature.setImageResource(imgs.getResourceId(getIndex(),-1));
        return temperature;

    }
}
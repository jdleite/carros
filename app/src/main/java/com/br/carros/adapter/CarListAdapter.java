package com.br.carros.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.br.carros.R;
import com.br.carros.entites.Car;
import com.br.carros.listener.OnListClickInteractionListener;
import com.br.carros.viewholder.CarViewHolder;

import java.util.List;

public class CarListAdapter extends RecyclerView.Adapter<CarViewHolder> {

    private List<Car> mListCars;
    private OnListClickInteractionListener mOnListClickInteractionListener;


    public CarListAdapter(List<Car> cars,OnListClickInteractionListener listener) {
        mListCars = cars;
        mOnListClickInteractionListener = listener;

    }


    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View carView = inflater.inflate(R.layout.row_car_list, viewGroup, false);


        return new CarViewHolder(carView);


    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder carViewHolder, int i) {

        Car car = mListCars.get(i);

        carViewHolder.bindData(car,mOnListClickInteractionListener);

    }

    @Override
    public int getItemCount() {

        return mListCars.size();
    }
}

package com.br.carros.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.br.carros.R;
import com.br.carros.entites.Car;
import com.br.carros.listener.OnListClickInteractionListener;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextModel;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);

        mTextModel = (TextView) itemView.findViewById(R.id.text_model);


    }

    public void bindData(final Car car, final OnListClickInteractionListener listener) {
        mTextModel.setText(car.model);
        mTextModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(car.id);
            }
        });

    }

}

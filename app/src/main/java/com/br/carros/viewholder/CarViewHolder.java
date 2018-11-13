package com.br.carros.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.br.carros.R;
import com.br.carros.entites.Car;
import com.br.carros.listener.OnListClickInteractionListener;

public class CarViewHolder extends RecyclerView.ViewHolder {

    private ImageView mImgCarPicture;
    private TextView mTextCarModel;
    private TextView mTextViewDetails;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
        mImgCarPicture = (ImageView) itemView.findViewById(R.id.img_car_pic);
        mTextCarModel = (TextView) itemView.findViewById(R.id.text_car_model);
        mTextViewDetails = (TextView) itemView.findViewById(R.id.text_view_details);


    }

    public void bindData(final Car car, final OnListClickInteractionListener listener) {

        mTextCarModel.setText(car.model);
        mImgCarPicture.setImageDrawable(car.picture);

        mTextViewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(car.id);
            }
        });

    }

}

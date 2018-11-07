package com.br.carros.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.br.carros.R;
import com.br.carros.adapter.contats.CarrosContats;
import com.br.carros.data.CarMock;
import com.br.carros.entites.Car;

public class DetailsActivity extends AppCompatActivity {
    private ViewHolder mViewHolder = new ViewHolder();
    private CarMock mcarMock;
    private Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        mcarMock = new CarMock();

        mViewHolder.textModel = findViewById(R.id.text_model);

        mViewHolder.textHorsePower = findViewById(R.id.text_horse_power);


        mViewHolder.textPrice = findViewById(R.id.text_price);

        getDataFromactivity();
        setData();

    }

    private void setData(){
        mViewHolder.textModel.setText(mCar.model);
        mViewHolder.textHorsePower.setText(String.valueOf(mCar.horsePower));
        mViewHolder.textPrice.setText(String.valueOf(mCar.price));
    }



    private void getDataFromactivity(){
        Bundle extras = getIntent().getExtras();
        if(extras != null){
         mCar =   mcarMock.get(extras.getInt(CarrosContats.CARRO_ID));

        }
    }

    private static class ViewHolder {
        TextView textModel;
        TextView textHorsePower;
        TextView textPrice;
    }
}

package com.br.carros.views;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;



import com.br.carros.R;
import com.br.carros.adapter.CarListAdapter;
import com.br.carros.adapter.contats.CarrosContats;
import com.br.carros.data.CarMock;
import com.br.carros.entites.Car;
import com.br.carros.listener.OnListClickInteractionListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        context = this;

        CarMock carMock = new CarMock(this);

        List<Car> carList = new ArrayList<>();
        carList.addAll(carMock.getList());


        this.mViewHolder.recyclerCars =  this.findViewById(R.id.recycler_cars);

        OnListClickInteractionListener listener = new OnListClickInteractionListener() {
            @Override
            public void onClick(int id) {

                Bundle bundle = new Bundle();
                bundle.putInt(CarrosContats.CARRO_ID,id);

                Intent intent = new Intent(context,DetailsActivity.class);
                intent.putExtras(bundle);

                startActivity(intent);


            }
        };

        CarListAdapter carListAdapter  = new CarListAdapter(carList,listener);

        mViewHolder.recyclerCars.setAdapter(carListAdapter);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mViewHolder.recyclerCars.setLayoutManager(linearLayoutManager);


    }

    private static class ViewHolder{
        RecyclerView recyclerCars;
    }
}

package com.br.carros.data;

import com.br.carros.entites.Car;

import java.util.ArrayList;
import java.util.List;

public class CarMock {

    private List<Car> mListCars;


    public CarMock(){
        mListCars = new ArrayList<>();

        for(int i = 0; i<=100;i++){
            mListCars.add(new Car(i,String.valueOf(i), i*10,Double.valueOf(i *100)));
        }
    }

    public List<Car> getList(){
        return  mListCars;
    }

    public Car get(int id){
        return mListCars.get(id);
    }


}

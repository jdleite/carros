package com.br.carros.data;

import android.app.Activity;
import android.support.v4.content.ContextCompat;

import com.br.carros.R;
import com.br.carros.entites.Car;

import java.util.ArrayList;
import java.util.List;

public class CarMock {

    private List<Car> mListCars;


    public CarMock(Activity activity){
        mListCars = getCarMockList(activity);
    }

    public List<Car> getList(){
        return  mListCars;
    }

    public Car get(int id){
        return mListCars.get(id);
    }

    public List<Car> getCarMockList(Activity activity){
        List<Car> mMocklist = new ArrayList<>();

        int id = 0;
        Car audiR8 = new Car(id, "Audi R8", "Audi", 610, Double.valueOf(1165338.00), ContextCompat.getDrawable(activity, R.drawable.audir8));
        mMocklist.add(audiR8);
        Car bugattiChiron = new Car(++id, "Bugatti Chiron", "Bugatti", 1520, Double.valueOf(1000000.00), ContextCompat.getDrawable(activity, R.drawable.bugattichiron));
        mMocklist.add(bugattiChiron);
        Car civicTypeR = new Car(++id, "Civic Type R", "Honda", 310, Double.valueOf(136000.00), ContextCompat.getDrawable(activity, R.drawable.civictyper));
        mMocklist.add(civicTypeR);
        Car corolla = new Car(++id, "Corolla", "Toyota", 144, Double.valueOf(101000.00), ContextCompat.getDrawable(activity, R.drawable.corolla));
        mMocklist.add(corolla);
        Car ferrari458Italia = new Car(++id, "Ferrari 458 Itália", "Ferrari", 670, Double.valueOf(1500000.00), ContextCompat.getDrawable(activity, R.drawable.ferrari458));
        mMocklist.add(ferrari458Italia);
        Car ferrariF60America = new Car(++id, "Ferrari F60 América", "Ferrari", 700, Double.valueOf(2500000.00), ContextCompat.getDrawable(activity, R.drawable.ferrarif60america));
        mMocklist.add(ferrariF60America);
        Car jaguarFTypeCoupe = new Car(++id, "Jaguar F-Type Coupe", "Jaguar", 340, Double.valueOf(500000.00), ContextCompat.getDrawable(activity, R.drawable.jaguarftype));
        mMocklist.add(jaguarFTypeCoupe);
        Car jeepRenegade = new Car(++id, "Jeep Renegade", "Jeep", 139, Double.valueOf(79000.00), ContextCompat.getDrawable(activity, R.drawable.jeeprenegade));
        mMocklist.add(jeepRenegade);
        Car lamborghiniAventador = new Car(++id, "Lamborghini Aventador", "Lamborghini", 700, Double.valueOf(2800000.00), ContextCompat.getDrawable(activity, R.drawable.lamborghiniaventador));
        mMocklist.add(lamborghiniAventador);
        Car mcLarenMP412C = new Car(++id, "McLaren MP4-12C", "McLaren", 625, Double.valueOf(2200000.00), ContextCompat.getDrawable(activity, R.drawable.mclarenmp412c));
        mMocklist.add(mcLarenMP412C);
        Car mustang = new Car(++id, "Mustang", "Ford", 533, Double.valueOf(270000.00), ContextCompat.getDrawable(activity, R.drawable.mustang));
        mMocklist.add(mustang);
        Car porsche911 = new Car(++id, "Porsche 911", "Porsche", 435, Double.valueOf(509000.00), ContextCompat.getDrawable(activity, R.drawable.porsche911));
        mMocklist.add(porsche911);
        Car rangeRoverEvoque = new Car(++id, "Range Rover Evoque", "Range Rover", 285, Double.valueOf(224000.00), ContextCompat.getDrawable(activity, R.drawable.rangerover));
        mMocklist.add(rangeRoverEvoque);
        Car vanquish = new Car(++id, "Vanquish", "Aston Martin", 573, Double.valueOf(1850000.00), ContextCompat.getDrawable(activity, R.drawable.vanquish));
        mMocklist.add(vanquish);

        return mMocklist;































    }


}

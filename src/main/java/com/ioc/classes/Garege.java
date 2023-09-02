package com.ioc.classes;

public class Garege {

	Car car ;
	
	
	
    public Garege(Car car) {
		super();
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	void park(){
        System.out.println("The "+car.name +" is parked in the Garage");
    }
}


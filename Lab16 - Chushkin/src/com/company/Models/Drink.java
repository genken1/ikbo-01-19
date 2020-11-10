package com.company.Models;

import com.company.Enums.DrinkTypeEnum;
import com.company.Interfaces.Alcoholable;

public final class Drink extends MenuItem implements Alcoholable {
	private double alcoholVol;
	private DrinkTypeEnum type;

	public Drink(double alcoholVol, DrinkTypeEnum type) {
		this.alcoholVol = alcoholVol;
		this.type = type;
	}

	@Override
	public boolean isAlcoholicDrink() {
		return type.isAlcohol();
	}

	@Override
	public double getAlcoholVol() {
		return alcoholVol;
	}
}

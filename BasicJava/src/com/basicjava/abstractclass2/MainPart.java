package com.basicjava.abstractclass2;

public class MainPart {

	public static void main (String args[]){
		StarCar highGrade = new StarCarHighGrade(PriceTable.COLOR_BLUE, PriceTable.TIRE_WILD, PriceTable.DISPLACEMENT_2000, PriceTable.HANDLE_POWER);
		StarCar lowGrade = new StarCarLowGrade(PriceTable.COLOR_Red, PriceTable.TIRE_NORMAL, PriceTable.DISPLACEMENT_1000, PriceTable.HANDLE_NORMAL);
		
		highGrade.getSpec();
		lowGrade.getSpec();
	}
}

package main;

public class Driver extends Car{
	
	public Driver() {}
	
	public void driveCar() {
		Integer newGasAmount = super.getGasAmount() - 1;
		super.setGasAmount(newGasAmount);
		super.status();
	}
}

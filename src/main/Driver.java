package main;

public class Driver extends Car{
	
	public Driver() {}
	
	public void drive() {
		System.out.println("\n --- DRIVING CAR ---");
		Integer newGasAmount = super.getGasAmount() - 1;
		super.setGasAmount(newGasAmount);
		super.status();
		System.out.println("------------------");
	}
	
	public void useBoosters() {
		System.out.println("\n --- USING BOOSTERS ---");
		Integer newGasAmount = super.getGasAmount() - 3;
		super.setGasAmount(newGasAmount);
		super.status();
		System.out.println("------------------");
	}
	
	public void refuel() {
		System.out.println("\n --- REFUELING CAR ---");
		Integer newGasAmount = super.getGasAmount() + 2;
		super.setGasAmount(newGasAmount);
		super.status();
		System.out.println("------------------");
	}
	
	
}

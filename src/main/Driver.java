package main;

public class Driver extends Car{
	
	public Driver() {}
	
	public void drive() {
		System.out.println("\n --- DRIVING CAR ---");
		int currentGasAmount = super.getGasAmount() - 1;
		if (currentGasAmount <= 0) {
			System.out.println("GAME OVER! You're out of fuel ;___;");
		} else {			
			Integer newGasAmount = super.getGasAmount() - 1;
			super.setGasAmount(newGasAmount);
			super.status();
		}
		System.out.println("------------------");
	}
	
	public void useBoosters() {
		System.out.println("\n --- DRIVING CAR ---");
		int currentGasAmount = super.getGasAmount() - 3;
		if (currentGasAmount <= 0) {
			System.out.println("GAME OVER! You're out of fuel ;___;");
		} else {			
			Integer newGasAmount = super.getGasAmount() - 3;
			super.setGasAmount(newGasAmount);
			super.status();
		}
		System.out.println("------------------");
	}
	
	public void refuel() {
		System.out.println("\n --- REFUELING CAR ---");
		Integer currentGasAmount = super.getGasAmount();
		if (currentGasAmount > 8) {
			System.out.println("No need to refuel! Your tank is more than half full.");
		} else {
			Integer newGasAmount = super.getGasAmount() + 2;
			super.setGasAmount(newGasAmount);
			super.status();
		}
		System.out.println("------------------");
	}
	
	
}

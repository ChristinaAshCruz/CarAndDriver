package main;

public class Car {
	private Integer gasAmount = 10;
	
	public Car() {}
	
	public void status() {
		System.out.println("Gas remaining: " + gasAmount + "/10");
	}
	
	public Integer getGasAmount() {
		return gasAmount;
	}

	public void setGasAmount(Integer gasAmount) {
		this.gasAmount = gasAmount;
	};
	
	
	
	
}

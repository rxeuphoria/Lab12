
public class UsedCar extends Car {
	
	private int mileage;
	
	public UsedCar(String make, String model, int year, double price, int mileage) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.mileage = mileage;
	}
	
	public UsedCar() {
		
	}
	
	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "UsedCar [mileage=" + mileage + ", getMake()=" + getMake() + ", getModel()=" + getModel()
				+ ", getYear()=" + getYear() + ", getPrice()=" + getPrice() + "]";
	}

	
	
		
	
}

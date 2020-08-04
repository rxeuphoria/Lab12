import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class CarApp {
	
	public static Scanner scnr = new Scanner(System.in);
	public static List<Car> garage = new ArrayList<>();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char quit = 'y';
		System.out.println("Welcome.  Please leave your car information at the desk.");
		while (quit == 'y') {
			addCar();
			System.out.println("Do you have another car to drop off? Enter y or yes to continue.");
			quit = scnr.next().charAt(0);
			scnr.nextLine();
		}
		
		System.out.println("Here's what you've dropped off.");
		System.out.println("Make \t\tModel \t\tYear \t\tPrice");
		listGarage();
	}
	
	public static void addCar() {
		
		Car car = new Car();
		
		System.out.println("Make:  ?");
			car.setMake(scnr.nextLine());
		System.out.println("Model:  ?");
			car.setModel(scnr.nextLine());
		System.out.println("Year:  ?");
			car.setYear(scnr.nextInt());
		System.out.println("Price:  ?");
			car.setPrice(scnr.nextDouble());
		scnr.hasNextLine();
		
		garage.add(car);
	}
	
	public static void listGarage () {
		
		for (Car car : garage)  {
			System.out.println(car.getMake() + "\t\t" + car.getModel() + "\t\t" + car.getYear() + "\t\t" + car.getPrice());

		}
	}

}

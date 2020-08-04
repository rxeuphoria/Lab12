import java.util.ArrayList;
import java.util.Scanner;

public class CarLot {
	
	public static Scanner scnr = new Scanner(System.in);
	public static ArrayList<Car> carLot = new ArrayList<>();
	public static UsedCar used1 = new UsedCar("Chevy", "S-10", 2002, 2500.0, 224654);
	public static UsedCar used2 = new UsedCar("Honda", "Accord", 2008, 4700.0, 191987);
	public static UsedCar used3 = new UsedCar("Ford", "Focus", 2005, 2200.0, 243900);
	public static Car fresh1 = new Car("Ford", "F-150", 2020, 28745.0);
	public static Car fresh2 = new Car("Chevy", "Malibu", 2020, 28295.0);
	public static Car fresh3 = new Car("Ford", "Escape", 2020, 24885.0);
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carLot.add(used1);
		carLot.add(used2);
		carLot.add(used3);
		carLot.add(fresh1);
		carLot.add(fresh2);
		carLot.add(fresh3);
		System.out.println("Welcome to the Car Lot! Buy your car using the numbers on the menu.");
		char quit = 'y';
		while ((quit == 'y') && (carLot.size() != 0)) {
		System.out.println("Make\t\tModel\t\tYear\t\tMileage\t\tPrice");
		System.out.println("========================================================================");
		listCarLot();
		buyCar();
		System.out.println("Do you wish to purchase another car? (yes/no)");
		quit = scnr.next().charAt(0);
		scnr.nextLine();
		}
		
		
		System.out.println("Thanks for your patronage!");
		
	}
	
public static void listCarLot () {
		
		for (Car car : carLot)  {
			if (car instanceof UsedCar) {
			System.out.println((carLot.indexOf(car)+1) + "." + car.getMake() + "\t\t" + car.getModel() + "\t\t" + car.getYear() + "\t\t" + ((UsedCar)car).getMileage() + "\t\t" + car.getPrice());
			} else {
			System.out.println((carLot.indexOf(car)+1) + "." + car.getMake() + "\t\t" + car.getModel() + "\t\t" + car.getYear() + "\t\t" + 0 + "\t\t" + car.getPrice());
			}
		}
	}

public static void buyCar () {
	int selection = scnr.nextInt();
	carLot.remove(selection-1);
}


}

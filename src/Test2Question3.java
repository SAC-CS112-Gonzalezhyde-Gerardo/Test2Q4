import java.util.Scanner;

public class Test2Question3 {
	public static void main (String[] args)
	{
		int choice;
		String choice2;
		Scanner input = new Scanner(System.in);
		Test2Question2side Truck = new Test2Question2side(3);
		System.out.print("Enter in your car year : ");
		choice = input.nextInt();
		Truck.CarYear(choice);
		System.out.print("Enter in your car make : ");
		choice2 = input.next();
		Truck.CarMake(choice2);
		System.out.print("Enter in your car model : ");
		choice2 = input.next();
		Truck.CarModel(choice2);
		System.out.print("Enter in your car color : ");
		choice2 = input.next();
		Truck.SetColor(choice2);
		System.out.print("Enter in your car name : ");
		choice2 = input.next();
		Truck.SetName(choice2);
		System.out.print("Enter how many dice to roll : ");
		choice = input.nextInt();
		Truck.CarCycles(choice);
		Truck.CurrentGear(choice);
		
		System.out.println("Your current speed is " + Truck.speed());
		System.out.println("The distance you traveled was " + Truck.distance() + "miles.");
		
		Test2Question2side Van = new Test2Question2side(4);
		System.out.print("Enter in your car year : ");
		choice = input.nextInt();
		Van.CarYear(choice);
		System.out.print("Enter in your car make : ");
		choice2 = input.next();
		Van.CarMake(choice2);
		System.out.print("Enter in your car model : ");
		choice2 = input.next();
		Van.CarModel(choice2);
		System.out.print("Enter in your car color : ");
		choice2 = input.next();
		Van.SetColor(choice2);
		System.out.print("Enter in your car name : ");
		choice2 = input.next();
		Van.SetName(choice2);
		System.out.print("Enter how many dice to roll : ");
		choice = input.nextInt();
		Van.CarCycles(choice);
		Van.CurrentGear(choice);

		System.out.println("Your current speed is " + Van.speed());
		System.out.println("The distance you traveled was " + Van.distance() + "miles.");

		Test2Question2side Sport = new Test2Question2side(6);
		System.out.print("Enter in your car year : ");
		choice = input.nextInt();
		Sport.CarYear(choice);
		System.out.print("Enter in your car make : ");
		choice2 = input.next();
		Sport.CarMake(choice2);
		System.out.print("Enter in your car model : ");
		choice2 = input.next();
		Sport.CarModel(choice2);
		System.out.print("Enter in your car color : ");
		choice2 = input.next();
		Sport.SetColor(choice2);
		System.out.print("Enter in your car name : ");
		choice2 = input.next();
		Sport.SetName(choice2);
		System.out.print("Enter how many dice to roll : ");
		choice = input.nextInt();
		Sport.CarCycles(choice);
		Sport.CurrentGear(choice);

		System.out.println("Your current speed is " + Sport.speed());
		System.out.println("The distance you traveled was " + Sport.distance() + "miles.");

	}
}
//end of main program





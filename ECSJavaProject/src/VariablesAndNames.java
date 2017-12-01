
public class VariablesAndNames 
{

	public static void main(String[] args)
	{
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car;
			//number of cars
			cars = 100;
			//amount of space per car
			space_in_a_car = 4.0;
			//number of drivers 
			drivers = 30;
			//number of passengers 
			passengers = 90;
			//number of cars not driven is equal to cars - the number of drivers
			cars_not_driven = cars - drivers;
			//vice versa
			cars_driven = drivers;
			//the cars driven multiplied to the space in a car is equal to the car's space
			carpool_capacity = cars_driven * space_in_a_car;
			average_passengers_per_car = passengers / cars_driven;
				System.out.println( "There are " + cars + " cars availible." );
				System.out.println( "There are only " + drivers + " drivers availible." );
				System.out.println( "There will be " + cars_not_driven +  " empty cars today." );
				System.out.println( "We can transport " + carpool_capacity + " people today." );
				System.out.println( "We have " + passengers + " to carpool today." );
				System.out.println( "we need to put about " + average_passengers_per_car + " in each car." );
			
					//If you just put 4 instead of 4.0 the answers don't change. The difference between = and == is that == is an equal to operator, 
					//while = just assigns an expression to a variable.
	}
}
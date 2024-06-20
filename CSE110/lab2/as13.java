public class as13{
    public static void main(String[] args) {

        int distance = 1347; // last 4 digits of student ID is 1347
			     //
        int timeInMinutes = 5 * 60 + 56; // convert time to minutes
        int timeInSeconds = timeInMinutes * 60 + 23; // convert time to seconds

        double totalSeconds = (double) timeInSeconds;

        double velocityMetersPerSecond = (double) distance / totalSeconds;

        double velocityKmph = velocityMetersPerSecond * 3.6; // convert meters per second to km per hour
							     //
        double velocityMph = velocityMetersPerSecond * 2.0 / 1.60934; // convert meters per second to miles per hour
								      //
								      //
								      //
        System.out.println("Your velocity in km/h is " + velocityKmph+ " km/h");
        System.out.println("Your velocity in miles/h is " + velocityMph+" miles/h");
    }
}

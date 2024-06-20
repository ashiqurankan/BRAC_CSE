public class as7{
    public static void main(String[] args) {

        int minutes = 24301347; 

        int days = minutes / 1440; // 1440 minutes in a day
				   
        int remainingMinutes = minutes % 1440;

        int years = days / 365; // 365 days in a year
				//
        int remainingDays = days % 365;

        System.out.println(minutes + " minutes is equal to = "+ years + " year(s) and " + remainingDays + " day(s)");
    }
}

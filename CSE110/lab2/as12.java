public class as12{
    public static void main(String[] args) {


        int studentId = 24301347;


        int last2 = (studentId % 100); // last two digits


        System.out.println(last2 % 10); // print the second rightmost digit
        System.out.println(last2 / 10); // print the first rightmost digit
    }
}

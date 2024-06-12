public class as14{
    public static void main(String[]args){
        int a = 5 ; //radius of the circle
        int c = 4 ; // one side of a square 

        double circleArea = 3.1416* a * a ;
        double sqrArea = c * c ;

        double greenPart = circleArea - sqrArea ;

        System.out.println("The area of green portion : "+ greenPart + " sq.unit");
    }
}
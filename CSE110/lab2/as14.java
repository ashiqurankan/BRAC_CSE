import java.lang.Math;

public class as14{
    public static void main(String[] args) {


        // Given a and b
        double a = 16;
        double b = 6;

        double s = b * 2; // side s length

        double circumference = 6 * s;  // circumference

        double area = (3 * Math.sqrt(3) / 2) * (s * s); // area 

        System.out.println("Circumference of the hexagon = " + circumference+" units");
        System.out.println("Area of the hexagon = " + area+ " units");
    }
}


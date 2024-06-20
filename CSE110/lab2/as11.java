import java.lang.Math;

public class as11{
    public static void main(String[] args) {

        // Given a and b
        double a = 4.5;
        double b = 9.5;

        double c = Math.sqrt(a * a + b * b); // value of c

        // Calculate sin and cos for angle A
        double sinA = a / c;
        double cosA = b / c;

        // Calculate sin and cos for angle B
        double sinB = b / c;
        double cosB = a / c;

        System.out.println("Sin(A) = " + sinA);
        System.out.println("Cos(A) = " + cosA);
        System.out.println("Sin(B) = " + sinB);
        System.out.println("Cos(B) = " + cosB);
    }
}


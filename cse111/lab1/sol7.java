import java.util.*;

public class sol7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double arr[]= new double[n];
        double[] newArray = new double[n];

        int count = 0;
        int removedCount = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }     

        for (int i = 0; i < n; i++){
            if (i == 0 || arr[i] != arr[i - 1]){
                newArray[count] = arr[i];
                count++;
            } else {
                removedCount++;
            }
        }

        System.out.println("New array: ");

        for (int i = 0; i < count; i++){
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        System.out.println("Elements removed: " + removedCount);
        sc.close();
    }
}
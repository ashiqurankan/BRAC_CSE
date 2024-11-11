import java.util.*;

public class sol6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int numbers[] = new int[n];
        boolean[] counted = new boolean[n]; 

        for (int i = 0; i < n ; i++){
            numbers[i] = sc.nextInt( );
        }

        for (int i = 0; i < n ; i++){
            if(!counted[i]){ 
                int count = 1; 
                for(int j = i + 1 ; j < n ;  j++){
                    if(numbers[i] == numbers[j]){
                        count++;
                        counted[j] = true; 
                    }
                }

                System.out.println(numbers[i] + " - " + count + " time(s)");
            }
        }
        sc.close();
    }
}
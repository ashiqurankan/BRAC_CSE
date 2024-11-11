import java.util.*;

public class sol1{
        public static void main(String[]args){

                Scanner input = new Scanner(System.in);

                int numberOfInput = 10;
                double arr[] = new double[numberOfInput];
               
                for(int i = 0 ; i < numberOfInput; i++){
                        arr[i] = input.nextDouble();
                }
                //System.out.println(Arrays.toString(arr));

                double max = 0 ; 
                double min = arr[0]; 
                boolean oddcheck = false;
                double sum = 0;
                int oddcount = 0;
                
                for(int i = 0 ; i < numberOfInput ; i++){
                        if(arr[i] > 0 && arr[i]%2 !=0){
                                oddcheck = true;
                                oddcount++;
                                sum+= arr[i];
                                if(arr[i] > max){
                                        max = arr[i];
                                }
                                if(arr[i] < min){
                                        min = arr[i];
                                }
                        }
                }
                double average = sum/oddcount;

                if(oddcheck){
                        System.out.println("sum: "+ sum);
                        System.out.println("max: "+max);                              
                        System.out.println("min: "+min);
                        System.out.println("Average: "+average);
                }else{
                        System.out.println("no positive odd numbers found");
                }                

                input.close();
        }
}
import java.util.*;

public class sol2{

        public static boolean isPrime(int a){
                for(int i = 2 ; i < a ; i++){
                        if(a%i == 0){
                                return false;
                        }
                }
                return true;
        }

        public static void main(String[]args){
                Scanner prime = new Scanner(System.in);

                System.out.print("Enter the first number: ");
                int first = prime.nextInt();
                System.out.print("Enter the last number: ");
                int last = prime.nextInt();

                int primeCount = 0 ;

                if(first < last){
                        for(int i=first; i <=last ; i++){
                                if(isPrime(i)){
                                        primeCount++;
                                }
                        }
                        System.out.println("There are "+primeCount+" prime numbers between "+first+" and "+last);        

                }else{
                        for(int i=last; i <=first ; i++){
                                if(isPrime(i)){
                                        primeCount++;
                                }
                        }
                        System.out.println("There are "+primeCount+" prime numbers between "+last+" and "+first);
        
                }
                prime.close();
        }
}
import java.util.*;

public class sol3{
        public static void main(String[]args){

                Scanner ascii = new Scanner(System.in);
                String first = ascii.next();
                String second = ascii.next();

                String concated = first + " "+second ;
                int sum = 0 ;

                System.out.println(concated);

                for(int i = 0 ; i < concated.length(); i++){
                        char a = concated.charAt(i);
                        if( a >= 'a' && a <= 'z' || a>='A' && a<='Z'){
                                sum += (int)a ;
                        }
                }
                System.out.println(sum);

                ascii.close();



        }
}
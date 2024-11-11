import java.util.*;

public class sol4{
        public static void main(String[]args){
                Scanner back1 = new Scanner(System.in);

                System.out.print("Enter a seq: ");
                String given =back1.next();

                for(int i = 0 ; i <given.length(); i++ ){
                        char a =given.charAt(i);

                        if( a == 'a'){
                                System.out.print("z");
                        }else{
                                int b = ((int)a)-1;
                                char c = (char)b;
                                System.out.print(c);
                                
                        }
                       
                }
                System.out.println();

        }
}
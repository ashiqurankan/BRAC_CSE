public class as10{
    public static void main(String[]args){
        int a = 2 ; //first term 
        int n = 20 ; // number of terms
        int d = 3 ; //common differnce 

        int nth_term = a + (n - 1)*d ;
        
        System.out.println("The "+ n +"th term of the sequence is: "+ nth_term);
    }
}
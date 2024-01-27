import java.util.*;
public class factorial{

    public static int facto(int n){
        int f=1;
        for(int i=1;i<=n; i++){
            f=f*i;
            //System.out.println(f);
        }
        return f;
    }
    public static void main(String args[]){

       Scanner scan = new Scanner (System.in);

        System.out.println("enter a number for facto");
        int n = scan.nextInt();
        System.out.println(facto(n));
        System.out.println("...............THANK YOU..................");

    }
}

















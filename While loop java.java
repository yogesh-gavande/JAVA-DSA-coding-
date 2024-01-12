// program to sum of n number

import java . util.*;
class inputer{
    public static  void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println(" Enter a Number ");
        int n =scan.nextInt();
        int sum=0;
        int i=1;
     while(i<=n){
            sum=sum+i;
             i++;

        }
        System.out.println("sum = " + sum);

    }
}

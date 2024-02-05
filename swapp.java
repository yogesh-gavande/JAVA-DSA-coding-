public class swapp {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b= temp;
        System.out.println(a);
        System.out.println(b);



    }
    public static void main(String[] args) {

        int a=12;
        int b=14;
        swap(12,14);
    }
}

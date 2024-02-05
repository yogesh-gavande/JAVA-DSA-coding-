public class overloading {
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a, int b,int c){
        return a+b+c;
    }
    public static float add (float a, float b){
        return a+b;

    }
    public static void main(String[] args) {
        int a=12;
        int b = 14;
        int c =17;
        int sum;
        sum=add(a,b);
        System.out.println(sum);
        System.out.println(add(a,b,c));



    }
}

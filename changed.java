public class changed {
    public static int mul(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int add(int a, int b) {
        int addition = a + b;
        return addition;

    }

    public static int sub(int a, int b) {
        int subtract = a - b;
        return subtract;
    }

    public static void main(String[] args) {

        int a = 17;
        int b = 14;
        int prod = mul(a, b);
        int minus;
        minus = sub(a, b);
        int plus;
        plus= add(a,b);
        System.out.println(prod +" multiplacation");
        System.out.println(minus +" subtraction");
        System.out.println(plus + " addition");

    }
}


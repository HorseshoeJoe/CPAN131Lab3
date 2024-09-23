public class MethodLab {
    //Hello, world!
    public void sayHello() {
        System.out.println("Hello, world!");
    }

    //define calculateSum
    public int calculateSum(int a, int b) {
        return a + b;
    }

    //define isEven
    public boolean isEven(int num) {
        return num % 2 == 0;
    }


    public static void main(String[] args) {
        MethodLab lab = new MethodLab();
    
    //call sayHello
    lab.sayHello();

    //call calculateSum
    int sum = lab.calculateSum(48, 21);    
        System.out.println("The sum of 48 and 21 is " + sum);    

    //cal isEven
    int num1 = 6;
    int num2 = 9;
    System.out.println(num1 + " is even: " + lab.isEven(num1));
    System.out.println(num2 + " is even: " + lab.isEven(num2));
    }

    
}

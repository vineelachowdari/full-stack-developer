// 2)Create a Java class MathOperations with overloaded methods for addition (add) that can accept two integers, three doubles, and two strings, respectively. Demonstrate the usage of these methods in the main method by adding two integers, three doubles, and concatenating two strings.

public class MathOperations{

    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b, double c){
        return a + b + c;
    }
    
    public String add(String a, String b){
        return a + b;
    }

    public static void main(String[] args){
        MathOperations op = new MathOperations();
        int sumInt = op.add(40, 30);
        System.out.println("Sum of two integers: " + sumInt);
        double sumDouble = op.add(17.9, 40.12, 17.31);
        System.out.println("Sum of three doubles: " + sumDouble);
        String concatenatedString = op.add("Hello, ", "How are you?!");
        System.out.println("Concatenation of two strings: " + concatenatedString);
    }
}
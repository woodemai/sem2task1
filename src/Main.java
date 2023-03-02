public class Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(2, 1);
        ComplexNumber number2 = new ComplexNumber(2, 3.5);
        System.out.println("The number: " + number1);
        System.out.println("Cos: " + number1.getCos());
        System.out.println("Sin: " + number1.getSin());
        System.out.println("Module: " + number1.getModule());
        System.out.println("Linked: " + number1.getLinked());
        System.out.println("Addition: " + number1.add(number2));
        System.out.println("Subtraction: " + number1.subtract(number2));
        System.out.println("Multiplication: " + number1.multiply(number2));
        System.out.println("Division: " + number1.divide(number2));

    }
}

public class Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(2, 1);
        ComplexNumber number2 = new ComplexNumber(2, -1);
        ComplexNumber number3 = ComplexNumber.division(number1, number2);
        System.out.println(number3);
    }
}
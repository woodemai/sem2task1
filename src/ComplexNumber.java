public class ComplexNumber {
    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public String toString() {
        if (imaginary > 0) {
            return real + " + " + imaginary + "i";
        } else if (imaginary == 0) {
            return Double.toString(real);
        }
        return real + " - " + Math.abs(imaginary) + "i";

    }

    public static ComplexNumber addition(ComplexNumber number1, ComplexNumber number2) {
        double real = number1.getReal() + number2.getReal();
        double imaginary = number1.getImaginary() + number2.getImaginary();
        return new ComplexNumber(real, imaginary);
    }

    /**
     * @param minuend    - уменьшаемое
     * @param deductible - вычитаемое
     * @return - разность
     */
    public static ComplexNumber subtraction(ComplexNumber minuend, ComplexNumber deductible) {
        double real = minuend.getReal() - deductible.getReal();
        double imaginary = minuend.getImaginary() - deductible.getImaginary();
        return new ComplexNumber(real, imaginary);
    }

    public static ComplexNumber multiplication(ComplexNumber number1, ComplexNumber number2) {
        double real = (number1.getReal() * number2.getReal()) + (number1.getImaginary() * number2.getImaginary() * -1);
        double imaginary = (number1.getReal() * number2.getImaginary()) + (number1.getImaginary() * number2.getReal());
        return new ComplexNumber(real, imaginary);
    }

    /**
     *
     * @param divisible - делимое
     * @param divider - делитель
     * @return - частное
     */
    public static ComplexNumber division(ComplexNumber divisible, ComplexNumber divider) {
        ComplexNumber linked = new ComplexNumber(divider.getReal(), divider.getImaginary());
        linked.setImaginary(linked.getImaginary() * (-1));
        ComplexNumber numerator = multiplication(divisible, linked);
        ComplexNumber denominator = multiplication(divider, linked);
        double intDenominator = denominator.getReal() + denominator.getImaginary();
        return new ComplexNumber(numerator.getReal()/intDenominator, numerator.getImaginary()/intDenominator);

    }
}

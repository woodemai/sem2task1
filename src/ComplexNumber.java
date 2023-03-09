public class ComplexNumber {
    private final double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getModule() {
        return Math.sqrt((real * real) + (imaginary * imaginary));
    }


    public double getReal() {
        return real;
    }


    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexNumber getCos() {
        return ComplexMath.getCos(this);
    }

    public ComplexNumber getSin() {
        return ComplexMath.getSin(this);
    }
    public ComplexNumber getCh() {
        return ComplexMath.getCh(this);
    }
    public ComplexNumber getSh() {
        return ComplexMath.getSh(this);
    }

    public String toString() {
        if (imaginary > 0) {
            return real + " + " + imaginary + "i";
        } else if (imaginary == 0) {
            return Double.toString(real);
        }
        return real + " - " + Math.abs(imaginary) + "i";

    }

    public ComplexNumber getLinked() {
        return new ComplexNumber(real, imaginary * (-1));
    }

    public ComplexNumber add(ComplexNumber number) {
        double anotherReal = this.real + number.getReal();
        double anotherImaginary = this.imaginary + number.getImaginary();
        return new ComplexNumber(anotherReal, anotherImaginary);
    }

    public ComplexNumber subtract(ComplexNumber number) {
        double anotherReal = this.real - number.getReal();
        double anotherImaginary = this.imaginary - number.getImaginary();
        return new ComplexNumber(anotherReal, anotherImaginary);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        double anotherReal = (real * number.getReal()) + (imaginary * number.getImaginary());
        double anotherImaginary = (real * number.getImaginary()) + (imaginary * number.getReal());
        return new ComplexNumber(anotherReal, anotherImaginary);
    }

    public ComplexNumber divide(ComplexNumber number) {
        ComplexNumber numerator = multiply(getLinked());
        ComplexNumber denominator = number.multiply(getLinked());
        double intDenominator = denominator.getReal() + denominator.getImaginary();
        return new ComplexNumber(numerator.getReal() / intDenominator, numerator.getImaginary() / intDenominator);

    }
}

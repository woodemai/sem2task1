public class ComplexNumber {
    private double real;
    private double imaginary;
    private double module;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
        this.module = Math.sqrt((real * real) + (imaginary * imaginary));
    }

    public double getModule() {
        return module;
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

    public double getCos() {
        return real / getModule();
    }

    public double getSin() {
        return imaginary / getModule();
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
        real += number.getReal();
        imaginary += number.getImaginary();
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber subtract(ComplexNumber number) {
        real -= number.getReal();
        imaginary -= number.getImaginary();
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        real = (real * number.getReal()) + (imaginary * number.getImaginary());
        imaginary = (real * number.getImaginary()) + (imaginary * number.getReal());
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber divide(ComplexNumber number) {
        ComplexNumber numerator = multiply(getLinked());
        ComplexNumber denominator = number.multiply(getLinked());
        double intDenominator = denominator.getReal() + denominator.getImaginary();
        return new ComplexNumber(numerator.getReal() / intDenominator, numerator.getImaginary() / intDenominator);

    }
}

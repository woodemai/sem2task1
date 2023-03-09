public class ComplexMath {
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
        ComplexNumber linked = divider.getLinked();
        ComplexNumber numerator = multiplication(divisible, linked);
        ComplexNumber denominator = multiplication(divider, linked);
        double intDenominator = denominator.getReal() + denominator.getImaginary();
        return new ComplexNumber(numerator.getReal()/intDenominator, numerator.getImaginary()/intDenominator);

    }
    public static ComplexNumber getCos(ComplexNumber number) {
        double real = Math.cos(number.getReal())*Math.cosh(number.getImaginary());
        double imaginary =  (-1) * Math.sin(number.getReal()) * Math.sinh(number.getImaginary());
        return new ComplexNumber(real, imaginary);
    }

    public static ComplexNumber getSin(ComplexNumber number) {
        double real =Math.sin(number.getReal())*Math.cosh(number.getImaginary());
        double imaginary =Math.cos(number.getReal()) * Math.sinh(number.getImaginary());
        return new ComplexNumber(real, imaginary);
    }
    public static ComplexNumber getCh(ComplexNumber number) {
        double real =Math.cosh(number.getReal())*Math.cos(number.getImaginary());
        double imaginary =Math.sinh(number.getReal()) * Math.sin(number.getImaginary());
        return new ComplexNumber(real, imaginary);
    }
    public static ComplexNumber getSh(ComplexNumber number) {
        double real =Math.sinh(number.getReal())*Math.cos(number.getImaginary());
        double imaginary =Math.cosh(number.getReal()) * Math.sin(number.getImaginary());
        return new ComplexNumber(real, imaginary);
    }
}

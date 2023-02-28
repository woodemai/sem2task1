public class ComplexNumber {
    private int real;
    private int imaginary;

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }
    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber addition(ComplexNumber number1, ComplexNumber number2) {
        int real = number1.getReal() + number2.getReal();
        int imaginary = number1.getImaginary() + number2.getImaginary();
        return new ComplexNumber(real, imaginary);
    }

    /**
     *
     * @param minuend - уменьшаемое
     * @param deductible - вычитаемое
     * @return - разность
     */
    public ComplexNumber subtraction(ComplexNumber minuend, ComplexNumber deductible) {
        int real = minuend.getReal() - deductible.getReal();
        int imaginary = minuend.getImaginary() - deductible.getImaginary();
        return new ComplexNumber(real, imaginary);
    }
}

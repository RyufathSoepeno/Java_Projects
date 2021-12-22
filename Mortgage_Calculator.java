import java.lang.Math;
import java.text.NumberFormat;

public class Mortgage_Calculator {
    public static void main(String args[]){
        double Principal = 200000;
        double NumberOfPayments = 60;
        double Interest = 3.92/100;

        double numerator_1 = 1 + Interest;
        double numerator_2 = Math.pow(numerator_1, NumberOfPayments);
        double numerator_3 = Interest*numerator_2;

        double denominator_1 = 1 + Interest;
        double denominator_2 = Math.pow(denominator_1, NumberOfPayments);
        double denominator_3 = denominator_2 - 1;

        double Fractions = numerator_3/denominator_3;
        double Mortgage = Principal*Fractions;

        System.out.println("$" + Mortgage);
        // Using "dollars" because this is american calculation, Indonesia is different so no Number Formats is needed
    }
}

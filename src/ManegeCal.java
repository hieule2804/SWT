
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ADMIN
 */
public class ManegeCal {

    Utility utility = new Utility();

    public ManegeCal() {
    }

    void menu() {
        System.out.println("========= Equation Program =========\n"
                + "1. Calculate Superlative Equation\n"
                + "2. Calculate Quadratic Equation\n"
                + "3. Exit\n"
                + "Please choice one option:");
    }

    boolean checkOdd(double a) {
        if (a % 2 != 0) {
            return true;
        }
        return false;
    }

    boolean checkEven(double a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

  public static boolean isPerfectSquare(double num) {
        if (num < 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
printNumber print =new printNumber();

    void superLaTive() {
        double a = utility.InputDiff0("Enter A: ", "please input number", Integer.MIN_VALUE, Integer.MAX_VALUE);
        double b = utility.InputInt("Enter B: ", "please input number", Integer.MIN_VALUE, Integer.MAX_VALUE);
        double result = -b / a;
        System.out.println("Solution: x = " + result);
        double[] arrayDouble = {a, b, result};
        List<Double> numberOdd = new ArrayList<>();
        List<Double> numberEven = new ArrayList<>();
        List<Double> numberFerfect = new ArrayList<>();

        for (int i = 0; i < arrayDouble.length; i++) {
            if (checkOdd(Math.abs(arrayDouble[i])) == true) {
                numberOdd.add(arrayDouble[i]);
            }
        }
        for (int i = 0; i < arrayDouble.length; i++) {
            if (checkEven(Math.abs(arrayDouble[i])) == true) {
                numberEven.add(arrayDouble[i]);
            }
        }
        for (int i = 0; i < arrayDouble.length; i++) {
            if (isPerfectSquare(Math.abs(arrayDouble[i])) == true) {
                numberFerfect.add(arrayDouble[i]);
            }
        }
        print.printOdd("Number is odd:", numberOdd);
        System.out.println();
       print.printOdd("Number is Even:", numberEven);
        System.out.println();
        print.printOdd("Number is Perfect Number:", numberFerfect);
        System.out.println();
    }

    void Quadratic() {
        double a = utility.InputDiff0("Enter A: ", "please input number", Integer.MIN_VALUE, Integer.MAX_VALUE);
        double b = utility.InputInt("Enter B: ", "please input number", Integer.MIN_VALUE, Integer.MAX_VALUE);
        double c = utility.InputInt("Enter C: ", "please input number", Integer.MIN_VALUE, Integer.MAX_VALUE);
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Solutions: x1 = " + x1 + ", x2 = " + x2);
            double[] arrayDouble = {a, b, c, x1, x2};
            List<Double> numberOdd = new ArrayList<>();
            List<Double> numberEven = new ArrayList<>();
            List<Double> numberFerfect = new ArrayList<>();
           for (int i = 0; i < arrayDouble.length; i++) {
            if (checkOdd(Math.abs(arrayDouble[i])) == true) {
                numberOdd.add(arrayDouble[i]);
            }
        }
        for (int i = 0; i < arrayDouble.length; i++) {
            if (checkEven(Math.abs(arrayDouble[i])) == true) {
                numberEven.add(arrayDouble[i]);
            }
        }
        for (int i = 0; i < arrayDouble.length; i++) {
            if (isPerfectSquare(Math.abs(arrayDouble[i])) == true) {
                numberFerfect.add(arrayDouble[i]);
            }
        }
        print.printOdd("Number is odd:", numberOdd);
        System.out.println();
       print.printOdd("Number is Even:", numberEven);
        System.out.println();
        print.printOdd("Number is Perfect Number:", numberFerfect);
        System.out.println();

        }
 if (discriminant == 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Solutions: x1 = x2" + x1 );
            double[] arrayDouble = {a, b, c, x1};
            List<Double> numberOdd = new ArrayList<>();
            List<Double> numberEven = new ArrayList<>();
            List<Double> numberFerfect = new ArrayList<>();
            for (int i = 0; i < arrayDouble.length; i++) {
            if (checkOdd(Math.abs(arrayDouble[i])) == true) {
                numberOdd.add(arrayDouble[i]);
            }
        }
        for (int i = 0; i < arrayDouble.length; i++) {
            if (checkEven(Math.abs(arrayDouble[i])) == true) {
                numberEven.add(arrayDouble[i]);
            }
        }
        for (int i = 0; i < arrayDouble.length; i++) {
            if (isPerfectSquare(Math.abs(arrayDouble[i])) == true) {
                numberFerfect.add(arrayDouble[i]);
            }
        }
        print.printOdd("Number is odd:", numberOdd);
        System.out.println();
       print.printOdd("Number is Even:", numberEven);
        System.out.println();
        print.printOdd("Number is Perfect Number:", numberFerfect);
        System.out.println();
        }
 else if(discriminant <0)
 {
     System.out.println("Dont have Solution!!");
     double[] arrayDouble = {a, b, c};
            List<Double> numberOdd = new ArrayList<>();
            List<Double> numberEven = new ArrayList<>();
            List<Double> numberFerfect = new ArrayList<>();
            for (int i = 0; i < arrayDouble.length; i++) {
            if (checkOdd(Math.abs(arrayDouble[i])) == true) {
                numberOdd.add(arrayDouble[i]);
            }
        }
        for (int i = 0; i < arrayDouble.length; i++) {
            if (checkEven(Math.abs(arrayDouble[i])) == true) {
                numberEven.add(arrayDouble[i]);
            }
        }
        for (int i = 0; i < arrayDouble.length; i++) {
            if (isPerfectSquare(Math.abs(arrayDouble[i])) == true) {
                numberFerfect.add(arrayDouble[i]);
            }
        }
        print.printOdd("Number is odd:", numberOdd);
        System.out.println();
       print.printOdd("Number is Even:", numberEven);
        System.out.println();
        print.printOdd("Number is Perfect Number:", numberFerfect);
        System.out.println();
        
    }

}
}

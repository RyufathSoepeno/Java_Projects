import java.lang.Math;
public class BMI_Calculator {
    public static void main(String args[]) {

        String Name_1 = "Franklin";
        double height_1 = 2;
        double weight_1 = 90;

        String Name_2 = "Michael";
        double height_2 = 1.8;
        double weight_2 = 70;

        String Name_3 = "Trevor";
        double height_3 = 2.5;
        double weight_3 = 160;

        double bmi_1 = weight_1 / (Math.pow(height_1, 2));
        System.out.println("bmi : ");
        System.out.println(bmi_1); {
            if (bmi_1 < 25){
                System.out.println(Name_1 + " is not overweight");
            }
            else {
                System.out.println(Name_1 + " is overweight");
            }
        }

        double bmi_2 = weight_2 / (Math.pow(height_2, 2));
        System.out.println("bmi : ");
        System.out.println(bmi_2); {
            if (bmi_2 < 25){
                System.out.println(Name_2 + " is not overweight");
            }
            else {
                System.out.println(Name_2 + " is overweight");
            }
        }

        double bmi_3 = weight_3 / (Math.pow(height_3, 2));
        System.out.println("bmi : ");
        System.out.println(bmi_3); {
            if (bmi_3 < 25){
                System.out.println(Name_3 + " is not overweight");
            }
            else {
                System.out.println(Name_3 + " is overweight");
            }
        }
    }
}
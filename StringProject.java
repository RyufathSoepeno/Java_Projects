import java.util.Scanner;
public class Module5 {
    public static void main(String[] args) {
        System.out.println("Exercise1:");
        System.out.println("\n1.read a radius of a cycle as a floating point value from a user entry. ");
        System.out.println("Enter radius:");
        Scanner user = new Scanner(System.in);

        float entry = user.nextFloat();
        System.out.println("\nThe radius is: " + entry);



        System.out.println("\n2.prints area and perimeter (circum-ference) with 3 decimal point.");
        float area = (22 * entry * entry)/7;
        float perimeter = (2 * 22 * entry)/7;

        System.out.println("\nThe area is:");
        System.out.format("%.3f", area);
        System.out.println("\nThe perimeter is:");
        System.out.format("%.3f", perimeter);


        System.out.println("\n\nExercise2: ");

        /** Fill in the blanks in the program below as follows:

         -declare the variables university as a reference to a String object and initialize it to “Sampoerna University” and town to “Jakarta, Indonesia“ respectively.
         -write an assignment statement that invokes the length method of the string class to find the length of the university String object and assigns the result to the stringLength variable
         -complete the assignment statement so that change1 contains the same characters as university but all in upper case
         -complete the assignment statement so that change2 is the same as change1 except all capital O's are replaced with the asterisk (*) character.
         -complete the assignment statement so that change3 is the concatenation of college and town (use the concat method of the String class rather than the + operator)
         -print change1, change2 and change3.
         */

        String University = "Sampoerna University", Town = "Jakarta, Indonesia";
        int LengthOfString = University.length();
        String change1 = University.toUpperCase();
        String change2 = change1.replace('O', '*');
        String change3 = University.concat(Town);

        System.out.println("Change 1 --> " + change1);
        System.out.println("Change 2 --> " + change2);
        System.out.println("Change 3 --> " + change3);
    }
}

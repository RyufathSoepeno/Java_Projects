import java.util.Scanner; // To declare scanner

/** For this program, we would need to import the scanenr package, to receive input from the user */

public class SecondsToHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); /// To declare/call scanner variable
        System.out.print("Please input the number of seconds: ");
        int Inputted_Scanner = input.nextInt();
        int Seconds = Inputted_Scanner % 60;
        int Hours = Inputted_Scanner / 60;
        int Minutes = Hours % 60;
        Hours = Hours / 60;
        System.out.print(Inputted_Scanner + " seconds is equal to " + Hours + ":" + Minutes + ":" + Seconds);
    }
}

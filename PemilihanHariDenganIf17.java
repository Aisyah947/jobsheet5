import java.util.Scanner;

public class PemilihanHariDenganIf17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number (1-7): ");
        int dayNumber = sc.nextInt();
        String dayType;

        if (dayNumber >= 1 && dayNumber <= 5) {
            dayType = "Weekday";
        } else if (dayNumber == 6 || dayNumber == 7) {
            dayType = "Weekend";
        } else {
            dayType = "Invalid Number";
        }

        System.out.println(dayNumber + " is a " + dayType);
    }
}
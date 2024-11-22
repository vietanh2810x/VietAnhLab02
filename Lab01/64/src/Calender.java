import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = -1, days = -1;
        String monthInput;
        String[] months = { "January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December" };
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        while (days == -1) {
            System.out.print("Enter month: ");
            monthInput = sc.nextLine().trim();
            System.out.print("Enter year: ");
            year = sc.hasNextInt() ? sc.nextInt() : -1;
            sc.nextLine();
            if (year < 0 || year > 9999) {
                System.out.println("Invalid year! Try again.");
                continue;
            }

            int monthIndex = getMonthIndex(monthInput, months);
            if (monthIndex != -1) {
                days = daysInMonth[monthIndex];
                if (monthIndex == 1 && isLeapYear(year)) days = 29;
                System.out.println("Days: " + days);
            } else {
                System.out.println("Invalid month! Try again.");
            }
        }
        sc.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getMonthIndex(String input, String[] months) {
        try {
            int monthNum = Integer.parseInt(input);
            if (monthNum >= 1 && monthNum <= 12) return monthNum - 1;
        } catch (NumberFormatException ignored) {}

        for (int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(input) || months[i].substring(0, 3).equalsIgnoreCase(input)) {
                return i;
            }
        }
        return -1;
    }
}
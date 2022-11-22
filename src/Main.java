import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("WriTe days of WEEK:");
            String name = scanner.nextLine();
            switch (name){
                case "MONDAY":
                    Week week = Week.MONDAY;
                    System.out.println(week);
                    break;
                case "TUESDAY":
                    Week week3 = Week.TUESDAY;
                    System.out.println(week3);
                    break;
                case "WEDNESDAY":
                    Week week1 = Week.WEDNESDAY;
                    System.out.println(week1);
                    break;
                case "THURSDAY":
                    Week week4 = Week.THURSDAY;
                    System.out.println(week4);
                    break;
                case "FRIDAY":
                    Week week2 = Week.FRIDAY;
                    System.out.println(week2);
                    break;
                case "SATURDAY":
                    Week week5 = Week.SATURDAY;
                    System.out.println(week5);
                    break;
                case "SUNDAY":
                    Week week6 = Week.SUNDAY;
                    System.out.println(week6);
                default:
                    System.out.println("Please enter correct information");
            }

        }

    }

}
package chapter3;

import java.util.Scanner;

public class HeartRateTestObject {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HeartRate heartRate = new HeartRate("joy", "joseph", 24,   "july", + 1999);

        System.out.println("Enter your first name : ");
        String firstname = scanner.nextLine();
        heartRate.setName(firstname);

        System.out.println("Kindly enter your surname: ");
        String surname = scanner.nextLine();
        heartRate.setSurname(surname);

        System.out.println("kindly enter your birthday date :");
        int dateOfBirth = scanner.nextInt();
        heartRate.setDateOfBirth(dateOfBirth);

        System.out.println("kindly enter your birthday month in words : ");
        String monthOfBirthday = scanner.next();
        heartRate.setMonthOfBirth(monthOfBirthday);

        System.out.println("Kindly enter your year of birth : ");
        int yearOfBirth = scanner.nextInt();
        heartRate.setYearOfBirth(yearOfBirth);
        System.out.println("Enter current year: ");
        int year = scanner.nextInt();
       heartRate.caculateAgeInyears(year);
        heartRate.maximumHeartRate();
        System.out.println("Kindly confirm your Detail : ");
        System.out.println();
        System.out.printf("Name : %s %s%n", heartRate.getSurname(), heartRate.getFirstname());
        System.out.printf("%s %d %s %d%n", "Date of Birth : ", heartRate.getDateOfBirth(), heartRate.getMonthOfBirth(), heartRate.getYearOfBirth());
        System.out.printf("Current Age In Year : %d%n", heartRate.caculateAgeInyears(year));
        System.out.printf("Maximum Heart rate : %f%n ", heartRate.maximumHeartRate());
        System.out.println();
        System.out.println(" Moderate intensity Physical activity is between 50% and 65%");
        System.out.println("For vigorous intesity excersice is within 70% && 85%");

        System.out.println("Enter your  desire training intesity : ");
        double excersise = scanner.nextInt();

        heartRate.targetHeartRate(excersise);

       System.out.println("Enter second desire training intesity: ");
        double excerise2 = scanner.nextInt();
        heartRate.targetHeartRate(excerise2);

        System.out.println();

        System.out.printf("Your target heart rate is %.2fbmp - %.2fbmp%n" ,heartRate.targetHeartRate(excersise), heartRate.targetHeartRate(excerise2) );


    }
}

package PROJECT;



//Main class
import java.io.*;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import static PROJECT.CarInMain.carInMain.*;


public class Main {


    public static void main(String[] args) {


        Object[][] obj = new Object[5][4];
        int i = 0;
        System.out.println("1. Log in");
        System.out.println("2. Sign up");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        if (in == 1) {
            login();
        } else if (in == 2) {
            Signup();
            System.out.println("You Sign up successfully.\nTry to log in with your account.");
            login();
        }


        String Date = String.valueOf(LocalDate.now());
        System.out.println(Date);
        rule();
        System.out.println("Thank you for trusting us.");
        System.out.println("We have many car brands and you can choose one of them.They are ");
        back();

        String license = "";
        String l = validLicense(license);

        String address = "";
        String a = validAddress(address);
        System.out.print("Enter your phone number : +66 ");
        int phone = scanner.nextInt();
        System.out.println();
        System.out.println("How many days do you want to rent?");
        int days = scanner.nextInt();
        double totalPrice = days*p;
        System.out.println("Total price : " + totalPrice);

        long receipt = password.hashCode() + username.hashCode();

            System.out.println("Here is the receipt.");
            try {
                FileWriter info = new FileWriter("D:\\oodp.txt");
                obj[i][0] = username;
                obj[i][1] = password;
                obj[i][2] = GetLine;
                obj[i][3] = totalPrice;
                i++;
                info.append("username : " +username + "\t password : " + password +"\t Car info : " + GetLine + "\t Receipt no : " + receipt);
                info.close();
                System.out.println("Something was written successfully.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        System.out.println("\t\t\tCar Rental Receipt");
        Random random = new Random();
        System.out.println("Date : " + Date);
        System.out.println("Receipt# " + receipt);
        System.out.println();
        System.out.println("Name: " + username);
        System.out.println("License No. " + l);
        System.out.println("Address : " + a);
        System.out.println("Phone No. : " + phone);
        System.out.println();
        System.out.println("Car Info =>  " + GetLine);
        System.out.println("Total price : " + totalPrice);


        System.out.println("\tThank you");

    }

    private static String validLicense(String license) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your license number : ");
        license = scanner.nextLine();
        if (license.length() != 8) {
            validLicense(license);
        } else {
            return license;
        }
        return "";
    }
    public static String validAddress(String address){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your address : ");
        // scanner.next();
         address = scanner.nextLine();
         return address;

    }


}

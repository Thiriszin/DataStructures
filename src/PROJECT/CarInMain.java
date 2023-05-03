package PROJECT;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class CarInMain {

    public static class carInMain {
        public static String GetLine = "";
        public static double p;


        public static Hashtable<String,String> login = new Hashtable<>();
        static String password ;
        static String username ;
        static void login(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter username : ");
            String user = scanner.nextLine();
            System.out.println("Enter your password : ");
            String pw = scanner.nextLine();
            if(pw.equals(login.get(user))){
                System.out.println("Log in successful");
            }else{
                System.out.println("Username and password are incorrect.\n 1. Try to log in again. or choose 2. To Sign up.");
                int check = scanner.nextInt();
                if(check == 1) {
                    login();
                }else if(check == 2){
                    Signup();
                }


            }
        }


        static void Signup(){
            Scanner scanner= new Scanner(System.in);
            System.out.print("Enter username : ");
            username = scanner.nextLine();
            System.out.print("Enter password : ");
            password = scanner.nextLine();
            login.put(username,password);
            try {
                FileWriter writer = new FileWriter(new File("D:\\Java Programming\\Java\\DataStructures\\DataStructures\\src\\PROJECT\\Login Info.txt"));
                writer.write(username + username.hashCode() + password + password.hashCode() );
            } catch (FileNotFoundException e) {

                System.out.println(e.getMessage());

            } catch (IOException e) {

                System.out.println(e.getMessage());

            }
        }




        public static void H(){
            File honda = new File("Honda.txt");
            System.out.println(honda.exists());
            try {
                BufferedReader Honda = new BufferedReader(new FileReader(honda));
                String line = "";
                while((line = Honda.readLine()) != null){
                    System.out.println(line);
                }


            }catch(FileNotFoundException e){


                System.out.println(e.getMessage());


            } catch (IOException e) {


                System.out.println(e.getMessage());;
            }
        }
        public static void HinMain() {


            HondaCarList h = new HondaCarList("", 0, 0);
            h.HondaI();
            h.hondaCar();
        }


        public static void TinMain() {


            ToyotaCarList t = new ToyotaCarList("", 0, 0.00);
            t.ToyotaI();
            t.ToyotaCar();
        }


        public static void SinMain() {
            SuzukiCarList s = new SuzukiCarList("", 0, 0.00);
            s.SuzukiI();
            s.SuzukiCar();
        }


        public static void BinMain() {
            BMWCarList n = new BMWCarList("", 0, 0.00);
            n.BMWI();
            n.BMWCar();
        }


        public static void MinMain() {
            MitsubishiCarList m = new MitsubishiCarList("", 0, 0.00);
            m.MitsubishiI();
            m.MitsubishiCar();


        }


        public static void rule() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Rules and regulations.\n1. The renter is responsible for filling the gas tank before returning the car, or may face a surcharge for refueling by the rental company.\n" +
                    "2. The rental agreement will specify the terms of use, including mileage limitations and insurance coverage.\n" +
                    "3. The renter is responsible for returning the car in the same condition as when it was rented, and may face additional fees or charges for violations of the rental agreement.\nDo you accept our policies.\n1.accept\t2.decline\nChoose 1 or 2 : ");
            int rule = scanner.nextInt();
            try {
                if (rule != 1) {
                    System.out.println("We respect your choice ...");
                    return ;
                }
            } catch (Exception e) {
                System.out.println("Please select 1 or 2 .");
            }
        }
        public static void BrandChoice(int choice){


            if( choice == 1){
                HinMain();
                //H();
            }else if(choice == 2){
                TinMain();
            } else if (choice == 3) {
                SinMain();
            } else if (choice == 4) {
                BinMain();
            }else if (choice == 5){
                MinMain();
            }
        }
        public static void CinMain() {


            ArrayList<String> c = new ArrayList<>();
            c.add("Honda");
            c.add("Toyota");
            c.add("Suzuki");
            c.add("BMW");
            c.add("Mitsubishi");
            for (int i = 0; i < c.size(); i++) {
                System.out.println(i + 1 + " " + c.get(i));
            }


        }
        public static void CarChoose(int C,int back){


            switch(C){
                case 1:
                    HondaFile(back);
                    break;
                case 2:
                    ToyotaFile(back);
                    break;
                case 3:
                    SuzukiFile(back);
                    break;
                case 4:
                    BMWFile(back);
                    break;
                case 5:
                    MitsubishiFile(back);
                    break;


            }


        }


        public static void back(){


            Scanner scanner = new Scanner(System.in);
            CinMain();
            System.out.print("Choose the number you want to choose : ");
            int carBrand = scanner.nextInt();
            BrandChoice(carBrand);
            System.out.println("11. Back to menu");
            System.out.println("Which car do you want to choose?");
            int back = scanner.nextInt();
            if (back == 11 ){
                back();
            }else{
                CarChoose(carBrand,back);
            }
        }
        public static void HondaFile(int choose){


            try {
                BufferedReader file = new BufferedReader(new FileReader("D:\\Java Programming\\Java\\DataStructures\\DataStructures\\src\\PROJECT\\Honda.txt"));
                int i = 0;String line = "line";
                while( i < choose){
                    line = file.readLine();
                    i++;
                }
                GetLine = line;
                System.out.println(line);
              //  System.out.println(GetPrice(line));
                //System.out.println(GetName(line));
                GetPrice(line);
                GetName(line);


            }catch(Exception e){


                System.out.println(e.getMessage());


            }


        }
        public static void ToyotaFile(int choose){


            try {
                BufferedReader file = new BufferedReader(new FileReader("D:\\Java Programming\\Java\\DataStructures\\DataStructures\\src\\PROJECT\\Toyota.txt"));
                int i = 0;String line = "line";
                while( i < choose){
                    line = file.readLine();
                    i++;
                }
                GetLine = line;
                System.out.println(line);
              //  System.out.println(GetPrice(line));
                //System.out.println(GetName(line));
                GetPrice(line);
                GetName(line);


            }catch(Exception e){


                System.out.println(e.getMessage());


            }


        }
        public static void SuzukiFile(int choose){


            try {
                BufferedReader file = new BufferedReader(new FileReader("D:\\Java Programming\\Java\\DataStructures\\DataStructures\\src\\PROJECT\\Suzuki.txt"));
                int i = 0;String line = "line";
                while( i < choose){
                    line = file.readLine();
                    i++;
                }
                GetLine = line;
                System.out.println(line);
              //  System.out.println(GetPrice(line));
               // System.out.println(GetName(line));
                GetPrice(line);
                GetName(line);




            }catch(Exception e){


                System.out.println(e.getMessage());


            }


        }
        public static void BMWFile(int choose){


            try {
                BufferedReader file = new BufferedReader(new FileReader("D:\\Java Programming\\Java\\DataStructures\\DataStructures\\src\\PROJECT\\BMW.txt"));
                int i = 0;String line = "";
                while( i < choose){
                    line = file.readLine();
                    i++;
                }
                GetLine = line;
                System.out.println(line);
               // System.out.println(GetPrice(line));
                //System.out.println(GetName(line));
                GetPrice(line);
                GetName(line);


            }catch(Exception e){


                System.out.println(e.getMessage());


            }
        }
        public static void MitsubishiFile(int choose){


            try {
                BufferedReader file = new BufferedReader(new FileReader("D:\\Java Programming\\Java\\DataStructures\\DataStructures\\src\\PROJECT\\Mitsubishi.txt"));
                int i = 0;String line = "line";
                while( i < choose){
                    line = file.readLine();
                    i++;
                }
                GetLine = line;
                System.out.println(line);
                GetPrice(line);
                GetName(line);


            }catch(Exception e){


                System.out.println(e.getMessage());


            }
        }


        public static void GetPrice(String line){


            char[] array = line.toCharArray();
            String price = "";
            int start = array.length;
            int end = array.length;
            price = line.substring(array.length-6, array.length);
            p = Double.parseDouble(price);
          //  return p;
        }
        public static void GetName(String line){


            String[] parts = line.split("\t");
            String name = parts[0];
           // return name;
        }


    }


}


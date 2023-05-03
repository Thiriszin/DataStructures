package PROJECT;
import java.util.*;

public class CarList {
    public String model;
    public int seat;
    public double price;
    public CarList(){


    }
    public CarList(String model , int seat , double price) {
        this.model = model;
        this.seat = seat;
        this.price = price;
    }


}
class HondaCarList extends CarList {
    Collection<CarList> honda;


    public HondaCarList(String model, int seat, double price) {
        super(model, seat, price);
    }
    public void HondaI(){
        honda = new Vector<>();
        honda.add(new HondaCarList("Civic\t", 5, 1100));
        honda.add(new HondaCarList("Accord\t", 5, 100));
        honda.add(new HondaCarList("HR-V\t", 5, 900));
        honda.add(new HondaCarList("CR-V\t", 5, 900));
        honda.add(new HondaCarList("Pilot\t", 7, 1500));
        honda.add(new HondaCarList("Odyssey", 7, 1500));
        honda.add(new HondaCarList("Ridgeline", 5, 1000));
        honda.add(new HondaCarList("Insight", 5, 1000));
        honda.add(new HondaCarList("Clarity", 5, 1000));
        honda.add(new HondaCarList("Passport", 5, 1000));
    }


    public void hondaCar() {
        int i = 1 ;
        for (CarList c : honda) {
            System.out.println( i + "\tHonda : " + c.model + " \tseat: " + c.seat + "\t\tprice per day : " + c.price);
            i++;
        }
    }
}
class ToyotaCarList extends CarList {
    Collection<CarList> toyota;


    public ToyotaCarList(String model, int seat, double price) {
        super(model, seat, price);
    }
    public void ToyotaI(){
        toyota = new Vector<>();


        toyota.add(new ToyotaCarList("Corolla", 5, 1200));
        toyota.add(new ToyotaCarList("Camry\t", 5, 1100));
        toyota.add(new ToyotaCarList("RAV4\t", 5, 1000));
        toyota.add(new ToyotaCarList("Highlander", 7, 1500));
        toyota.add(new ToyotaCarList("Sienna\t", 8, 1800));
        toyota.add(new ToyotaCarList("Tacoma\t", 4, 1000));
        toyota.add(new ToyotaCarList("Tundra\t", 6, 1200));
        toyota.add(new ToyotaCarList("4Runner", 7, 1500));
        toyota.add(new ToyotaCarList("Prius\t", 5, 1000));
        toyota.add(new ToyotaCarList("C-HR\t", 5, 1000));
    }


    public void ToyotaCar() {
        int i =1;
        for (CarList c : toyota) {
            System.out.println( i + "\tToyota : " + c.model + "\t\tseat: " + c.seat + "\t\tprice per day : " + c.price);
            i++;
        }




    }


}
class SuzukiCarList extends CarList {
    Collection<CarList> suzuki;


    public SuzukiCarList(String model, int seat, double price) {
        super(model, seat, price);
    }
    public void SuzukiI(){
        suzuki = new Vector<>();
        suzuki.add(new SuzukiCarList("Swift\t", 5, 1000));
        suzuki.add(new SuzukiCarList("Vitara", 5, 1100));
        suzuki.add(new SuzukiCarList("Jimny\t", 4, 900));
        suzuki.add(new SuzukiCarList("Baleno", 5, 1000));
        suzuki.add(new SuzukiCarList("Celerio", 5, 1000));
        suzuki.add(new SuzukiCarList("Ignis\t", 5, 1000));
        suzuki.add(new SuzukiCarList("S-Cross", 5, 1000));
        suzuki.add(new SuzukiCarList("Kizashi", 5, 1000));
        suzuki.add(new SuzukiCarList("SX4\t", 5, 1000));
        suzuki.add(new SuzukiCarList("Ertiga", 7, 1500));
    }


    public void SuzukiCar() {
        int i = 1;
        for (CarList c : suzuki) {
            System.out.println( i + "\tSuzuki : " + c.model + " \tseat: " + c.seat + "\t\tprice per day : " + c.price);
            i++;
        }


    }


}
class BMWCarList extends CarList {
    Collection<CarList> bmw;




    public BMWCarList(String model, int seat, double price) {
        super(model, seat, price);
    }
    public void BMWI(){
        bmw = new Vector<>();
        bmw.add(new BMWCarList("3-series", 5, 1200));
        bmw.add(new BMWCarList("5-series", 5, 1500));
        bmw.add(new BMWCarList("X1\t", 5, 1400));
        bmw.add(new BMWCarList("X3\t", 5, 1200));
        bmw.add(new BMWCarList("X5\t", 5, 1200));
        bmw.add(new BMWCarList("X6\t", 5, 1200));
        bmw.add(new BMWCarList("7-Series", 5, 1200));
        bmw.add(new BMWCarList("i3\t", 5, 1200));
        bmw.add(new BMWCarList("2-Series", 5, 1200));
        bmw.add(new BMWCarList("Z4\t", 5, 1200));
    }


    public void BMWCar() {
        int i = 1;
        for (CarList c : bmw) {
            System.out.println(i + "\tBMW : " + c.model + " \t\tseat: " + c.seat + "\t\tprice per day : " + c.price);
            i++;
        }




    }


}
class MitsubishiCarList extends CarList {
    Collection<CarList> mitsubishi;


    public MitsubishiCarList(String model, int seat, double price) {
        super(model, seat, price);
    }
    public void MitsubishiI(){
        mitsubishi = new Vector<>();
        mitsubishi.add(new MitsubishiCarList("Mirage\t\t\t", 5, 1200));
        mitsubishi.add(new MitsubishiCarList("Eclipse\t\t", 5, 1000));
        mitsubishi.add(new MitsubishiCarList("Outlander\t\t", 7, 1600));
        mitsubishi.add(new MitsubishiCarList("Outlander-Sport", 5, 1000));
        mitsubishi.add(new MitsubishiCarList("ASX\t\t\t", 5, 1000));
        mitsubishi.add(new MitsubishiCarList("Pajero\t\t\t", 7, 1600));
        mitsubishi.add(new MitsubishiCarList("Lancer\t\t\t", 5, 1200));
        mitsubishi.add(new MitsubishiCarList("Galant\t\t\t", 5, 1100));
        mitsubishi.add(new MitsubishiCarList("i-MiEV\t\t\t", 4, 800));
        mitsubishi.add(new MitsubishiCarList("Trito\t\t\t", 5, 1000));
    }


    public void MitsubishiCar() {
        int i = 1;
        for (CarList c : mitsubishi) {
            System.out.println( i + "\tMitsubishi : " + c.model + " \tseat: " + c.seat + "\t\tprice per day : " + c.price);
            i++;
        }
    }


}

import java.util.ArrayList;

//Write a Java program to test an array list is empty or not. Define array list with
//underground tube names
public class Que5 {
    public static void main(String[] args) {
        Que5 q=new Que5();
        q.TubeNames();

    }
    public void TubeNames(){
        ArrayList<String> ugTrains=new ArrayList<>();
        ugTrains.add("Northen line ");
        ugTrains.add("Metropolitan line ");
        ugTrains.add("Jubliee line ");
        ugTrains.add("Piccadilly line ");
        ugTrains.add("Victoria line ");
        ugTrains.add("Central line ");
        System.out.println("Tube names of London underground " + ugTrains);
        System.out.println(ugTrains.size());
        System.out.println("Checking the Array list is Empty? = " + ugTrains.isEmpty());
        ugTrains.clear();
       System.out.println("Tube names of London underground " + ugTrains);
       System.out.println("Checking the Array list is Empty? = " + ugTrains.isEmpty());

    }
}

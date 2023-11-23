//Write the program that tell you which line pass through particular stations.
//Just use Zone 1 stations name. (Challenge)

import java.util.ArrayList;

public class Que8 {
    public static void main(String[] args) {
        zone1();
    }
    public static void zone1(){
        ArrayList<String>bakerStreet=new ArrayList<>();
        bakerStreet.add("Circle and Hammersmith & City");
        bakerStreet.add("Metropolitan");
        bakerStreet.add("Bakerloo");
        System.out.println("Baker Street runs lines : " + (bakerStreet));

    }
}

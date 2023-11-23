//Declare global variables of your name, Add all your group names in list, using
//for each loop iterate and print ONLY your name.

import java.util.ArrayList;

public class Que11 {
    String myName="zarana";

    public static void main(String[] args) {
groupNames();
    }
    public static void groupNames(){
        Que11 q = new Que11();
        ArrayList<String> gName=new ArrayList<>();
        gName.add("Ayan");
        gName.add("Pankti");
        gName.add("Sonal");
        gName.add("Miten");
        gName.add(q.myName);
        for (String name:gName) {
            if (name.equals(q.myName))
            System.out.println(name);

        }
    }
}

//Write program and add all group members names in to array and iterates
//through for each loop and print your name.

import java.util.ArrayList;

public class Que10 {
    public static void main(String[] args) {
        code2();
    }
    public static void code2(){
        ArrayList<String> memberName= new ArrayList<>();
        memberName.add("Ayan");
        memberName.add("Miten");
        memberName.add("Pankti");
        memberName.add("Sonal");
        memberName.add("Zarana");
        for (String names:memberName) {
            if (names.equals("Zarana")) {
                System.out.println(names);
            }
        }

    }
}
import java.util.HashMap;

//Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map.
public class Que7 {
    public static void main(String[] args) {
    hasmap();
    }
    public static void hasmap(){
        HashMap<String,Integer>people=new HashMap<>();
        people.put("zarana",1);
        people.put("sonal",2);
        people.put("pankti",3);
        people.put("ayan",4);
        people.put("miten",5);
        for (Integer s:people.values()){
            System.out.println(s);


        }
    }
}

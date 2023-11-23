import java.util.ArrayList;

//Write program and add all group names in to array and iterates through for
//each loop.
public class Que9 {
    public static void main(String[] args) {
        Que9 q = new Que9();
        q.collection();
    }

    public void collection() {
        ArrayList<String> groupNames = new ArrayList<>();
        groupNames.add("Code2");
        groupNames.add("Agile");
        groupNames.add("Selenium");
        groupNames.add("Postman");
        groupNames.add("Java");
        groupNames.add("Code1");

        for (String name : groupNames){
            System.out.println(name);
        }




    }
}
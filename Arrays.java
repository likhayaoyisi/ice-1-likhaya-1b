
import java.util.ArrayList;
import java.util.Scanner;
public class Arrays {



    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        ArrayList<String>names = new ArrayList<>();

        names.add("Lux");
        names.add("Anex");
        names.add("Sea");
        names.add("Nanka");
        names.add("Anitha");
        names.add("Ruth");
        names.add("Matt");

        //replace Sea and Anitha by Hope and Miradi
        names.set(2,"Hope");
        names.set(4, "Miradi");

        //remove Lux and Matt
        names.remove("Lux");
        names.remove("Matt");


        {
            System.out.print("" + names);

        }


        System.out.println();

    }
}


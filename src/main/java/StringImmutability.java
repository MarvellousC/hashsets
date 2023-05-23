import java.util.Collection;

public class StringImmutability {
    public static void main(String[] args) {
        String name = "Matt"; //by immutability we are referring to the Object Matt itself - name is just a pointer
        name = "Tinashe";
        String anotherName = "Matt"; //


        String aThirdName =  new String("Matt"); //In this case java creates a whole new Object outside of the string

        System.out.println(name == anotherName); // returns true as they are pointing to the exact same object
        System.out.println(name == aThirdName); //returns false as they are pointing to different
        System.out.println(name);

        addMoneyToAccount(name, 5000);

        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3"); //s2 is still pointing at 12
        System.out.println(s2);

    }

    public static void addMoneyToAccount(String accountHolder, int moneyToAdd){

    }


}

package thirtyDaysOfCode.day20.person;

public class Person {

    HairColor hairColor = HairColor.BLACK;

    public Person(){

    }

    public static void main(String[] args) {
        // Alias concept
        Person peterParker = new Person();
        Person spiderMan = peterParker;

        peterParker.hairColor = HairColor.PINK;
        System.out.println("Hair color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair color of Spider Man: " + spiderMan.hairColor);

        spiderMan.hairColor = HairColor.BLUE;
        System.out.println("Hair color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair color of Spider Man: " + spiderMan.hairColor);


    }
}

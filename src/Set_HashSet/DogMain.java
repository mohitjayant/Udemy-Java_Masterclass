package Set_HashSet;

public class DogMain {

    public static void main(String[] args) {

        LabraDog rover=new LabraDog("Rover");
        Dog rover2=new Dog("Rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));
    }
}

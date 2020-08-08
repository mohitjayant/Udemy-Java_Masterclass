package AdventureGame;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Location> location=new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        location.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        location.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        location.put(2, new Location(2, "You are at the top of a hill",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        location.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        location.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        location.put(5, new Location(5, "You are in the forest",tempExit));

        Map<String, String> vocabulary = new HashMap<String, String>();

        Map<String,String> dict=new HashMap<String, String>();
        dict.put("NORTH","N");
        dict.put("SOUTH","S");
        dict.put("EAST","E");
        dict.put("WEST","W");
        dict.put("QUIT","Q");

        int loc=1;
        while (true){
            System.out.println(location.get(loc).getDescription());
            if (loc==0){
                break;
            }
            Map<String,Integer> exits=location.get(loc).getExits();
            System.out.print("Available exits are: ");
            for (String exit:exits.keySet()){
                System.out.print(exit+", ");
            }
            System.out.println();
            String direction = scanner.nextLine().toUpperCase();
            if (direction.length()>1){
                String[] words=direction.split(" ");
                for (String word:words){
                    if (dict.containsKey(word)){
                        direction=dict.get(word);
                        break;
                    }
                }
            }
            if (exits.containsKey(direction)){
                loc=exits.get(direction);
            }
            else {
                System.out.println("You can't go in that direction");
            }
        }
    }
}

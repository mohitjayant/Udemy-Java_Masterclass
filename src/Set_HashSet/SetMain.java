package Set_HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
        Set<Integer> squares=new HashSet<Integer>();
        Set<Integer> cubes=new HashSet<Integer>();

        for (int i=1;i<=100;i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("There are "+squares.size()+" squares and "+cubes.size()+" cubes.");
        Set<Integer> union=new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union size is "+union.size());

        Set<Integer> intersection=new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains "+intersection.size()+" elements");

        Set<String> words=new HashSet<>();
        String sentence="I am the Arctic Vault contributor at Github. I am active from three years";
        String[] arrayWords=sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));
        for (String s:words){
            System.out.println(s);
        }
    }
}

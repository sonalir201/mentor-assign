import java.util.Arrays;
import java.util.List;

public class JavaS2 {

    public static void main(String[] args) {
         List<Integer>OrderedList=Arrays.asList(1,3,5,7,9,13,16,17,19);
        
         System.out.println("Takewhile...");
         OrderedList.stream()
         .takeWhile(e->e%2!=0)
         .forEach(e->System.out.println(e));
        
         System.out.println("Dropwhile...");
         OrderedList.stream()
         .dropWhile(e->e%2!=0)
         .forEach(e->System.out.println(e));

    }

}



import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaS9 {

    public static void main(String[] args) {
         List<Integer>intList=Stream.of(1,2,3,4,5).filter(e->e<5)
                 .collect(Collectors.toUnmodifiableList());
       System.out. println(intList);

    }

}


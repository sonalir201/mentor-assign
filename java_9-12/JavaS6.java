import java.util.Optional;

public class JavaS6 {

    public static void main(String[] args) {
        
        Optional<Integer>op= Optional.of(8753);
        System.out.println("Optional: "+op);
        
        System.out.println("getting the Stream:");
        op.stream().forEach(System.out::println);
    }

}

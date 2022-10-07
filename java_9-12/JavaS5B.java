import java.util.Optional;

public class JavaS5B{

    public static void main(String[] args) 
    {Optional<Integer>op
        =Optional.of(9455);
     System.out.println("Optional"
                  +op);
     System.out.println(
       "Value by orElseThrow("
        +"ArithmeticException::new)method:"
        + op.orElseThrow(
        ArithmeticException::new));
        

    }

}

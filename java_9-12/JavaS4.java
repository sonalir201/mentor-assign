import java.util.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
public class JavaS4 {

    
 
        public static <T>Stream<Integer>
        getStramFromIterator(Iterator<Integer> iterator){
            Spliterator<Integer>
            spliterator=Spliterators.spliteratorUnknownSize(iterator, 0);
            return StreamSupport.stream(spliterator, false);
        }
            public static void main(String[] args) {    
                Iterator<Integer> iterator=Arrays.asList(1,2,3,4,5).iterator();
                
                Stream<Integer>
                stream=getStramFromIterator(iterator);
                stream.forEach(s->System.out.println(s));
                
        }
    }

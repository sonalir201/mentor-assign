interface Methods{
    
    default void get() {
        saySomething();
        }
        
        private void saySomething() {
            System.out.println("Hello... This is Private method");
        }
    }

public class JavaS1 implements Methods{
    public static void main(String[] args) {
        Methods upm=new JavaS1();
        upm.get();
    }

}


interface Clickable {
    default void click() {
        System.out.println("click");
    }
}

interface Accessible {
    default void access() {
        System.out.println("access");
    }
}
public class Lambd5 implements Clickable, Accessible {
    public static void main(String[] args) {
        Lambd5 button = new Lambd5();
        button.click();
        button.access();
    }

}
package example.example1;

@SuppressWarnings("unused")
public class DecoratorModelTest {
    public static void main(String[] args) {
        Component base = new ComponentImpl("Water", 0, false);

        base = new DecoratorImpl(base, "coffee", 3);
        base = new DecoratorImpl(base, "sugar", 10);
        base = new DecoratorImpl(base, "milk", 10);

        System.out.println("Total : " + base.decoratedMethod());

    }
}

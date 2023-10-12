package example.example1;

@SuppressWarnings("unused")
public class DecoratorImpl implements Decorator {

    private final String name;
    private final int cost;
    private final Component base;

    DecoratorImpl(Component base, String name, int cost) {
        this.cost = cost;
        this.name = name;
        this.base = base;
    }

    @Override
    public int decoratedMethod() {
        return addFlavoring();
    }

    @Override
    public boolean getSize() {
        return base.getSize();
    }

    public int addFlavoring() {
        int ans = cost * (base.getSize() ? 2 : 1) + base.decoratedMethod();
        System.out.println("input " + name + " + " + cost);
        return ans;
    }
}

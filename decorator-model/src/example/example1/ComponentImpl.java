package example.example1;

@SuppressWarnings("unused")
public class ComponentImpl implements Component {

    private final String name;
    private final int cost;

    public ComponentImpl(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public int decoratedMethod() {
        return sale();
    }

    public int sale() {
        System.out.println("Base Drink : " + name);
        return cost;
    }
}

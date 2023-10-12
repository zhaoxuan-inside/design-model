package example.example1;

@SuppressWarnings("unused")
public class ComponentImpl implements Component {

    private final String name;
    private final int cost;
    private final boolean size;

    public ComponentImpl(String name, int cost, boolean size) {
        this.name = name;
        this.cost = cost;
        this.size = size;
    }

    @Override
    public int decoratedMethod() {
        return sale();
    }

    @Override
    public boolean getSize() {
        return size;
    }

    public int sale() {
        System.out.println("Base Drink : " + name);
        return cost;
    }
}

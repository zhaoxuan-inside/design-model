package example.example1;

import implement.code.ObjectFactory;
import implement.code.ObjectFactoryImpl;

public class FactoryModelTest {
    public static void main(String[] args) {
        ObjectFactory factory = new ObjectFactoryImpl();

        factory.create("type1");
        factory.create("type2");
    }
}

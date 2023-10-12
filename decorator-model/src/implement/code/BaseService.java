package implement.code;

@SuppressWarnings("unused")
public class BaseService implements Component {
    @Override
    public void decoratedMethod() {
        baseMethod();
    }

    public void baseMethod() {

    }
}

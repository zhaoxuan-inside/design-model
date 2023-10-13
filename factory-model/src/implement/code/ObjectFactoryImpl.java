package implement.code;

@SuppressWarnings("unused")
public class ObjectFactoryImpl implements ObjectFactory {

    @Override
    public ObjectType create(String type) {
        switch (type) {
            case "type1":
                return new ObjectType1Impl();
            case "type2":
                return new ObjectType2Impl();
        }
        return null;
    }

}

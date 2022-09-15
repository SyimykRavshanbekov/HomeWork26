public class Box<T> {
    private T object;

    Box(T object)
    {
        this.object=object;
    }

    public T getObject() {
        return object;
    }

}
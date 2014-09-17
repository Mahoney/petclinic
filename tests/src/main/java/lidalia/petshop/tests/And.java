package lidalia.petclinic.tests;

public class And<T> {

    private final T next;

    public And(T next) {
        this.next = next;
    }

    public T and() {
        return next;
    }
}

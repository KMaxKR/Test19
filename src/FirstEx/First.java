package FirstEx;

import interfaces.Joiner;

public class First<E> implements Joiner<E> {
    @Override
    public E join(E first, E second) {
        return (E) (first + " " + second);
    }
}

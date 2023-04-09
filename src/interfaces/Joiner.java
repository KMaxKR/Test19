package interfaces;
@FunctionalInterface
public interface Joiner <E> {
    E join(E first, E second);

}

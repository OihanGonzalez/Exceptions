package ejInterfaces4;
@FunctionalInterface 
public interface Transformador<T, R> {
    R transformar(T dato);
}
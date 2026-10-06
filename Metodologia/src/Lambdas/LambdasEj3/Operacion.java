package Lambdas.LambdasEj3;

@FunctionalInterface
interface Operacion<T,R>{
    R calcular(T a, T b);
}

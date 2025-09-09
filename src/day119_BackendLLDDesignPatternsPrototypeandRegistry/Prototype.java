package day119_BackendLLDDesignPatternsPrototypeandRegistry;

public interface Prototype <T>{//In java we already have clone-able interface.
    public T copy();//T return type.. generic interface
}
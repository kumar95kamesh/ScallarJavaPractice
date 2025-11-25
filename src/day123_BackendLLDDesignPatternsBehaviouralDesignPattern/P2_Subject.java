package day123_BackendLLDDesignPatternsBehaviouralDesignPattern;

public interface P2_Subject {
    public void registerObserver(P2_Observer o);
    public void removeObserver(P2_Observer o);
    public void notifyObservers();
}

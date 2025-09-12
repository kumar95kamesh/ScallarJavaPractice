package day120_BackendLLDDesignPatternsFactory;

public class IOS extends Platform{
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new IOSComponentFactory();
    }
}
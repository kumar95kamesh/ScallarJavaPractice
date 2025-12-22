package day120_BackendLLDDesignPatternsFactory;

public class Android extends Platform{
    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidComponentFactory();
    }
}
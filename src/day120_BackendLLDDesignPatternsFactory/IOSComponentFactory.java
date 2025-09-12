package day120_BackendLLDDesignPatternsFactory;


public class IOSComponentFactory implements UIComponentFactory {
    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
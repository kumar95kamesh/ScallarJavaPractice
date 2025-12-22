package day120_BackendLLDDesignPatternsFactory;


public class AndroidComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndriodDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
package day120_BackendLLDDesignPatternsFactory;


public interface UIComponentFactory {
    Button createButton();
    Dropdown createDropdown();
    Menu createMenu();
}
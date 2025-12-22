package day120_BackendLLDDesignPatternsFactory;



public class Client {
    public static void main(String[] args) {

//        Platform p = new Android(); // this is a simulation  //abstract factory

        String str = "Android"; // This is a simulation //simple factory
        Platform p = Platform.getPlatform(str);

        UIComponentFactory uiComponentFactory = p.createUIComponentFactory();
        Button b = uiComponentFactory.createButton();
        Dropdown d = uiComponentFactory.createDropdown();
        Menu menu = uiComponentFactory.createMenu();
    }
}
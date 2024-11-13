
public class Main {
    public static void main(String[] args) {
        Street street = BuildingFactory.createTestStreet();
        Menu menu = new Menu(street);
        menu.run();
    }
}
import java.util.Scanner;
public class Menu {
    private final Street street;
    private final Scanner scanner = new Scanner(System.in);
    public Menu(Street street) {
        this.street = street;
    }
    public void run() {
        while (true) {
            System.out.println("1. Показать все дома на улице");
            System.out.println("2. Добавить новый дом");
            System.out.println("3. Удалить дом");
            System.out.println("4. Найти магазины по типу отдела рядом с жилым домом");
            System.out.println("0. Выход");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> street.showStreetInfo();
                case 2 -> street.addBuilding(MenuUtils.createBuilding(scanner));
                case 3 -> street.removeBuilding(MenuUtils.getAddressInput(scanner));
                case 4 -> {
                    Address address = MenuUtils.getAddressInput(scanner);
                    DepartmentType departmentType = MenuUtils.getDepartmentTypeInput(scanner);
                    System.out.print("Введите диапазон поиска (количество домов): ");
                    int range = scanner.nextInt();
                    street.findShopsNearHouse(address, departmentType, range);
                }
                case 0 -> System.exit(0);
            }
        }
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MenuUtils {
    public static Building createBuilding(Scanner scanner) {
        System.out.println("Выберите тип здания:");
        System.out.println("1. Жилой дом");
        System.out.println("2. Магазин");
        System.out.println("3. Школа");
        int buildingType = scanner.nextInt();
        System.out.print("Введите номер дома: ");
        int houseNumber = scanner.nextInt();
        Address address = new Address(houseNumber);
        switch (buildingType) {
            case 1 -> {
                System.out.print("Введите количество жильцов: ");
                int residents = scanner.nextInt();
                return new ResidentialHouse(address, residents);
            }
            case 2 -> {
                System.out.println("Введите типы отделов через запятую (например, GROCERY, CLOTHING): ");
                scanner.nextLine();
                String[] departmentTypes = scanner.nextLine().split(",");
                List<DepartmentType> departments = new ArrayList<>();
                for (String type : departmentTypes) {
                    departments.add(DepartmentType.valueOf(type.trim().toUpperCase()));
                }
                return new Shop(address, departments);
            }
            case 3 -> {
                System.out.println("Введите уровень школы (например, PRIMARY, GYMNASIUM): ");
                String levelStr = scanner.next().toUpperCase();
                SchoolLevel level = SchoolLevel.valueOf(levelStr);
                int students = level.generateRandomStudentCount();
                return new School(address, level, students);
            }
            default -> {
                System.out.println("Неверный тип здания.");
                return null;
            }
        }
    }
    public static Address getAddressInput(Scanner scanner) {
        System.out.print("Введите номер дома: ");
        int houseNumber = scanner.nextInt();
        return new Address(houseNumber);
    }
    public static DepartmentType getDepartmentTypeInput(Scanner scanner) {
        System.out.println("Введите тип отдела (например, GROCERY, CLOTHING, ELECTRONICS): ");
        String typeStr = scanner.next().toUpperCase();
        return DepartmentType.valueOf(typeStr);
    }
}
import java.util.List;
public class Shop extends Building {
    private List<DepartmentType> departments;
    public Shop(Address address, List<DepartmentType> departments) {
        super(address);
        this.departments = departments;
    }
    @Override
    public void setFields(String data) {
        // Разбор строки для установки отделов
    }
    @Override
    public void displayInfo() {
        System.out.println("Магазин: " + address + ", Отделы: " + departments);
    }
}
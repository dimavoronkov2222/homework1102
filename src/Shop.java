import java.util.List;
public class Shop extends Building {
    private List<DepartmentType> departments;
    public Shop(Address address, List<DepartmentType> departments) {
        super(address);
        this.departments = departments;
    }
    public List<DepartmentType> getDepartments() {
        return departments;
    }
    @Override
    public void setFields(String data) {
        try {
            String[] parts = data.split(",\\s*");
            departments.clear();
            for (String part : parts) {
                DepartmentType department = DepartmentType.valueOf(part.trim().toUpperCase());
                departments.add(department);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: некорректное значение типа отдела - " + e.getMessage());
        }
    }
    @Override
    public void displayInfo() {
        System.out.println("Магазин: " + address + ", Отделы: " + departments);
    }
}
public class School extends Building {
    private int students;
    private SchoolLevel level;
    public School(Address address, SchoolLevel level, int students) {
        super(address);
        this.level = level;
        this.students = students;
    }
    @Override
    public void setFields(String data) {
        // Разбор строки для установки уровня и количества учащихся
    }
    @Override
    public void displayInfo() {
        System.out.println("Школа: " + address + ", Уровень: " + level + ", Ученики: " + students);
    }
}
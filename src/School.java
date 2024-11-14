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
        try {
            String[] parts = data.split(" ");
            this.level = SchoolLevel.valueOf(parts[0].toUpperCase());
            if (parts.length > 1) {
                this.students = Integer.parseInt(parts[1]);
                if (students < level.getMinStudents() || students > level.getMaxStudents()) {
                    throw new IllegalArgumentException("Количество учащихся не соответствует диапазону для уровня " + level.getDescription());
                }
            } else {
                this.students = level.generateRandomStudentCount();
            }
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка при разборе данных: " + e.getMessage());
        }
    }
    @Override
    public void displayInfo() {
        System.out.println("Школа: " + address + ", Уровень: " + level + ", Ученики: " + students);
    }
}
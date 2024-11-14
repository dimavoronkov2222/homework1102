public enum SchoolLevel {
    PRIMARY("Начальная школа", 100, 300),
    SECONDARY("Средняя школа", 300, 600),
    HIGH("Старшая школа", 500, 800),
    GYMNASIUM("Гимназия", 200, 500),
    LYCEUM("Лицей", 300, 700);
    private final String description;
    private final int minStudents;
    private final int maxStudents;
    SchoolLevel(String description, int minStudents, int maxStudents) {
        this.description = description;
        this.minStudents = minStudents;
        this.maxStudents = maxStudents;
    }
    public String getDescription() {
        return description;
    }
    public int getMinStudents() {
        return minStudents;
    }
    public int getMaxStudents() {
        return maxStudents;
    }
    public int generateRandomStudentCount() {
        return minStudents + (int) (Math.random() * (maxStudents - minStudents + 1));
    }
}
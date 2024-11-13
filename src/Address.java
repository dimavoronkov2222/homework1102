public class Address {
    private final int number;
    public Address(int number) {
        this.number = number;
    }
    @Override
    public boolean equals(Object obj) {
        // Реализация сравнения
        return false;
    }
    @Override
    public String toString() {
        return "Дом " + number;
    }
}
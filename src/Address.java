public class Address {
    private final int number;
    public Address(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Address address = (Address) obj;
        return number == address.number;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(number);
    }
    @Override
    public String toString() {
        return "Дом " + number;
    }
}
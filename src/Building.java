public abstract class Building {
    protected Address address;
    public Building(Address address) {
        this.address = address;
    }
    public abstract void setFields(String data);
    public abstract void displayInfo();
    public Address getAddress() {
        return address;
    }
}
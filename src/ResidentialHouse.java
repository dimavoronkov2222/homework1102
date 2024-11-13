public class ResidentialHouse extends Building {
    private int residents;
    public ResidentialHouse(Address address, int residents) {
        super(address);
        this.residents = residents;
    }
    @Override
    public void setFields(String data) {
        this.residents = Integer.parseInt(data);
    }
    @Override
    public void displayInfo() {
        System.out.println("Жилой дом: " + address + ", Жильцов: " + residents);
    }
}

public class Hospital extends Building {
    private int doctors;
    public Hospital(Address address, int doctors) {
        super(address);
        this.doctors = doctors;
    }
    @Override
    public void setFields(String data) {
        this.doctors = Integer.parseInt(data);
    }
    @Override
    public void displayInfo() {
        System.out.println("Больница: " + address + ", Врачи: " + doctors);
    }
}
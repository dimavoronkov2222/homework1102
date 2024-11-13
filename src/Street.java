import java.util.ArrayList;
import java.util.List;
public class Street {
    private final List<Building> buildings = new ArrayList<>();
    public void addBuilding(Building building) {
        buildings.add(building);
    }
    public void removeBuilding(Address address) {
        buildings.removeIf(building -> building.getAddress().equals(address));
    }
    public void showStreetInfo() {
        buildings.forEach(System.out::println);
    }
    public void findShopsNearHouse(Address address, DepartmentType type, int range) {
        StreetUtils.findNearbyShops(buildings, address, type, range);
    }
}
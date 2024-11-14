import java.util.List;
public class StreetUtils {
    public static void findNearbyShops(List<Building> buildings, Address address, DepartmentType type, int range) {
        int addressNumber = address.getNumber();
        for (Building building : buildings) {
            if (building instanceof Shop) {
                Shop shop = (Shop) building;
                if (shop.getDepartments().contains(type)) {
                    int shopNumber = shop.getAddress().getNumber();
                    if (Math.abs(shopNumber - addressNumber) <= range) {
                        System.out.println("Магазин в окрестности: " + shop);
                    }
                }
            }
        }
    }
}
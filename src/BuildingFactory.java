import java.util.List;
public class BuildingFactory {
    public static Street createTestStreet() {
        Street street = new Street();
        street.addBuilding(new ResidentialHouse(new Address(1), 30));
        street.addBuilding(new Shop(new Address(2), List.of(DepartmentType.GROCERY)));
        street.addBuilding(new School(new Address(3), SchoolLevel.HIGH, 200));
        street.addBuilding(new Hospital(new Address(4), 15));
        return street;
    }
}
public class BonusMilesService {

    int price;
    int bonus = 20;

    public int calculate(int price) {
        int miles = price / bonus;
        return miles;
    }
}

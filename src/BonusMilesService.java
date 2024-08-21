public class BonusMilesService {

    int bonus = 20;//1 миля за каждые 20 рублей

    public int calculate(int price) {
        int miles = price / bonus;
        return miles;
    }
}

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int coast = 10000;
        int miles = service.calculate(coast);
        System.out.println(miles);
    }
}
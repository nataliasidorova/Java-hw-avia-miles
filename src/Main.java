public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticket = 100_000;

        int miles = service.calculate(ticket);

        System.out.println("Начисленные мили за покупку билета:" + miles);

    }
}

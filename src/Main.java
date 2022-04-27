public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthlyPayment = service.calculate (1_000_000, 9.99, 24 );
        System.out.println("Ежемесячная плата составляет " + monthlyPayment + " рублей.");

    }

}

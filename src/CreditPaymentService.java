public class CreditPaymentService {
    public double calculate(int amount, double percent, int months) {

        double year = 12;
        double monthlyInterestRate = percent / year / 100;
        double annuityRatio = 1 + monthlyInterestRate;
        double annuityRatio1 = Math.pow(annuityRatio, months);
        double annuityRatio2 = monthlyInterestRate * annuityRatio1;
        double annuityRatio3 = annuityRatio1 - 1;
        double annuityRatio4 = annuityRatio2 / annuityRatio3;
        double monthlyPayment = annuityRatio4 * amount;
        return monthlyPayment;
    }


}

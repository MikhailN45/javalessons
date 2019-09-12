package mortgage;

public class MortgageCalc {

    public static void main(String[] args) {
        int loanAmount = 100000; //Объем кредита
        int numberOfYears = 10; //Cрок кредита
        double annualInterestRate = 0.05; //Процентная ставка
        int totalIncome = 3200;   //Общая сумма выплаченного кредита
        int numberOfFamilyMembers = 2; //Численность семьи
        int extraPayment = 100; //Сумма доп. платежа

        Calculator calculator = new Calculator(loanAmount, numberOfYears, annualInterestRate, extraPayment);
        double monthlyPayment = calculator.calcMonthlyPayment(loanAmount, annualInterestRate / 12);
        System.out.println("Monthly payment: " + monthlyPayment);
        double incomeRatio;
        switch (numberOfFamilyMembers) {
            case 1:
                incomeRatio = 0.50;
                break;
            case 2:
                incomeRatio = 0.45;
                break;
            case 3:
                incomeRatio = 0.35;
                break;
            case 4:
                incomeRatio = 0.30;
                break;
            case 5:
                incomeRatio = 0.25;
                break;
            default:
                incomeRatio = 0.0;
        }
        if (monthlyPayment / totalIncome < incomeRatio) {
            System.out.println("You are eligible for the loan. Here is your payment split-up");
        } else {
            System.out.println("You are not eligible for loan under current conditions");
        }
    }
}


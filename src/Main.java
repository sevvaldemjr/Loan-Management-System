public class Main {
    public static void main(String[] args) {
        LoanAccount acc1 = new LoanAccount(1, "Elif", 1000);
        LoanAccount acc2 = new LoanAccount(2, "Mert", 500);
        LoanAccount acc3 = new LoanAccount(3, "Zeynep", 0);

        // Apply Loan
        try {
            acc1.applyLoan(-200);
        } catch (InvalidLoanAmountException e) {
            System.out.println("HATA:"+e.getMessage());
        }
        try {
            acc2.repayLoan(-15);
        } catch (InvalidLoanAmountException e) {
            System.out.println("HATA:"+e.getMessage());
        }
        try {
            acc3.transferLoan(50,null);
            acc2.transferLoan(-199,acc1);
            acc1.repayLoan(90);
        }catch (NullPointerException e){
            System.out.println("HATA:"+e.getMessage());
        } catch (LoanLimitExceededException e) {
            System.out.println("HATA:"+e.getMessage());
        } catch (InvalidLoanAmountException e) {
            System.out.println("HATA:"+e.getMessage());
        }
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
    }
}
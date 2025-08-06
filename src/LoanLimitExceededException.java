public class LoanLimitExceededException extends Exception{
    public LoanLimitExceededException(String message){
        super("Loan Limit Exceeded Exception.");
    }
}

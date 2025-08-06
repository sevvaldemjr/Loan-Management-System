public class LoanAccount {
    int loanID;
    String borrowName;
    double loanBalance;

        public LoanAccount(int loanID,String borrowName,double loanBalance){
            this.borrowName=borrowName;
            this.loanBalance=loanBalance;
            this.loanID=loanID;
    }

        public int getLoanID() {
            return loanID;
    }
        public double getLoanBalance() {
            return loanBalance;
    }
        public String getBorrowName() {
            return borrowName;
    }
        void applyLoan(double amount) throws InvalidLoanAmountException{
            loanBalance+=amount;
            if (amount<=0){
                throw new InvalidLoanAmountException("Invalid Amount");
            }
    }
        void repayLoan(double amount) throws InvalidLoanAmountException {
            loanBalance -= amount;
            if (amount <= 0) {
                throw new InvalidLoanAmountException("Invalid Amount");
            }
        }
        void transferLoan(double amount,LoanAccount target) throws InvalidLoanAmountException,NullPointerException,LoanLimitExceededException{;
            this.loanBalance-=amount;
            target.loanBalance=amount;
            if (target==null){
                throw new NullPointerException("Null pointer exception.");
            }
            if (amount<=0){
                throw new InvalidLoanAmountException("Invalid Amount.");
            }
            if (this.loanBalance<amount){
                throw new LoanLimitExceededException("Not enough Loan Balance.");
            }
        }

    @Override
    public String toString() {
        String st="";
        st="Name:\t"+borrowName+"\nId:\t"+loanID+"\nBalance amount:\t"+loanBalance;
        return st;
    }
}


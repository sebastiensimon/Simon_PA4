class SavingsAccount {
    static private double annualInterestRate;
    private double savingbalance;

    private SavingsAccount(double savingbalance){

        this.savingbalance = savingbalance;
    }
    private double SavingBalance(){
        return this.savingbalance;
    }

    private  static void modifyInterestRate(double newInterestRate){
        annualInterestRate = newInterestRate;
    }

    private void calculateMonthlyInterest(){
        double monthly;
        monthly = (this.savingbalance * annualInterestRate/12);
        this.savingbalance+=monthly;
    }

    public static void main(String[]args){
        int i;
        SavingsAccount saver1,saver2;
        saver1 = new SavingsAccount (2000.0);
        saver2 = new SavingsAccount (3000.0);


        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Balance for Saver 1");
        for(i=0; i<=12; i++){
            saver1.calculateMonthlyInterest();
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver1.SavingBalance()));
            System.out.println("\nPrinting Balance for Saver 2\n");
            saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver2.SavingBalance()));
        }
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println(" Balance for Saver 1 at interest rate 5%");
        for(i=0; i<=12; i++){
            saver1.calculateMonthlyInterest();
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver1.SavingBalance()));
        }
        System.out.println("\n Balance for Saver 2 at interest rate 5%\n");
        for( i=0; i<12; i++) {
            //Calculate monthly interest
            saver2.calculateMonthlyInterest();
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver2.SavingBalance()));
        }

    }
}
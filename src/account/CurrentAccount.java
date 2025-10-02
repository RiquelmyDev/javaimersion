package account;

class CurrentAccount {
    // aqui declaros meu atributos
    String nameU = "Victor";
    String dateB = "13/05/2013";

    int numAccount = 1908;
    int numAgency = 2021;
    double balance = 1500;

    double withdraw(double amount) {
        double newBalance = this.balance - amount;
        System.out.println(newBalance);
        return newBalance;
    }


    public static void main(String[] args) {
        CurrentAccount account = new CurrentAccount();
        account.withdraw(500);
    }
}
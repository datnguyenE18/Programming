package jvprj;

class Account {

    private int id;
    private String name;
    private int balance = 0;

    public Account( int id, String name ) {
        this.id = id;
        this.name = name;
    }

    public Account( int id, String name, int balance ) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit( int amount ) {
        balance += amount;
    }

    public void withdraw( int amount ) {
        if ( balance >= amount )
            balance -= amount;
        else
            System.out.println("That amount exceeds your current balance.");
    }

    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class JvPrj {

    public static void main( String[] args ) {
        Account account1 = new Account(1000, "Tuan", 2000);
        account1.display();
        account1.withdraw(2100);
        account1.deposit(600);
        System.out.println("Balance: " + account1.getBalance());
        account1.withdraw(2100);
        System.out.println("Balance: " + account1.getBalance());
    }

}

/*
run:
Id: 1000
Name: Tuan
Balance: 2000
That amount exceeds your current balance.
Balance: 2600
Balance: 500
 */

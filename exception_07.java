// Custom Exception: Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Custom Exception: Account Not Found
class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccount {
    int accountNumber;
    String name;
    double balance;

    // Constructor
    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Method to transfer amount
    public void transferAmount(BankAccount receiver, double amount)
            throws InsufficientBalanceException, AccountNotFoundException {

        // Check if receiver account exists
        if (receiver == null) {
            throw new AccountNotFoundException("Receiver account not found!");
        }

        // Check invalid amount
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero!");
        }

        // Check balance
        if (amount > this.balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        // Simulate network issue randomly
        if (Math.random() < 0.2) { // 20% chance
            throw new RuntimeException("Network failure! Try again later.");
        }

        // Perform transaction
        this.balance -= amount;
        receiver.balance += amount;

        System.out.println("Transaction Successful!");
    }
}

// Main Class
 class exception_07 {
    public static void main(String[] args) {

        // Create accounts
        BankAccount acc1 = new BankAccount(101, "Girish", 5000);
        BankAccount acc2 = new BankAccount(102, "Rahul", -2000);
	    BankAccount acc3 = new BankAccount(103, "Sandeep", 1000);

        try {
            // Try transferring money
            acc1.transferAmount(acc3, 2000);

            System.out.println("Sender Balance: " + acc1.balance);
            System.out.println("Receiver Balance: " + acc2.balance);

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (AccountNotFoundException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (RuntimeException e) { // Network failure
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Transaction process completed.");
        }
    }
}
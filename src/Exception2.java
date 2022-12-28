//Explicit throw an Exception  in java
/**  Syntax:
        throw<throwableInstance>;   */
public class Exception2 {
    public static void main(String[] args){
        int balance=5000;
        int withdrawalAmount=6000;  //=3000;
        if(balance<withdrawalAmount)
            throw new ArithmeticException("Insufficient balance");
        balance=balance-withdrawalAmount;
        System.out.println("Transaction Successfully completed");
        System.out.println("Program continue...");
    }
}

//Our throw and Our catch Example
/**
public class Exception2 {
    public static void main(String[] args){
        int balance=5000;
        int withdrawalAmount=6000;  //=3000;
        try {
            if (balance < withdrawalAmount)
                throw new ArithmeticException("Insufficient balance");
            balance = balance - withdrawalAmount;
            System.out.println("Transaction Successfully completed");
        } catch (ArithmeticException e) {
            System.out.println("Exception:"+e.getMessage());
        }
        System.out.println("Program continue...");

    }
}
*/
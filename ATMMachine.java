package ATMINTERFACE;

import java.util.Scanner;

class  ATM {
    float Balance;
    int PIN=2003;
    public void checkpin(){
        System.out.println("Enter your pin ");
        Scanner sc= new Scanner(System.in);
        int enteredpin= sc.nextInt();
        if (enteredpin==PIN) {
            menu();
        }
        else{
            System.out.println("Enter a valid pin ");
        }
    }
    public void menu(){
        System.out.println("Enter your choice ");
        System.out.println("1. check A/C balance ");
        System.out.println("2. withdraw money  ");
        System.out.println("3. Deposit Money ");
        System.out.println("4. Exit ");

        Scanner sc= new Scanner(System.in);
        int opt=sc.nextInt();
        if (opt==1) {
            checkbalance();
        }
        else if( opt==2){
            withdrawmoney();
        }
        else if (opt==3 ) {
            DepositeMoney();
        }
        else if (opt==4) {
            return;
        }
        else{
            System.out.println("Enter a valid choice ");
        }
    }

    public void checkbalance(){
        System.out.println("Balance: "+ Balance);
        menu();
    }
    
    public void withdrawmoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc= new Scanner(System.in);
        float amount= sc.nextFloat();
        if (amount>Balance) {
            System.out.println("Insufficient Balance ");
        }
        else{
            Balance=Balance-amount;
            System.out.println("Money withdrawl successfully ");
        }
        menu();
    }
    public void DepositeMoney(){
        System.out.println("Enter the amount ");
        Scanner sc= new Scanner(System.in);
        float amount= sc.nextFloat();
        Balance= Balance+amount;
        System.out.println("Money Deposite Successfully");
        menu();
    }
    
}


public class ATMMachine {
    public static void main(String[] args) {
        
        ATM obj=new ATM();
        obj.checkpin();
    }
    
}
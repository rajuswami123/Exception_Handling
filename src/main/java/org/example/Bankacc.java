package org.example;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


class TringappsBankAcc{
    static Logger ou = Logger.getLogger("com.api.jar");
    private String accHolderName;
    private int accNumber;
    private double accBlnc;

    TringappsBankAcc(String name, int num, double blc) {
        this.accHolderName = name;
        this.accNumber = num;
        this.accBlnc = blc;
    }

    void text() {
        ou.log(Level.INFO, () -> "1)Deposit Cash\n2)Withdraw Cash\n3)Balance Enquiry\n4)Exit");
    }

    void depositCash(int x) {
        accBlnc += x;
        ou.log(Level.INFO, () -> "Cash is Deposited in your Account ..\n");

    }

    void withdrawCash(int x) {
        if (accBlnc > x) {
            accBlnc -= x;
            ou.log(Level.INFO, () -> "You Have successfully withdrwan Cash");
        } else {
            ou.log(Level.INFO, () -> "You Dont Have Sufficient Balance.");


        }

    }

    double blncEnquiry() {
        return accBlnc;
    }

}

public class Bankacc {
    public static void main(String[] args) {
        Logger ou= Logger.getLogger("com.api.jar");
        Scanner in= new Scanner(System.in);
        ou.log(Level.INFO,()->"\nHi welcome to TringappsBank .\nEnter Your Name : ");


        String accHoldername=in.nextLine();
        ou.log(Level.INFO,()->"Enter your BankAccount Number ");
        int accnumber=in.nextInt();

        TringappsBankAcc ob= new TringappsBankAcc(accHoldername,accnumber,0.0);
        ob.text();
        int a;
        int b;
        int c;

        a=in.nextInt();
        while(a!=4){
            if(a==1) {
                ou.log(Level.INFO,()->"Enter the Amount And add the Cash that you want to Deposit .");
                b=in.nextInt();
                ob.depositCash(b);
                ob.text();
                ou.log(Level.INFO,()->"Enter your Request Number \n");

                a=0;
                a=in.nextInt();
            }
            if(a==2){
                ou.log(Level.INFO,()->"Enter the amount that you want to take out.\n");
                c=in.nextInt();
                ob.withdrawCash(c);

                ob.text();
                ou.log(Level.INFO,()->"\nEnter your Request Number\n ");
                a=0;
                a=in.nextInt();

            }
            if(a==3)
            {
                System.out.print("your current Balnce=>");
                ou.log(Level.INFO,()->""+ob.blncEnquiry());
                ob.text();
                ou.log(Level.INFO,()->"Enter your Request Number ");
                a=0;
                a=in.nextInt();

            }
            if(a==4)  ou.log(Level.INFO,()->"Thanks for choosing our Bank.\nBye Bye...");

        }
    }
}
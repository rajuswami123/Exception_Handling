package org.example;
import java.util.*;
import java.util.logging.Logger;

class Dbp {
    static Dbp po;
    String nm;
    Scanner in =new Scanner(System.in);
    Logger ou = Logger.getLogger("com.api.jar");

    private Dbp() {
    }

    public static Dbp getInstance() {
        if (po == null) {
            po = new Dbp();
        }
        return po;
    }

    public String getConnection() {
        ou.info("Enter the database connection :");
        nm = in.next();
        ou.info(nm);


        return null;
    }

    public void closeAllConnections() {
        String num="closed";
        ou.info(num);
    }
    void ret(){
        ou.info( nm);
    }

}
public class Dconpool {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Logger ou = Logger.getLogger("com.api.jar");
        Dbp clv=Dbp.getInstance();
        clv.getConnection();
        ou.info("Do you want to close the Connection ??\nIf you want to close the connection press 1 or To continue press 0");
        int a=in.nextInt();
        if(a==1)  clv.closeAllConnections();
        else {
            clv.getConnection();
            ou.info("Returing the Database :");
            clv.ret();
        }


    }

}
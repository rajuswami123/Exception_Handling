package org.example;
import java.util.*;
import java.util.logging.Logger;
class  Cc implements Cloneable{
    String name;
    int num;
    String exp;
    public Cc(String name,int num,String exp){
        this.name=name;
        this.num=num;
        this.exp=exp;
    }
    public boolean equals(Object ob2) {
        if (ob2 == this) return true;
        if(!(ob2 instanceof Cc)) {
            return false;
        }
        Cc emp = (Cc) ob2;
        return emp.name== (this.name) && emp.num == this.num && emp.exp==this.exp;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner in =new Scanner(System.in);
        Logger ou = Logger.getLogger("com.api.jar");
        ou.info("Enter the user Details :\nEnter Username :");
        String name = in.next();
        ou.info("Enter card NUm :");
        int num=in.nextInt();
        ou.info("Enter Expdate");
        String exp=in.next();
        ou.info("Enter the details to check :\nEnter Username :");
        String name1 = in.next();
        ou.info("Enter card NUm :");
        int num1=in.nextInt();
        ou.info("Enter Expdate");
        String exp1=in.next();
        Cc ob1=new  Cc(name,num,exp);
        Cc ob2=new  Cc(name1,num1,exp1);
        String s1=""+ob1.equals(ob2);
        ou.info(s1);
        Cc obj3= (Cc) ob1.clone();
        String s2=""+ ob1.equals(obj3);
        ou.info(s2);


    }
}

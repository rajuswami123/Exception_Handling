package org.example;

import java.util.*;
import java.util.logging.Logger;



class Bp2d implements Cloneable{
    private float x;
    private float y;
    public Bp2d(float x,float y){
        this.x=x;
        this.y=y;

    }
    public boolean equals(Object ob2) {
        if (ob2 == this) return true;
        if(!(ob2 instanceof Bp2d)) {
            return false;
        }
        Bp2d emp = (Bp2d) ob2;
        return emp.x == (this.x) && emp.y == this.y;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Basicpoint2D {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner in = new Scanner(System.in);
        Logger ou = Logger.getLogger("com.api.jar");
        ou.info("Enter the x co-ordinate :");
        float x = in.nextFloat();
        ou.info("Enter the y co-ordinate :");
        float y = in.nextFloat();
        ou.info("Enter the co-ordinates to check ");
        ou.info("x");
        float x1 = in.nextFloat();
        ou.info("y");
        float y1 = in.nextFloat();
        Bp2d ob1 = new Bp2d(x, y);
        Bp2d ob2 = new Bp2d(x1,y1);
        String s1=""+ob1.equals(ob2);
        ou.info(s1);
        Bp2d obj3= (Bp2d) ob1.clone();
        String s2=""+ ob1.equals(obj3);
        ou.info(s2);


    }
}

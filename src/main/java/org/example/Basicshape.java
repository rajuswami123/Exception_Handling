package org.example;

import java.util.*;
import java.util.logging.Logger;

class BasicShape{
    String shapeName;
    float side;
    float side2;
    float side3;
    BasicShape(String shapeName,float side){
        this.shapeName=shapeName;
        this.side=side;

    }
    BasicShape(String shapeName,float side2,float side3){
        this.shapeName=shapeName;
        this.side2=side2;
        this.side3=side3;
    }
    BasicShape(String shapeName,float side,float side2,float side3){
        this.side=side;
        this.shapeName=shapeName;
        this.side2=side2;
        this.side3=side3;

    }


    float peri ( ){
        if (shapeName.equals("Triangle")) {
            return side + side2 + side3;
        }
        if (shapeName.equals("Rectangle")) {
            return 2*(side2+side3);
        }
        if (shapeName.equals("Circle")) {
            return 2*3.14f*side;
        }
        return 0;


    }
    float area ( ){
        if (shapeName.equals("triangle")) {
            return 0.5f * side2 * side3;
        }
        if (shapeName.equals("circle")) {
            return 3.14f*side*side;
        }
        if (shapeName.equals("rectangle")) {
            return side2*side3;
        }

        return 0;
    }



}

public class Basicshape {
    public static void main(String[] args) {
        Logger ou = Logger.getLogger("com.api.jar");
        Scanner in =new Scanner(System.in);
        float radi;
        float side;
        float side2 ;
        float side1;
        ou.info("1)Triangle\n2)Rectangle\n3)circle");
        ou.info("Enter the shapeName :");
        String name=in.next();
        ou.info("Enter the Dimensions : ");

        if(name.equals("circlE")) {
            ou.info("Radius :");
            radi=in.nextFloat();


            BasicShape ob= new BasicShape(name,radi);
            ou.info("The perimetre of circle is :");
            String sadf=""+ ob.peri();
            ou.info(sadf);
            ou.info("The  Area of Circle  is :");
            String dsf=""+ ob.area();
            ou.info(dsf);

        }
        if(name.equals("trianglE")){
            ou.info("Enter side 1:");
            side=in.nextFloat();
            ou.info("Enter side 2:");
            side1=in.nextFloat();
            ou.info(("Enter side 3:"));
            side2=in.nextFloat();
            BasicShape ob= new BasicShape(name,side,side1,side2);
            ou.info("The perimetre of Triangle is :");
            String neiw=""+ob.peri();
            ou.info(neiw);
            ou.info("The area of triangle is :");
            String neow=""+ ob.area();
            ou.info(neow);
        }

        if(name.equals("rectanglE")){
            ou.info(("Enter length :"));
            side1=in.nextFloat();
            ou.info(("Enter  Breath :"));
            side2=in.nextFloat();
            BasicShape ob= new BasicShape(name,side1,side2);
            ou.info("The perimetre of Rectangle is :");
            String sews=""+ob.peri();
            ou.info(sews);
            ou.info("The area of the Rectangle is :");
            String sew=""+ ob.area();
            ou.info(sew);
        }
    }

}
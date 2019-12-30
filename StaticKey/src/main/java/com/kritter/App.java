package com.kritter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
class TravelAgency
{
    static int id;
    static String agencyName;
    static byte taRating;
    public String ta_Owner;
    private byte owner_Age;
    private double ta_Amount;
    private double discount,gst;

    public void read() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.println("Enter owner name:");
        ta_Owner = sc.next();

        System.out.println("Enter owner_age:");
        owner_Age = Byte.parseByte(br.readLine());

        System.out.println("Enter the amount paid as advance:");
        ta_Amount = Double.parseDouble(br.readLine());
    }

    public void display()
    {
        System.out.println("\n \n \t Details:");
        System.out.println("Owner name:" + ta_Owner);
        System.out.println("Owner Age:" + owner_Age);
        System.out.println("Advance amount paid:" + ta_Amount);
    }

    public void calculate()
    {					if(owner_Age > 18 )
    {
        System.out.println("Your request is in process :)");
        gst = ta_Amount * ( 2/100 );
        discount = ta_Amount - (ta_Amount*10/100) + gst;
        System.out.println("total amount after discount ="+ discount);

    }
    else
    {
        System.out.println("Your request will be considered soon :)");
    }
    }

    static void rating()throws IOException
    {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("\nGetting values through static function\nEnter Rating:");
        taRating = Byte.parseByte(br.readLine());
    }

    static
    {
        agencyName = "Kritter";
        id = 100;
    }

    static void show()
    {
        id++;
        System.out.println("\n\nId generated again through static functions");
        System.out.println("Auto id=" + id + "\nAgency Name=" +agencyName + "\nRating=" + taRating);
    }

}

class Static
{
    static class staticlass
    {
        public void display()
        {
            System.out.println("Updated successfully through static class");
            TravelAgency.show();
            System.out.println("Updated successfully");
        }
    }
}


public class App
{
    public static void main( String[] args ) throws Exception
    {
        boolean loop = true;
        TravelAgency obj = new TravelAgency();

        System.out.println("\nInital values:\nid:" + TravelAgency.id +"\nAgency:"+ TravelAgency.agencyName);
        Static.staticlass sc = new Static.staticlass();
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        while(loop)
        {

            System.out.println("\nEnter Your Choice \n 1.Read \n 2.Display \n 3.Amount Details \n 4.Static variables and functions \n 5.Exit\n");
            byte ch = Byte.parseByte(br.readLine());
            switch(ch)
            {
                case 1:

                    obj.read();
                    break;

                case 2:

                    obj.display();
                    break;
                case 3:
                    obj.calculate();
                    break;

                case 4:
                    obj.rating();
                    System.out.println("Accessing static variables Using classname\n" + "Id=" + TravelAgency.id + "\tAgency:" + TravelAgency.agencyName);
                    obj.show();
                    sc.display();


                case 5: loop = false;
                    break;
            }
        }
    }
}

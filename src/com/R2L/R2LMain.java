package com.R2L;

/**
 * Created by Naz on 10/5/16.
 */
public class R2LMain {

    static boolean warezMasterAttack = false;
    static boolean warezClientAttack = false;


    public static void main(String[] args) {

        //to pass information processed from packet collector



        //sample attack
        //WarezMasterRule(266,"tcp","ftp",256617,0,1);
        WarezMasterRule(264,"tcp","ftp",256615,0,0);


        //WarezClientRule(5,"tcp","ftp",1,3299,1);
    }

    public static boolean WarezClientRule(double Duration, String protocol, String service, int islogin, double destination_bytes, int guestlogin) {
        double Dur =Duration;
        String proto = protocol;
        String serv = service;
        int login=islogin;
        double destinationBytes=destination_bytes;
        int guest =guestlogin;

        while(warezClientAttack==false)
        {
            if (Dur < 5 && proto.equals("tcp") && (serv.equals("ftp") || serv.equals("FTP_DATA")) && guest== 1 || login == 1) {
                warezClientAttack = true;
                System.out.println("1");

            } else if (destinationBytes<=3299 /*hotspots add*/) {
                warezClientAttack = true;
                System.out.println("2");

            } else if (Dur <= 4685 /*hotspots add*/) {
                warezClientAttack = true;
                System.out.println("3");
            }
        }
        if (warezClientAttack==true)
        {
            Alert newAlert = new Alert("WarezClient");
            Alert.main();
            System.out.println("5");

        }
        else
        {
            warezClientAttack=false;
            System.out.println("6");

        }

        return warezClientAttack;
    }

    public static boolean WarezMasterRule(double Duration, String protocol, String service, double source_bytes, double destination_bytes, int guestlogin){
        double Dur =Duration;
        String proto = protocol;
        String serv = service;
        double sourceBytes=source_bytes;
        double destinationBytes=destination_bytes;
        int guest =guestlogin;


        while(warezMasterAttack==false) {
            if (Dur > 265 && proto.equals("tcp") && (serv.equals("ftp") || serv.equals("FTP_DATA")) && sourceBytes > 256616 && destinationBytes == 0) {
                warezMasterAttack = true;
                System.out.println("1");

            } else if (proto.equals("tcp") && (serv.equals("ftp") || serv.equals("FTP_DATA")) && sourceBytes > 256616 && guest == 1) {
                warezMasterAttack = true;
                System.out.println("2");

            } else if (Dur > 265 && destinationBytes <= 688 && guest == 1) {
                warezMasterAttack = true;
                System.out.println("3");

            } else if (sourceBytes <= 283618 && sourceBytes > 256616) {
                warezMasterAttack = true;
                System.out.println("4");
            }
            else
            {
                break;
            }
        }
        if (warezMasterAttack==true)
        {
            Alert newAlert = new Alert("WarezMaster");
            Alert.main();
            System.out.println("5");

        }
        else
        {
            warezMasterAttack=false;
            System.out.println("6");

        }


        return warezMasterAttack;
    }

}

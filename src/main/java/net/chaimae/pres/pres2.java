package net.chaimae.pres;

import net.chaimae.dao.IDao;
import net.chaimae.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pres2 {
    public static void main (String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("config.txt"));

        // DAO
        String daoClassName = scanner.nextLine();
        Class<?> cDao = Class.forName(daoClassName);
        IDao d = (IDao) cDao.getDeclaredConstructor().newInstance();

        // Metier
        String metierClassName = scanner.nextLine();
        Class<?> cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier
                .getConstructor(IDao.class)
                .newInstance(d);
        // Methode
        //IMetier metier = (IMetier) cMetier
               // .getConstructor()
                //.newInstance();


        System.out.println("RES = " + metier.calcul());
    }
}
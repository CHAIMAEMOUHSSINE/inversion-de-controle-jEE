package net.chaimae.pres;

import net.chaimae.dao.DaoImpl;
import net.chaimae.metier.MetierImpl;
import net.chaimae.net.chaimae.ext.DaoImplV2;

public class pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d); //injection des dependences via le setter
        System.out.println("RES= "+metier.calcul());
    }
}

package net.chaimae.dao;

public class DaoImpl  implements IDao{
    @Override
    public double getData(){
        System.out.println("Version de base de donées");
        double t=34;
        return t;
    }
}

package net.chaimae.metier;

import net.chaimae.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // Couplage Faible
    /**
     * pour injecter dans láttribut dao
     *un objet dúne classe qui implemente línterface IDao
     * au moment de instantiation
     */
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 * Math.PI * Math.cos(t);
        return res;
    }


    /**
     * pour injecter dans láttribut dao
     *un objet dúne classe qui implemente l'interface IDao
     * apres instanciation
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

}

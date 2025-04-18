package app;

public class MetierImpl implements IMetier {
    private IDao dao;

    // Injection via setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    // Injection via constructeur
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
        return dao.getData() * 2;  // Exemple de calcul en utilisant Dao
    }
}

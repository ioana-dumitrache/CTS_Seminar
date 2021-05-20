package cts.dumitrache.ioana.g1080.pattern.Singleton;
public interface IRobotSoftware {
    public void trimiteCerere(String denumire);

    public String getInformatii(String categorie);

    public void prelucrareCerere(String tip);

    public int getIdRobot();
}
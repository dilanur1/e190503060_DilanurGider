public class Kunde extends Person{
    int kundenid;
    ArrayList<Personal> betreuendePersonal=new ArrayList();
    Zahlungsinfo z =new Zahlungsinfo();
    ArrayList<Produkt> einkaufteProdukt=new ArrayList();

    public void setBetreuendePersonal(ArrayList<Personal> betreuendePersonal) {
        this.betreuendePersonal = betreuendePersonal;
    }

    public void setZ(Zahlungsinfo z) {
        this.z = z;
    }

    public void setKundenid(int kundenid) {
        this.kundenid = kundenid;

    }

    public void setEinkaufteProdukt(ArrayList<Produkt> einkaufteProdukt) {
        this.einkaufteProdukt = einkaufteProdukt;
    }

    public int getKundenid() {
        return kundenid;
    }

    public ArrayList<Personal> getBetreuendePersonal() {
        return betreuendePersonal;
    }

    public ArrayList<Produkt> getEinkaufteProdukt() {
        return einkaufteProdukt;
    }

    public Zahlungsinfo getZ() {
        return z;
    }

}


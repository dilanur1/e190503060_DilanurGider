public class Produkt {
    int pid;
    double preis;
    String kategorie;
    int garantieZeit;
    String modell;
    boolean lagerbestand;
    double abmessung;

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public int getGarantieZeit() {
        return garantieZeit;
    }

    public boolean isLagerbestand() {
        return lagerbestand;
    }

    public String getModell() {
        return modell;
    }

    public int getPid() {
        return pid;
    }

    public double getPreis() {
        return preis;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setAbmessung(double abmessung) {
        this.abmessung = abmessung;
    }

    public void setLagerbestand(boolean lagerbestand) {
        this.lagerbestand = lagerbestand;
    }

    public void setGarantieZeit(int garantieZeit) {
        this.garantieZeit = garantieZeit;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public double getAbmessung() {
        return abmessung;
    }
}

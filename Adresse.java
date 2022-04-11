public class Adresse {
    int id;
    String strasse;
    String stadt;
    int hausnummer;
    int plz;

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public int getId() {
        return id;
    }

    public int getPlz() {
        return plz;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getStadt() {
        return stadt;
    }
}

public class Personal extends Person{
    int personalnummer;
    String benutzername;
    String passwort;
    ArrayList<Kunde> betreuteKunde;

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public void setBetreuteKunde(ArrayList<Kunde> betreuteKunde) {
        this.betreuteKunde = betreuteKunde;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public int getPersonalnummer() {
        return personalnummer;
    }

    public String getPasswort() {
        return passwort;
    }

    public ArrayList<Kunde> getBetreuteKunde() {
        return betreuteKunde;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public void setPersonalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }

}

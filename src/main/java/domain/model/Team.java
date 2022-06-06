package domain.model;


public class Team {
    private int id;
    private String naam;
    private String coureurs;
    private String powerunit;
    private int wc;


    public Team(String naam, String coureurs, String powerunit, int wc){
        this.setNaam(naam);
        this.setCoureurs(coureurs);
        this.setPowerunit(powerunit);
        this.setWc(wc);
    }


    public Team (String naam){
        this.setNaam(naam);
    }




    public boolean equals (Object o){
        if (o instanceof Team){
            return this.getNaam().equals(((Team)o).getNaam());
        }
        return false;
    }




    public String getNaam(){
        return naam;
    }

    public void setNaam(String naam) {
        if (naam == null || naam.isEmpty()){
            throw new IllegalArgumentException("Vul een correcte teamnaam in.");
        }
        this.naam = naam;
    }

    public String getCoureurs(){
        return coureurs;
    }

    public void setCoureurs(String coureurs){
        if (coureurs == null || coureurs.isEmpty()){
            throw new IllegalArgumentException("Vul de juiste coureurs in.");
        }
        this.coureurs = coureurs;
    }


    public String getPowerunit(){
        return powerunit;
    }


    public void setPowerunit(String powerunit){
        if (powerunit == null || powerunit.isEmpty()){
            throw new IllegalArgumentException("Vul een juiste powerunit in.");
        }
        this.powerunit = powerunit;
    }

    public int getWc(){
        return wc;
    }

    public void setWc(int wc){
        if (wc < 0){
            throw new IllegalArgumentException("Nummer moet positief zijn");
        }
        this.wc = wc;
    }

    public int getId(){
        return id;
    }


    public void setId(int id) {
        if (id < 0)
            throw new IllegalArgumentException("ID moet positief zijn.");
        this.id = id;
    }




    public String teamnaam(String teamNaam) {
        return teamNaam;
    }

    public String coureurs(String teamCoureurs) {
        return teamCoureurs;
    }

    public String powerunit(String teamPowerunit) {
        return teamPowerunit;
    }

    public int wchamps(int teamWchamps) {return teamWchamps;}


}

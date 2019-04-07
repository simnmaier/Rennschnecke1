public abstract class Rennschnecke {
    private String name;
    private String rasse;
    private int maxgesch;
    private int strecke;

    public Rennschnecke (String name, String rasse, int maxgesch, int strecke){
        this.name = name;
        this.rasse = rasse;
        this. maxgesch = maxgesch;
        this.strecke = strecke;
    }

    public Rennschnecke(){}

    public int krieche (int maxgesch){
        int gekrochen = (int) (Math.random()*maxgesch);
        return gekrochen;
    }

    public String toString(){
        return "Die Schnecke heißt " + this.name + ", ist von der Rasse " + this.rasse + " und hat bereits " + this.strecke + " zurückgelegt" + "\n";
    }

}

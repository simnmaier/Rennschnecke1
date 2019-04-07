public class Rennen extends Rennschnecke {
    private String name;
    private int teilnehmer;
    private  Rennschnecke [] rennschnecken;

    public Rennen (String name, int teilnehmer){
        this.name = name;
        teilnehmer = 1;
        this.teilnehmer = teilnehmer;
    }

    public void addRennschnecke (Rennschnecke neueSchnecke){
        Rennschnecke [] neueSchnecken = new Rennschnecke [this.rennschnecken.length+1];
        for (int i =0; i<this.rennschnecken.length; i++){
            neueSchnecken [i] = this.rennschnecken [i];

            neueSchnecken[this.rennschnecken.length] = neueSchnecke;
            neueSchnecken = this.rennschnecken;
        }
    }

    public void removeRennschnecke (String name){
                }

    public String toString(){
        return "Das Rennen mit dem Namen " + this.name + " hat " + this.rennschnecken.length + " Teilnehmer" + "\n";
    }

    public static void main (String [] args){
        Rennen ty = new Rennen("Racing", 3);
        Rennschnecke gerry = new Rennschnecke("Gerry", "Tigerschnecke", 23, 12){};

        ty.addRennschnecke(gerry);

        System.out.println(gerry);

    }

    }



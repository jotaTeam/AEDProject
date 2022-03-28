package Models;

import java.io.Serializable;

public class Sides implements Serializable {

    private int id;
    private String sideName;
    private int isWinner;
    private int idWar;

    public Sides(int id, String sideName, int isWinner, int idWar) {
        this.id = id;
        this.sideName = sideName;
        this.isWinner = isWinner;
        this.idWar = idWar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSideName() {
        return sideName;
    }

    public void setSideName(String sideName) {
        this.sideName = sideName;
    }

    public int isWinner() {
        return isWinner;
    }

    public void setWinner(int winner) {
        isWinner = winner;
    }

    public int getIdWar() {
        return idWar;
    }

    public void setIdWar(int idWar) {
        this.idWar = idWar;
    }
}

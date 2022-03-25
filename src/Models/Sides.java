package Models;

import java.io.Serializable;

public class Sides implements Serializable {

    private int id;
    private String sideName;
    private boolean isWinner;
    private int idWar;

    public Sides(int id, String sideName, boolean isWinner, int idWar) {
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

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    public int getIdWar() {
        return idWar;
    }

    public void setIdWar(int idWar) {
        this.idWar = idWar;
    }
}

package Models;

import java.io.Serializable;
import java.sql.Date;

public class CountrySide implements Serializable {

    private int id;
    private Date startDate;
    private Date endDate;
    int idSide;
    int idCountry;

    public CountrySide(int id, Date startDate, Date endDate, int idSide, int idCountry) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idSide = idSide;
        this.idCountry = idCountry;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getIdSide() {
        return idSide;
    }

    public void setIdSide(int idSide) {
        this.idSide = idSide;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }
}

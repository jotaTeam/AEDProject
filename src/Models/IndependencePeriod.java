package Models;

import java.io.Serializable;
import java.sql.Date;

public class IndependencePeriod implements Serializable {


    private int id;
    private Date startDate;
    private Date endDate;
    private int idCountry;

    public IndependencePeriod(int id, Date startDate, Date endDate, int idCountry) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }
}

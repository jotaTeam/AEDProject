package Models;

import java.io.Serializable;
import java.sql.Date;

public class Wars implements Serializable {

    private int id;
    private String name;
    private Date initDate;
    private Date endDate;

    public Wars( int id, String name, Date initDate, Date endDate) {
        this.name = name;
        this.id = id;
        this.initDate = initDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getInitDate() {
        return initDate;
    }

    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}

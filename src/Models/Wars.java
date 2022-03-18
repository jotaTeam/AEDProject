package Models;

import java.util.Date;

public class Wars {


    private String name;
    private int id;
    private Date initDate;
    private Date endDate;

    public Wars(String name, int id, Date initDate, Date endDate) {
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

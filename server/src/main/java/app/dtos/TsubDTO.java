package app.dtos;

import java.util.Date;

public class TsubDTO {
    private int id;
    private String subject;
    private Date addTime;
    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "TsubDTO{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", addTime=" + addTime +
                ", owner='" + owner + '\'' +
                '}';
    }
}

package app.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "tsubject")
public class TsubEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;

    private String subject;
    private Date addtime;
    private String owner;

    @Override
    public String toString() {
        return "TsubEntity{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", addTime=" + addtime +
                ", owner='" + owner + '\'' +
                '}';
    }

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
        return addtime;
    }

    public void setAddTime(Date addTime) {
        this.addtime = addTime;
    }
}

package app.dtos;

import java.util.Date;

public class TrInfoDTO {
    private int id ;
    private int teacherid;
    private int subject_id;
    private int num;
    private String status;
    private Date addtime;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "TrInfoDTO{" +
                "id=" + id +
                ", teacherid=" + teacherid +
                ", subject_id=" + subject_id +
                ", num=" + num +
                ", status='" + status + '\'' +
                ", addtime=" + addtime +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}

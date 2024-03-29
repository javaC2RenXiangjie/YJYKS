package app.entities;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "viosinfo")
public class FileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private String title;
    private String content;
    @Column(name = "view_num")
    private int viewNum;
    @Column(name = "admin_id")
    private int adminId;
    @Column(name = "newstag_id")
    private int newstagId;
    private String img;
    private String remark;
    @Column(name = "addtime")
    private Date addTime;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getViewNum() {
        return viewNum;
    }

    public void setViewNum(int viewNum) {
        this.viewNum = viewNum;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getNewstagId() {
        return newstagId;
    }

    public void setNewstagId(int newstagId) {
        this.newstagId = newstagId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "FileDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", viewNum=" + viewNum +
                ", adminId=" + adminId +
                ", newstagId=" + newstagId +
                ", img='" + img + '\'' +
                ", remark='" + remark + '\'' +
                ", addTime=" + addTime +
                '}';
    }
}

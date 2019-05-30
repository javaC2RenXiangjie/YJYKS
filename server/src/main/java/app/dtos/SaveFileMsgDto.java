package app.dtos;

import java.util.Date;

public class SaveFileMsgDto {
    private boolean successedOrNot;
    private String fileName;
    private Date createDate;

    public boolean isSuccessedOrNot() {
        return successedOrNot;
    }

    public void setSuccessedOrNot(boolean successedOrNot) {
        this.successedOrNot = successedOrNot;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "SaveFileMsgDto{" +
                "successedOrNot=" + successedOrNot +
                ", fileName='" + fileName + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}

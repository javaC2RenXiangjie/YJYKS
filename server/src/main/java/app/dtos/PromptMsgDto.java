package app.dtos;

/**
 *提示信息
 */
public class PromptMsgDto {

    private String msgContent;
    private int code;
    private Object ob;

    public Object getOb() {
        return ob;
    }

    public void setOb(Object ob) {
        this.ob = ob;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    @Override
    public String toString() {
        return "PromptMsgDto{" +
                "msgContent='" + msgContent + '\'' +
                ", code=" + code +
                ", ob=" + ob +
                '}';
    }
}

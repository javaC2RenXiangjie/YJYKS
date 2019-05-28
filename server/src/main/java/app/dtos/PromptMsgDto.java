package app.dtos;

/**
 *提示信息
 */
public class PromptMsgDto {

    private String msgContent;

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
                '}';
    }
}

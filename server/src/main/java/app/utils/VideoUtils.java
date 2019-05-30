package app.utils;

import app.dtos.SaveFileMsgDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class VideoUtils {

    @Value("${video_store_path}")
    private String video_store_path;

    /**
     * 存视频
     * @param video
     * @param videoName
     * @return
     */
    public SaveFileMsgDto saveVideo(MultipartFile video, String videoName) {
        SaveFileMsgDto saveFileMsgDto = new SaveFileMsgDto();

//      时间格式化
        Date date = new Date();
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        saveFileMsgDto.setFileName(simpleDateFormat.format(date) + videoName);
        saveFileMsgDto.setCreateDate(date);
//      存储路径问题
        if(!new File(video_store_path).exists()){
            new File(video_store_path).mkdir();
        }


//      设置视频存储的位置和视频名称
        File savefile = new File(video_store_path, saveFileMsgDto.getFileName());

//      存视频
        try (FileOutputStream fos = new FileOutputStream(savefile)){
            fos.write(video.getBytes());
            fos.flush();
            saveFileMsgDto.setSuccessedOrNot(true);
            return saveFileMsgDto;
        }catch (IOException e) {
            System.out.println(new IOException(e));
            saveFileMsgDto.setSuccessedOrNot(false);
            return saveFileMsgDto;
        }
    }
}

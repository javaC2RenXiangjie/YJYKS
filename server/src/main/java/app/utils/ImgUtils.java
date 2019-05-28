package app.utils;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 存储图片
 */
@Service
public class ImgUtils {

    @Value("${img_store_path}")
    private String img_store_path;

    /**
     * 存图片
     * @param img
     */
    public Boolean saveImg(MultipartFile img) {
//      存储路径问题
        if(!new File(img_store_path).exists()){
            new File(img_store_path).mkdir();
        }

//      设置图片存储的位置和图片名称
        File savefile = new File(img_store_path, img.hashCode() + "jpg");

//      存图片
        try (FileOutputStream fos = new FileOutputStream(savefile)){
            fos.write(img.getBytes());
            fos.flush();
            return true;
        }catch (IOException e) {
            System.out.println(new IOException(e));
            return false;
        }
    }

    /**
     * 取图片
     */
    public void getImg() {
        //
    }

}

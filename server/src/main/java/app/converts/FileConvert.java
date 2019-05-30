package app.converts;

import app.dtos.FileDTO;
import app.entities.FileEntity;
import org.springframework.stereotype.Service;


@Service
public class FileConvert {
    /**
     * fileDto convert to fileEntity
     * @return
     */
    public FileEntity FileDtoToEntity(FileDTO fileDTO){
        FileEntity fileEntity = new FileEntity();
        fileEntity.setId(fileDTO.getId());
        fileEntity.setTitle(fileDTO.getTitle());
        fileEntity.setContent(fileDTO.getContent());
        fileEntity.setViewNum(fileDTO.getViewNum());
        fileEntity.setAdminId(fileDTO.getAdminId());
        fileEntity.setNewstagId(fileDTO.getNewstagId());
        fileEntity.setImg(fileDTO.getImg());
        fileEntity.setRemark(fileDTO.getRemark());
        fileEntity.setAddTime(fileDTO.getAddTime());
        return fileEntity;
    }

    /**
     * fileEntity convert to fileDto
     * @param fileEntity
     * @return
     */
    public FileDTO FileEntityToDto(FileEntity fileEntity){
        FileDTO fileDTO = new FileDTO();
        fileDTO.setId(fileEntity.getId());
        fileDTO.setTitle(fileEntity.getTitle());
        fileDTO.setContent(fileEntity.getContent());
        fileDTO.setViewNum(fileEntity.getViewNum());
        fileDTO.setAdminId(fileEntity.getAdminId());
        fileDTO.setNewstagId(fileEntity.getNewstagId());
        fileDTO.setImg(fileEntity.getImg());
        fileDTO.setRemark(fileEntity.getRemark());
        fileDTO.setAddTime(fileEntity.getAddTime());
        return fileDTO;
    }
}

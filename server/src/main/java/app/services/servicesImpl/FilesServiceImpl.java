package app.services.servicesImpl;

import app.converts.FileConvert;
import app.dtos.FileDTO;
import app.entities.FileEntity;
import app.repos.FileRepo;
import app.services.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilesServiceImpl implements FilesService {

    @Autowired
    private FileRepo fileRepo;

    @Autowired
    private FileConvert fileConvert;

    @Override
    public List<FileDTO> getAllFiles() {
        List<FileDTO> fileEntities = new ArrayList<FileDTO>();
        for (FileEntity fileEntity: fileRepo.getAllViosInfo()) {
            fileEntities.add(fileConvert.FileEntityToDto(fileEntity));
        }
        return fileEntities;
    }
}

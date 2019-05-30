package app.controllers;

import app.dtos.FileDTO;
import app.dtos.PromptMsgDto;
import app.dtos.UserDTO;
import app.services.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/files")
public class FilesController {

    @Autowired
    private FilesService filesService;

    @GetMapping(value = "")
    public List<FileDTO> getAllFiles(){
        return filesService.getAllFiles();
    }
}

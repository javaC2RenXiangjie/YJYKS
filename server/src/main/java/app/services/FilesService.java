package app.services;

import app.dtos.FileDTO;

import java.util.List;

public interface FilesService {
    List<FileDTO> getAllFiles();
}

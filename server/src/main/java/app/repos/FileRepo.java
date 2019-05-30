package app.repos;

import app.entities.FileEntity;
import app.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface FileRepo extends CrudRepository<FileEntity, Long>{

    @Transactional
    @Query(value = "select * from viosinfo", nativeQuery = true)
    List<FileEntity> getAllViosInfo();
}

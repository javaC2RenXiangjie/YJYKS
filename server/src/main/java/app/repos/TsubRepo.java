package app.repos;

import app.entities.TsubEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface TsubRepo extends CrudRepository<TsubEntity, Long> {

    @Transactional
    @Query(value = "select * from tsubject;", nativeQuery = true)
    List<TsubEntity> getAllTsub();

}

package app.repos;

import app.entities.TrInfoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface TrInfoRepo extends CrudRepository<TrInfoEntity, Long>{

    @Transactional
    @Query(value = "select * from trinfo;", nativeQuery = true)
    List<TrInfoEntity> getAllTr();
}

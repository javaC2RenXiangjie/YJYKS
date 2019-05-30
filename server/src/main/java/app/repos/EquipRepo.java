package app.repos;

import app.entities.EquipEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface EquipRepo extends CrudRepository<EquipEntity, Long> {

    @Transactional
    @Query(value = "select * from equip", nativeQuery = true)
    List<EquipEntity> getAllEquipment();
}

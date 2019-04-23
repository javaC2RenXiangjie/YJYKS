package app.repos;

import app.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepo extends CrudRepository<UserEntity, Long>{

}

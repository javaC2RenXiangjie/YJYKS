package app.repos;

import app.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginRepo extends CrudRepository<UserEntity, Long>{

    @Query(value = "select * from user where email = ?1 and pwd = ?2 ", nativeQuery = true)
    List<UserEntity> login(String account, String password);
}

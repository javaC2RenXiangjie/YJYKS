package app.repos;

import app.dtos.UserDTO;
import app.entities.UserEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, Long> {

    @Transactional
    @Query(value = "select * from user", nativeQuery = true)
    List<UserEntity> getUserInfo();

    @Query(value = "select * from user where email = ?1", nativeQuery = true)
    UserEntity findByEmail(String email);

}

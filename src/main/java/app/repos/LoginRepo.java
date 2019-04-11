package app.repos;

import app.dtos.UserDTO;
import app.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepo extends CrudRepository<UserDTO, Long> {

    @Query(value = "select * from user where user.id = 1, nativeQuery = true")
    UserEntity getUserInfo();
}

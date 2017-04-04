package cn.zmlio.microservice.core.repository;

import cn.zmlio.microservice.core.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by zml on 2017/4/1.
 */
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    @Query("select user from UserEntity user where username=?1 or email=?1 or telephone=?1")
    UserEntity findByPrincipal(String principal);

}

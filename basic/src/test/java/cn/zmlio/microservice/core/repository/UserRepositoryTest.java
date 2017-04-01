package cn.zmlio.microservice.core.repository;

import cn.zmlio.microservice.core.RepositoryConfiguration;
import cn.zmlio.microservice.core.domain.RoleEntity;
import cn.zmlio.microservice.core.domain.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Set;

/**
 * Created by zml on 2017/4/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE, classes = RepositoryConfiguration.class)
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void save(){
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername("wangwu");
        userEntity.setPassword("admin");
        userRepository.save(userEntity);
    }

    @Test
    public void findUserEntityByPrinciple() {
        UserEntity userEntity1 = userRepository.findByPrincipal("wangwu");
        Set<RoleEntity> roles = userEntity1.getRoles();
        for (RoleEntity role:roles){
            System.out.println(role.getId());
        }
    }


}
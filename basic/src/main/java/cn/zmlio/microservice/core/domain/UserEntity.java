package cn.zmlio.microservice.core.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by zml on 2017/4/1.
 */
@Entity
@Table(name = "t_sys_user")
@Data
public class UserEntity extends AbstractEntity {

    @Column(length = 20, unique = true)
    private String username;

    @Column(length = 40)
    private String password;

    @Column(length = 40)
    private String encrypt;

    @Column(length = 64, unique = true)
    private String email;

    @Column(length = 15, unique = true)
    private String telephone;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "t_ref_user_role", joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<RoleEntity> roles;
}

package cn.zmlio.microservice.core.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by zml on 2017/4/1.
 */
@Entity
@Table(name = "t_sys_role")
@Data
public class RoleEntity extends AbstractEntity {

    @Column(length = 40)
    private String roleName;

    @Column(length = 128)
    private String roleKey;

}

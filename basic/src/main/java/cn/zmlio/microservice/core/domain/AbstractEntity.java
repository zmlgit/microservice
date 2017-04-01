package cn.zmlio.microservice.core.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by zml on 2017/3/31.
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Integer id;

    @Column(name = "create_time", updatable = false)
    @Getter
    @Setter
    private Date createTime = new Date();

    @Column(name = "update_time")
    @Getter
    @Setter
    private Date updateTime = new Date();

    @Getter
    @Setter
    @Column(name = "version", length = 4)
    private Integer version;

    @Getter
    @Setter
    @Column(name = "create_user", length = 20)
    private String createUser;

    @Getter
    @Setter
    @Column(name = "update_user", length = 20)
    private String updateUser;
}

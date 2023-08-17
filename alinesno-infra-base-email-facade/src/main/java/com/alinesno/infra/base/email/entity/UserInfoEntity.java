package com.alinesno.infra.base.email.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;

/**
 * 用户实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("user_info")
public class UserInfoEntity extends InfraBaseEntity {
    /**
     * 用户唯一标识符
     */
    private Long id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户邮箱地址
     */
    private String email;

    /**
     * 用户登录密码
     */
    private String password;

    /**
     * 其他用户信息（如职位、部门等）
     */
    @TableField("other_info")
    private String otherInfo;

    // 省略 getter 和 setter 方法
}

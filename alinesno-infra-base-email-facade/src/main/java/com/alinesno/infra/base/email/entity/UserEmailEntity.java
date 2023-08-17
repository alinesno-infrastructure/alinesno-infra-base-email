package com.alinesno.infra.base.email.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 用户-邮件关系实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("user_email")
public class UserEmailEntity extends InfraBaseEntity {
    /**
     * 关系唯一标识符
     */
    private Long id;

    /**
     * 用户的id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 邮件的id
     */
    @TableField("email_id")
    private Long emailId;

    /**
     * 关系类型（如发件人、收件人、抄送人等）
     */
    private String type;

    // 省略 getter 和 setter 方法
}

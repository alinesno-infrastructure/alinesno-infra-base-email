package com.alinesno.infra.base.email.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 用户-标签关系实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("user_label")
public class UserLabelEntity extends InfraBaseEntity {
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
     * 标签的id
     */
    @TableField("label_id")
    private Long labelId;

    // 省略 getter 和 setter 方法
}

package com.alinesno.infra.base.email.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 标签实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("label")
public class LabelEntity extends InfraBaseEntity {
    /**
     * 标签唯一标识符
     */
    private Long id;

    /**
     * 标签所属用户的id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 标签名称
     */
    private String name;

    // 省略 getter 和 setter 方法
}

package com.alinesno.infra.base.email.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

/**
 * 文件夹实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("folder")
public class FolderEntity extends InfraBaseEntity {
    /**
     * 文件夹唯一标识符
     */
    private Long id;

    /**
     * 文件夹所属用户的id
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 文件夹名称
     */
    private String name;

    /**
     * 父文件夹的id（顶级文件夹的父文件夹id为空）
     */
    @TableField("parent_folder_id")
    private Long parentFolderId;

    /**
     * 文件夹创建的时间戳
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    // 省略 getter 和 setter 方法
}

package com.alinesno.infra.base.email.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 文件实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("file")
public class FileEntity extends InfraBaseEntity {
    /**
     * 文件唯一标识符
     */
    private Long id;

    /**
     * 文件的名称
     */
    @TableField("file_name")
    private String fileName;

    /**
     * 文件在服务器上的存储路径
     */
    @TableField("storage_path")
    private String storagePath;

    /**
     * 文件大小
     */
    private Integer size;

    /**
     * 文件类型（如文档、图片、压缩文件等）
     */
    private String type;

    // 省略 getter 和 setter 方法
}

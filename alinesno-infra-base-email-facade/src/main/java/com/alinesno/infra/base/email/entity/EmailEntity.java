package com.alinesno.infra.base.email.entity;

import com.alinesno.infra.common.facade.mapper.entity.InfraBaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

/**
 * 邮件实体类
 *
 * @author luoxiaodong
 * @version 1.0.0
 */
@TableName("email")
public class EmailEntity extends InfraBaseEntity {
    /**
     * 邮件唯一标识符
     */
    private Long id;

    /**
     * 邮件发送者的用户id
     */
    @TableField("sender_id")
    private Long senderId;

    /**
     * 邮件接收者的用户id（可以是多个）
     */
    @TableField("recipient_id")
    private Long recipientId;

    /**
     * 邮件主题
     */
    private String subject;

    /**
     * 邮件正文内容
     */
    private String content;

    /**
     * 邮件附件（可以是多个）
     */
    private String attachments;

    /**
     * 邮件发送的时间戳
     */
    @TableField("send_time")
    private LocalDateTime sendTime;

    /**
     * 邮件状态（如已读、未读、已回复等）
     */
    private String status;

    // 省略 getter 和 setter 方法
}

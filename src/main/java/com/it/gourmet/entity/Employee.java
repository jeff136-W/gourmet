package com.it.gourmet.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("employee")
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long employeeId;
    /**
     * 用户昵称
     */
    private String name;
    /**
     * 登录名
     */
    private String username;
    /**
     * 密码
     */
    private String password;

    private String phone;
    /**
     * 性别
     */
    private Integer gender;

    private String idNumber;
    /**
     * 账户状态（0:注销  1 ：存在）
     */
    private Integer status;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 创建人
     */
    private Long createBy;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
    /**
     * 更新人
     */
    private Long updateBy;

}

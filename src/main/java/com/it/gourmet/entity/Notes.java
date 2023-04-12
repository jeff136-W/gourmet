package com.it.gourmet.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("notes")
public class Notes implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 笔记信息表
	 */
	@TableId
	private Long notesId;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String content;
	/**
	 * 审核状态(0-不通过 1-审核中 2审核通过)
	 */
	private Integer status;
	/**
	 * 
	 */
	private LocalDateTime createTime;
	/**
	 * 
	 */
	private Long createBy;
	/**
	 * 
	 */
	private LocalDateTime updateTime;
	/**
	 * 
	 */
	private Long updateBy;

}

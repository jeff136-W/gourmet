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
@TableName("collect")
public class Collect implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long collectId;
	/**
	 * 
	 */
	private String name;
	/**
	 * 菜谱ID
	 */
	private Long foodsId;
	/**
	 * 笔记ID
	 */
	private Long notesId;
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

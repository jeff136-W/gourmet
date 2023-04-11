package com.it.gourmet.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("praise")
public class Praise implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 笔记点赞信息
	 */
	@TableId
	private Long praiseId;
	/**
	 * 
	 */
	private String name;
	/**
	 * 笔记ID
	 */
	private Long notesId;
	/**
	 * 菜谱ID
	 */
	private Long foodsId;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Long createBy;
	/**
	 * 
	 */
	private Date updateTime;
	/**
	 * 
	 */
	private Long updateBy;

}
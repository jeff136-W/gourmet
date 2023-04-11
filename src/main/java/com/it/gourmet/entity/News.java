package com.it.gourmet.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("news")
public class News implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 饮食资讯信息表
	 */
	@TableId
	private Long newsId;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String content;
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

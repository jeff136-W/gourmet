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
@TableName("classify")
public class Classify implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long classifyId;
	/**
	 * 菜谱大类
	 */
	private String name;
	/**
	 * 
	 */
	private String description;
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

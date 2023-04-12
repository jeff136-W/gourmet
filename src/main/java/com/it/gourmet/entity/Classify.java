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

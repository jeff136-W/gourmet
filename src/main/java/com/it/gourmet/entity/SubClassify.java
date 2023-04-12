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
@TableName("sub_classify")
public class SubClassify implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 菜谱小类
	 */
	@TableId
	private Long subClassifyId;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String description;
	/**
	 * 菜谱大类ID
	 */
	private Long classifyId;
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

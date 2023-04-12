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
@TableName("foods_menu")
public class FoodsMenu implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long foodMenuId;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private String description;
	/**
	 * 菜谱标签
	 */
	private String tips;
	/**
	 * 菜谱小类ID
	 */
	private Long subClassifyId;
	/**
	 * 文件ID
	 */
	private Long fileId;
	/**
	 * 文件名
	 */
	private String fileName;
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

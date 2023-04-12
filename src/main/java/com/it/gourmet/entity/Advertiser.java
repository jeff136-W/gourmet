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
@TableName("advertiser")
public class Advertiser implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long advertiserId;
	/**
	 * 公告名称
	 */
	private String name;
	/**
	 * 公告内容
	 */
	private String content;
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

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
@TableName("comment_notes")
public class CommentNotes implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long commentNotesId;
	/**
	 * 评论内容
	 */
	private String content;
	/**
	 * 关联的模块ID
	 */
	private Long fireignId;
	/**
	 * 
	 */
	private LocalDateTime createTime;
	/**
	 * 评论人
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

package com.whatsupBlog.application.dto;

import lombok.Data;

@Data
public class BoardDto {
	private String title;
	private String subtitle;
	private String boardCode;
	private String content;
	private String writer;
}

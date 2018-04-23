package com.study.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class User {
	private Long id;
 	private String name;
	private Integer age;
}

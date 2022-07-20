package com.example.demo.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("details of contact model")
public class Contact {

	@ApiModelProperty("id of contact")
	private String id;
	@ApiModelProperty("name of contact")
	private String name;
	@ApiModelProperty("phone no. of contact")
	private String phone;
}

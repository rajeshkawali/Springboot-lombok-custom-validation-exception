package com.rajeshkawali.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Rajesh_Kawali
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Company {

	@JsonProperty("title")
	public String title;
	@JsonProperty("email")
	public String email;
	@JsonProperty("phone")
	public String phone;
	@JsonProperty("location")
	public Location location;

}
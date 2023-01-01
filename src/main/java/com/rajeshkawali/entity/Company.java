package com.rajeshkawali.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
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
@Embeddable
public class Company {

	@Column(name = "title")
	public String title;

	@Column(name = "email")
	public String email;

	@Column(name = "phone")
	public String phone;

	//@Column(name = "location")
	@Embedded
	public Location location;

}
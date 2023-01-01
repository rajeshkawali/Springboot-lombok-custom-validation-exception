package com.rajeshkawali.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
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
public class Location {

	@Column(name = "country")
	public String country;
	@Column(name = "address")
	public String address;

}

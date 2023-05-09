package com.kirti.portal.payloads;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomerMastersDto {
	
	private String Pk_Customer_Master;
	@NotEmpty
	@Size(min=3)
	@Pattern(regexp = "[A-Za-z]+$")
	private String Cust_First_Name;
	@Size(min=3)
	private String Cust_Last_Name;
	private String Address;
	private String City;
	private String State;
	@Size(max=10,min=10)
	private String ContactNo;
	private String AdharCard;
	@Email(message="Email is not valid",regexp="^[A-Za-z0-9+_.-]+@cognizant.com$")
	@NotEmpty
	private String EmailId;
	private String BirthDate;
	private int MonthlySalary;
	
	
}

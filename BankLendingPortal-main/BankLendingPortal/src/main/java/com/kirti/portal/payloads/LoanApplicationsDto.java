package com.kirti.portal.payloads;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.kirti.portal.entities.CustomerMasters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoanApplicationsDto {
	
	private String Pk_Loan_Application;
	
	private int loan_Amt;
	private int no_Of_Years;
	private String purpose;
	private String app_Status;
	private String type_Of_Loan;
	private LocalDate loanAppDate;   //
	private String status;
	private CustomerMastersDto customerMasters;   //
	

}

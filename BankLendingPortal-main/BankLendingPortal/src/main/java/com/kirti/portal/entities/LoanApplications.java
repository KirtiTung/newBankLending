package com.kirti.portal.entities;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Positive;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.kirti.portal.config.StringPrefixedSequenceIdGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class LoanApplications {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq")
    @GenericGenerator(
        name = "book_seq", 
        strategy = "com.kirti.portal.config.StringPrefixedSequenceIdGenerator", 
        parameters = {
            @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = ""),
            @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%04d") })
	private String Pk_Loan_Application;
	@Positive
	private int loan_Amt;
	@Positive
	private int no_Of_Years;
	private String purpose;
	private String app_Status;
	private String type_Of_Loan;
	@Column(name="loan_App_Date")
	private LocalDate loanAppDate;   //
	private String status;
	
	@ManyToOne
	@JoinColumn(name="Fk_Loan_Application_Customer_Master")
	private CustomerMasters customerMasters;   //
	
	
	@OneToMany(mappedBy="loanApplications",cascade=CascadeType.ALL)
	private List<LoanApplications> loanApplications=new ArrayList<>();


	
	

	
	
	

}

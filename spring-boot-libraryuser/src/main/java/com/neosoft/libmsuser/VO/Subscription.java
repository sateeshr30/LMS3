package com.neosoft.libmsuser.VO;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subscription {
	
	private Long subscriptionId;
	private Date issueOn;
	private Date dueDate;
	private Date returnedOn;

}

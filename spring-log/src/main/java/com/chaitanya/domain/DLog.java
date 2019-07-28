package com.chaitanya.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name= "DI_LOG")
public class DLog {
	@JsonIgnore
	@Id
	@Column(name="ID",nullable=false)
	private int id;
	
	@JsonProperty
	@Column(name="TICKET_ID",nullable=false)
	private int ticketId;
	
	@JsonProperty
	@Column(name="ACTION_NM")
	private String actionName;
	
	@JsonProperty
	@Column(name="DESCRIPTION")
	private String description;
	
	@JsonProperty
	@Column(name="UPDATE_BY")
	private String updatedBy;
	
	@JsonProperty
	@Column(name="UPDATE_DATE")
	private Date updateDate;
	
	@JsonProperty
	@Column(name="STATUS_NM")
    private String statusName;
    
    
    public DLog() {
    	
    }
	public DLog(int id, int ticketId, String actionNm, String description, String updatedBy, Date date,
			String statusNm) {
		super();
		this.id = id;
		this.ticketId = ticketId;
		this.actionName = actionName;
		this.description = description;
		this.updatedBy = updatedBy;
		this.updateDate = updateDate;
		this.statusName = statusName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getActionNm() {
		return actionName;
	}
	public void setActionNm(String actionNm) {
		this.actionName = actionNm;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getDate() {
		return updateDate;
	}
	public void setDate(Date date) {
		this.updateDate = updateDate;
	}
	public String getStatusNm() {
		return statusName;
	}
	public void setStatusNm(String statusNm) {
		this.statusName = statusName;
	}
    
    
    

}

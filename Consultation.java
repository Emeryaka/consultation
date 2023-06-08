package model;
// Generated 5 juin 2023, 00:50:19 by Hibernate Tools 4.3.6.Final

import java.util.Date;

/**
 * Consultation generated by hbm2java
 */
public class Consultation implements java.io.Serializable {

	private Integer consultationId;
	private Date dateConsultation;
	private Integer patientId;
	private Integer medecinId;

	public Consultation() {
	}

	public Consultation(Date dateConsultation, Integer patientId, Integer medecinId) {
		this.dateConsultation = dateConsultation;
		this.patientId = patientId;
		this.medecinId = medecinId;
	}

	public Integer getConsultationId() {
		return this.consultationId;
	}

	public void setConsultationId(Integer consultationId) {
		this.consultationId = consultationId;
	}

	public Date getDateConsultation() {
		return this.dateConsultation;
	}

	public void setDateConsultation(Date dateConsultation) {
		this.dateConsultation = dateConsultation;
	}

	public Integer getPatientId() {
		return this.patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public Integer getMedecinId() {
		return this.medecinId;
	}

	public void setMedecinId(Integer medecinId) {
		this.medecinId = medecinId;
	}

}
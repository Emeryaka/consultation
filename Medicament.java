package model;
// Generated 5 juin 2023, 00:50:19 by Hibernate Tools 4.3.6.Final

/**
 * Medicament generated by hbm2java
 */
public class Medicament implements java.io.Serializable {

	private Integer medicamentId;
	private String nom;

	public Medicament() {
	}

	public Medicament(String nom) {
		this.nom = nom;
	}

	public Integer getMedicamentId() {
		return this.medicamentId;
	}

	public void setMedicamentId(Integer medicamentId) {
		this.medicamentId = medicamentId;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}

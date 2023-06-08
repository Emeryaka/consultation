package dao;

import java.util.List;

import model.Patient;

public interface IPatientDao {

	void savePatient(Patient patient);

	void updatePatient(Patient patient);

	Patient getPatientById(int id);

	List<Patient> getAllPatient();

	void deletePatient(int id);
}

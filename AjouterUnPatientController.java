package controller;

import java.util.Date;

import dao.IPatientDao;
import dao.PatientDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Patient;

public class AjouterUnPatientController {

	@FXML
	private TextField adresseField;

	@FXML
	private TextField dateNaissanceField;

	@FXML
	private TextField nomField;

	@FXML
	private TextField prenomField;

	IPatientDao patientDao = new PatientDao();

	public void ajouterPatient() {
		Alert alert;
		Patient patient = new Patient();

//		Verification des champs vides
		if (nomField.getText().isEmpty() || prenomField.getText().isEmpty()) {
			alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error Message");
			alert.setHeaderText(null);
			alert.setContentText("Remplissez tous les champs s'il vous plait ");
			alert.showAndWait();
		}  else {

				patient.setNom(nomField.getText());
//				patient.setDateNaissance(Date.parse(dateNaissanceField.getValue().toString()));
				patient.setNom(prenomField.getText());
				patientDao.savePatient(patient);
			}		
//			 System.out.println(verif);
		}



	@FXML
	void annuler() {

	}

}

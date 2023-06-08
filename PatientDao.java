package dao;

import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;


import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.Database;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Patient;
import utils.HibernateUtil;


public class PatientDao implements IPatientDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.javaguides.hibernate.dao.IStudentDao#saveStudent(net.javaguides.hibernate
	 * .model.Student)
	 */
	@Override
	public void savePatient(Patient patient) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start the transaction
			transaction = session.beginTransaction();

			// save student object
			session.save(patient);

			// commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.javaguides.hibernate.dao.IStudentDao#updateStudent(net.javaguides.
	 * hibernate.model.Student)
	 */
	@Override
	public void updatePatient(Patient patient) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start the transaction
			transaction = session.beginTransaction();

			// save student object
			session.saveOrUpdate(patient);

			// commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.javaguides.hibernate.dao.IStudentDao#getStudentById(long)
	 */
	@Override
	public Patient getPatientById(int id) {
		Transaction transaction = null;
		Patient patient = null;
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			// start the transaction
			transaction = session.beginTransaction();

			// get student object
			patient = session.byId(Patient.class).getReference(id);
			// or student = session.get(Student.class, id);
			// or student = session.load(Student.class, id);
			// or commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}

		}

		return patient;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.javaguides.hibernate.dao.IStudentDao#getAllStudents()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Patient> getAllPatient() {
		Transaction transaction = null;
		List<Patient> patient = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start the transaction
			transaction = session.beginTransaction();

			// get patient
			patient = session.createQuery("from Patient").list();

			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		return patient;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.javaguides.hibernate.dao.IStudentDao#deleteStudent(long)
	 */
	@Override
	public void deletePatient(int id) {
		Transaction transaction = null;
		Patient patient = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start the transaction
			transaction = session.beginTransaction();

			patient = session.get(Patient.class, id);
			// get student object
			session.delete(patient);
			// student = session.load(Student.class, id);
			// commit the transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
		
	}
	
	
	 /**
		 * méthode permettant de recuperer les Patient dans la base de donnée 
		 * @author Kaji17
		 */
		public ObservableList<Patient> addPatientList() {

			ObservableList<Patient> listPatient = FXCollections.observableArrayList();

			String sql = "SELECT * FROM patient";

			Connection connect = Database.connectDb();

			try {

				Patient patient;

				PreparedStatement prepare = connect.prepareStatement(sql);
				
				Object result = prepare.executeQuery();
				while (((ResultSet) result).next()) {		
					patient = new Patient(
							((ResultSet) result).getString("nom"), 
							((ResultSet) result).getString("prenom"), 
							((ResultSet) result).getString("dateNaissance"),
							((ResultSet) result).getString("adresse") );
					
					listPatient.add(patient);
					
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

			return listPatient;
		}
		
}

package controller;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class MenuController {


	@FXML
    private Button AjouterPat;

    @FXML
    private Button ConsResult;

    @FXML
    private Button EffectCons;

    @FXML
    private Button ProdOrd;

    @FXML
    private Button consulteDoc;

    private ISwitchPage page = new SwitchPage();

    public void AddPatient(){
    	page.login("../interfaces/AjouterUnPatient.fxml", AjouterPat,"");
    }
    
   
    public void EffectConsul(){
    	page.login("../interfaces/EffectuerUneConsultation.fxml", EffectCons,"");
    }
    
    public void ProdOrdonnance(){
    	page.login("../interfaces/ProduireUneOrdonnance.fxml", ProdOrd,"");
    }
    
    public void ConsulResultat(){
    	page.login("../interfaces/ConsulterResultat.fxml", ConsResult,"");
    }
    
    public void Consuldossier(){
    	page.login("../interfaces/ConsulterDossier.fxml", consulteDoc,"");
    }
}

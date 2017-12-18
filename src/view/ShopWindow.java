package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import launch.BreakingGood;
import model.Magasin.Bonus;
import model.Magasin.ModeleBonus;

public class ShopWindow {

    @FXML
    private ListView<Bonus> listeDesBonus;

    @FXML
    private Label detailBonus;
    
    @FXML
    private Label titreNote;
    
    @FXML
    private Label prix;
    
    private int wallet;
    
    private final ObjectProperty<ModeleBonus> leModele = new SimpleObjectProperty<>(new ModeleBonus());
        public ModeleBonus getLeModele() {return leModele.get();};
        public void setLeModele(ModeleBonus param) {leModele.set(param);}
        public ObjectProperty<ModeleBonus> leModeleProperty() {return leModele;}
        
    @FXML
    public void initialize() {
        
        listeDesBonus.setCellFactory((param) -> {
            return new ListCell<Bonus>(){
               @Override
                protected void updateItem(Bonus item, boolean empty) {
                    super.updateItem(item, empty);
                    if (! empty) {
                        textProperty().bind(item.laDesignationProperty());
                    } else {
                        textProperty().unbind();
                        setText("");
                    }
                }  
            };
        });
        
        listeDesBonus.getSelectionModel().selectedItemProperty().addListener((o,old,newV)->{
            if (old != null) {
                detailBonus.textProperty().unbindBidirectional(old.laDescriptionProperty());
                titreNote.textProperty().unbindBidirectional(old.laDesignationProperty());
                prix.textProperty().unbindBidirectional(old.lePrixStringProperty());
            }
            if (newV != null) {
                detailBonus.textProperty().bindBidirectional(newV.laDescriptionProperty());
                titreNote.textProperty().bindBidirectional(newV.laDesignationProperty());
                prix.textProperty().bindBidirectional(newV.lePrixStringProperty());
        }});
    }
    
        public void onRetour(){
            try{
                BreakingGood.changerFenetre("/resources/fxml/GameWindow.fxml", getClass());
            }
            catch (Exception e) {
                Logger.getLogger(LaunchWindow.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        
        public void onAchat(){
            int money = BreakingGood.getJoueur().getCash();
            int cost = listeDesBonus.getSelectionModel().getSelectedItem().getLePrixInt();
            int manque = (cost - money);

            if ((money - cost) < 0 ) { 
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("La pauvreté!!");
                alert.setHeaderText("Vous n'avez pas assez d'argent!");
                alert.setContentText("Il vous manque $" + manque + ".");
                alert.showAndWait();
            }
            else { BreakingGood.getJoueur().setCash(money-cost); }
            
       }
}

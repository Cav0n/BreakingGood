package model.Magasin;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Bonus {
	
         private final StringProperty laDesignation = new SimpleStringProperty();
                    public void setLaDesignation(String valeur){laDesignation.set(valeur);}
                    public String getLaDesignation(){return laDesignation.get();}
                    public StringProperty laDesignationProperty(){return laDesignation;}

         private final StringProperty laDescription = new SimpleStringProperty();
                    public void setLaDescription(String valeur){laDescription.set(valeur);}
                    public String getLaDescription(){return laDescription.get();}
                    public StringProperty laDescriptionProperty(){return laDescription;}
                    
         private final StringProperty img = new SimpleStringProperty();
                    public void setImg(String valeur){ img.set(valeur); }
                    public String getImg(){ return img.get(); }
                    public StringProperty imgProperty(){ return img; }
                  
                    
         private final IntegerProperty lePrixInt = new SimpleIntegerProperty();
                    public void setLePrixInt(int valeur){ lePrixInt.set(valeur); }
                    public int getLePrixInt(){ return lePrixInt.get(); }
                    public IntegerProperty lePrixIntProperty(){ return lePrixInt; }
                    
                    
         private final StringProperty lePrixString = new SimpleStringProperty();
                    public void setLePrixString(String valeur){ lePrixString.set(valeur); }
                    public String getLePrixString(){ return lePrixString.get(); }
                    public StringProperty lePrixStringProperty(){ return lePrixString; }

         private final StringProperty type = new SimpleStringProperty();
                    public void setType(String valeur){type.set(valeur);}
                    public String getType(){return type.get();}
                    public StringProperty laType(){return type;}

         public Bonus(String designation,String description, String pimg, int prix, String ptype) {
                   laDesignation.set(designation);
                   laDescription.set(description);
                   lePrixInt.set(prix);
                   lePrixString.set("$" + getLePrixInt());
                   img.set(pimg);
                   type.set(ptype);
         }
}

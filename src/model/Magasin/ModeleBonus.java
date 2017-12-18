package model.Magasin;

import javafx.beans.property.ListProperty;
import javafx.beans.property.ReadOnlyListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ModeleBonus {

    private final ObservableList<Bonus> lesBonusObs = FXCollections.observableArrayList();

    private final ListProperty<Bonus> lesBonus = new SimpleListProperty<>(lesBonusObs);
        public ObservableList<Bonus> getLesBonus() {return lesBonus.get();}
        public ReadOnlyListProperty<Bonus> lesBonusProperty() {return lesBonus;}

    public ModeleBonus() {
        lesBonusObs.add(new Bonus("Camping-car","Le camping car permet de produire 10kg de meth par minutes.","img", 7000, "Labo"));
        lesBonusObs.add(new Bonus("Maison","La maison permet de produire 30kg de meth par minutes.","img.", 300000, "Labo"));
        lesBonusObs.add(new Bonus("Laverie","La laverie permet de produire 100kg de meth par minutes.","img.", 1000000, "Labo"));
        lesBonusObs.add(new Bonus("Ballon à fond plat [mauvais]","Composant de basse qualité pour fabriquer de la meth dans un camping car.","img", 40, "Composant1"));
        lesBonusObs.add(new Bonus("Ballon à fond plat [bon]","Composant de bonne qualité pour fabriquer de la meth dans une maison.","img", 120, "Composant1"));
        lesBonusObs.add(new Bonus("Ballon à fond plat [excellent]","Composant d'excellente qualité pour fabriquer de la meth dans une laverie.","img", 300, "Composant1"));
        lesBonusObs.add(new Bonus("Erlenmeyer [mauvais]","Composant de basse qualité pour fabriquer de la meth dans unn  camping car.","img", 50, "Composant2"));
        lesBonusObs.add(new Bonus("Erlenmeyer [bon]","Composant de bonne qualité pour fabriquer de la meth dans une maison.","img", 200, "Composant2"));
        lesBonusObs.add(new Bonus("Erlenmeyer [excellent]","Composant d'excellente qualité pour fabriquer de la meth dans une laverie.","img", 450, "Composant2"));
        lesBonusObs.add(new Bonus("Pseudoéphédrine","Composant pour fabriquer de la meth dans un camping car.","img", 5, "Composant3"));
        lesBonusObs.add(new Bonus("Sceau de méthylamine","Composant pour fabriquer de la meth dans une maison.","img", 40, "Composant3"));
        lesBonusObs.add(new Bonus("Tonneau de méthylamine","Composant pour fabriquer de la meth dans une laverie.","img", 100, "Composant3"));
        lesBonusObs.add(new Bonus("Phosphore rouge","Composant pour fabriquer de la meth dans un camping car.","img", 5, "Composant4"));
        lesBonusObs.add(new Bonus("Lithium","Composant pour fabriquer de la meth dans une maison.","img",5,"Composant4"));
        lesBonusObs.add(new Bonus("Iode","Composant pour fabriquer de la meth dans une laverie","img",5,"Composant4"));
    }

}

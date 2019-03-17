package inicounter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("hellofx.fxml"));
        VBox root = new VBox();
        ObservableList list = root.getChildren();
        
        ArrayList<Combattant> combattantList = this.createCombattantList();
        combattantList.sort(Comparator.comparing(Combattant::getInitiative));
        Collections.reverse(combattantList);
        
        int i = 0;
        for(Combattant combattant: combattantList) {
            i++;
            HBox row = createRow(combattant);
            if(i == 1) {
                row.setBackground(new Background(new BackgroundFill(Color.AQUA, CornerRadii.EMPTY, Insets.EMPTY)));
            }
            list.add(row);
            
        }
        
        primaryStage.setTitle("Ini Counter");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }

    public HBox createRow(Combattant combattant) {
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        
        Label nameLabel = new Label(combattant.getName());
        nameLabel.setMinWidth(100);
        hbox.getChildren().add(nameLabel);
        
        Label iniLabel = new Label(String.valueOf(combattant.getInitiative()));
        iniLabel.setMinWidth(40);
        hbox.getChildren().add(iniLabel);
        
        Button raiseIniButton = new Button("ini+");
        hbox.getChildren().add(raiseIniButton);
        
        Button lowerIniButton = new Button("ini-");
        hbox.getChildren().add(lowerIniButton);
        
        Button umwandelnButton = new Button("Umwandeln");
        hbox.getChildren().add(umwandelnButton);
        
        
        return hbox;
    }
    
    public ArrayList<Combattant> createCombattantList() {
        ArrayList<Combattant> combattants = new ArrayList();
        combattants.add(new Combattant("dude1",12));
        combattants.add(new Combattant("dude2",2));
        combattants.add(new Combattant("dude3",10));
        combattants.add(new Combattant("dude4",17));
        combattants.add(new Combattant("dude5",7));
        combattants.add(new Combattant("dude6",9));
        
        return combattants;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
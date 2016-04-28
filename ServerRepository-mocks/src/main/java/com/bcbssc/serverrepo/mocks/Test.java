package com.bcbssc.serverrepo.mocks;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Steven
 */
public class Test extends Application {
    
    private Stage primaryStage;
    
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        FXMLLoader loader = new  FXMLLoader(Test.class.getResource("/fxml/Main.fxml"));
        
        try {
            Parent p = loader.load();
            
            Scene scene = new Scene(p);
            // style applied to root node in FXML seems to work
            //scene.getStylesheets().add("/styles/Main.css");
        
            primaryStage.setTitle("CSS Testing");
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.AnimationTimer;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.PathElement;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Level3Controller implements Initializable{
    
    
    public ImageView zom1;
    public ImageView zom2;
    public ImageView zom3;
    public ImageView shooter1;
    public ImageView zom_head;
    //public ImageView sunflower1;
    
    public ImageView pea1;
    //public ImageView pea11;
    //public ImageView pea12;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    public void get_sun() throws IOException{
        
    }
    public void pea_shoot() throws IOException{

      pea1.setFitHeight(25); 
      pea1.setFitWidth(33); 
      PathElement[] path1 = {
           new MoveTo(pea1.getX(),pea1.getY()),
           new LineTo(pea1.getX()+500, pea1.getY()),
        };
     Path road1 = new Path();
       road1.getElements().addAll(path1);
       PathTransition anim1 = new PathTransition();
       anim1.setNode(pea1);
       anim1.setPath(road1);
       anim1.setDuration(new Duration(10000));
       anim1.play();

    }
    
    public void move_head() throws IOException{
        PathElement[] path1 = {
           new MoveTo(zom_head.getX(),zom_head.getY()),
           new LineTo(zom_head.getX()-70, zom_head.getY()),
        };
     Path road1 = new Path();
       road1.getElements().addAll(path1);
       PathTransition anim1 = new PathTransition();
       anim1.setNode(zom_head);
       anim1.setPath(road1);
       anim1.setDuration(new Duration(30000));
       anim1.play();
    }
    public void zom_move() throws IOException{
        double start_x = zom1.getX();
        double start_y = zom1.getY();
     PathElement[] path1 = {
           new MoveTo(zom1.getX(),zom1.getY()),
           new LineTo(zom1.getX()-330, zom1.getY()),
        };
     Path road1 = new Path();
       road1.getElements().addAll(path1);
       PathTransition anim1 = new PathTransition();
       anim1.setNode(zom1);
       anim1.setPath(road1);
       anim1.setDuration(new Duration(30000));
       anim1.play();
       //Image image = new Image(new FileInputStream(""));  
      zom2_move();
      zom3_move();
      pea_shoot();
      move_head();
      
//      for(int i = 0;i<10;i++){
//      ImageView zom = new ImageView();
//      zom.setImage(zom1.getImage());
//      zom.setLayoutX(start_x);
//      zom.setLayoutY(start_y);
//      PathTransition anim2 = new PathTransition();
//       anim2.setNode(zom);
//       anim2.setPath(road1);
//       anim2.setDuration(new Duration(30000));
//       anim2.play();
//      }
//      
    }
    public void zom2_move() throws IOException{
     PathElement[] path1 = {
           new MoveTo(zom2.getX(),zom2.getY()),
           new LineTo(zom2.getX()-330, zom2.getY()),
        };
     Path road1 = new Path();
       road1.getElements().addAll(path1);
       PathTransition anim1 = new PathTransition();
       anim1.setNode(zom2);
       anim1.setPath(road1);
       anim1.setDuration(new Duration(30000));
       anim1.play();
    }
     public void zom3_move() throws IOException{
     PathElement[] path1 = {
           new MoveTo(zom3.getX(),zom3.getY()),
           new LineTo(zom3.getX()-330, zom3.getY()),
        };
     Path road1 = new Path();
       road1.getElements().addAll(path1);
       PathTransition anim1 = new PathTransition();
       anim1.setNode(zom3);
       anim1.setPath(road1);
       anim1.setDuration(new Duration(30000));
       anim1.play();
    }
    public void changeScreenButtonPushed(ActionEvent event) throws IOException{
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("In_game_menu.fxml"));
    Parent root1 = (Parent) fxmlLoader.load();
    Stage stage = new Stage();
    stage.setScene(new Scene(root1));  
    stage.show();
     }
}




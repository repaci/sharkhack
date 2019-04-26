import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Hack extends Application
{

   private Label resultLabel;
   private RadioButton barButton;
   private RadioButton iranButton;
   private RadioButton saButton;
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a Label to display a prompt.
      Label promptLabel = new Label("You are trying to immigrate to the USA. \n Choose which country and situation you come from to begin:");

      
      //new RadioButtons
      barButton = new RadioButton("Barbados");
      iranButton = new RadioButton("Iran");
      saButton = new RadioButton("El Salvador");
      
      // Add the RadioButton controls to a ToggleGroup.
      ToggleGroup radioGroup = new ToggleGroup();
      barButton.setToggleGroup(radioGroup);
      iranButton.setToggleGroup(radioGroup);
      saButton.setToggleGroup(radioGroup);
      
      // Create a Button to perform the conversion.
      Button calcButton = new Button("Select");
      
      // Create an empty Label to display the result.
      resultLabel = new Label();
      
      // Put the promptLabel in an HBox.
      HBox promptHBox = new HBox(10, promptLabel);
      
      // Put the RadioButtons in an HBox.
      HBox radioHBox = new HBox(20,  barButton, iranButton,
                                saButton);
      
      // Put everything in a VBox.
      VBox mainVBox = new VBox(10, promptHBox, radioHBox, calcButton,
                               resultLabel);
      
      // Set the VBox's alignment to center.
      mainVBox.setAlignment(Pos.CENTER);
      
      // Set the VBox's padding to 10 pixels.
      mainVBox.setPadding(new Insets(10));
      
      // Create a Scene.
      Scene scene = new Scene(mainVBox);
   
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("Immigration");
      
      // Show the window.
      primaryStage.show();   
   }
   
   /*
    * Event handler class for calcButton
    */
    
   class CalcButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
      
         String result = "Blank";
      
         // Perform the selected conversion.
         if (barButton.isSelected())
            result = ("You chose Barbados");
         
         if (iranButton.isSelected())
            result = ("You chose Iran");
         
         if (saButton.isSelected())
            result = ("You chose El Salvador");
         
         // Display the results.
         resultLabel.setText(String.format(result));
      }
   }
}





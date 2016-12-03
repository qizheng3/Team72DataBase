package Controllers;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;

/**
 * Created by Allen on 12/3/2016.
 */
public class CategorySelectController {
    @FXML
    private CheckBox computingForGood;
    @FXML
    private CheckBox doingGoodForYourNeighborhood;
    @FXML
    private CheckBox reciprocalTeachingAndLearning;
    @FXML
    private CheckBox urbanDevelopment;
    @FXML
    private CheckBox adaptiveLearning;
    @FXML
    private CheckBox technologyForSocialGood;
    @FXML
    private CheckBox sustainableCommunities;
    @FXML
    private CheckBox crowdSourced;
    @FXML
    private CheckBox collaborativeAction;
    @FXML
    private Button applyButton;

    public ArrayList<String> selectedCategories = new ArrayList<>();
    @FXML
    public void initialize(){
        selectedCategories = new ArrayList<>();
    }
    @FXML
    private void applyPressed(){
        if(computingForGood.isSelected()){
            selectedCategories.add("computing for good");
        }
        if(doingGoodForYourNeighborhood.isSelected()){
            selectedCategories.add("doing good for your neighborhood");
        }
        if (reciprocalTeachingAndLearning.isSelected()){
            selectedCategories.add("reciprocal teaching and learning");
        }
        if(urbanDevelopment.isSelected()){
            selectedCategories.add("urban development");
        }
        if(adaptiveLearning.isSelected()){
            selectedCategories.add("adaptive learning");
        }
        if(technologyForSocialGood.isSelected()){
            selectedCategories.add("technology for social good");
        }
        if(sustainableCommunities.isSelected()){
            selectedCategories.add("sustainable communities");
        }
        if(crowdSourced.isSelected()){
            selectedCategories.add("crowd-sourced");
        }
        if(collaborativeAction.isSelected()){
            selectedCategories.add("collaborative action");
        }
        try{
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Main/MainPage.fxml"));
            Stage primaryStage = (Stage) applyButton.getScene().getWindow();
            primaryStage.setTitle("Me");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();
        }
        catch (IOException e){

        }
    }

}
package stud.num.edu.mn.numhumanresource.controllers;

import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.springframework.stereotype.Component;

import javafx.scene.control.Button;

@Component
public class MainController {

    private final HostServices hostServices;

    MainController(HostServices hostServices) {
        this.hostServices = hostServices;
    }

    @FXML
    private Button btnOverview;

    @FXML
    private Button btnPackages;

    @FXML
    private Button btnOrders;

    @FXML
    private Button btnCustomers;

    @FXML
    private Button btnSettings;

    @FXML
    private Button btnMenus;

    @FXML
    private Button btnSignout;

    @FXML
    void handleClicks(ActionEvent event) {

    }

    @FXML
    public void initialize(){
    }

}

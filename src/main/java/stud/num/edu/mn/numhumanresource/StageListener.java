package stud.num.edu.mn.numhumanresource;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import stud.num.edu.mn.numhumanresource.StageReadyEvent;

import java.io.IOException;
import java.net.URL;

@Component
public class StageListener implements ApplicationListener<StageReadyEvent> {

    private final String applicationTitle;
    private final Resource fxml;
    private final ApplicationContext ac;

    public StageListener(@Value("${spring.application.ui.title}") String applicationTitle, @Value("classpath:/fxml/main.fxml") Resource resource, ApplicationContext ac) {
        this.applicationTitle = applicationTitle;
        this.fxml = resource;
        this.ac = ac;
    }

    @Override
    public void onApplicationEvent(StageReadyEvent stageReadyEvent) {
        Stage stage = stageReadyEvent.getStage();
        try {
            URL url = this.fxml.getURL();
            FXMLLoader fxmlLoader = new FXMLLoader(url);
            fxmlLoader.setControllerFactory(ac::getBean);
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root,1050 ,  576);
            stage.setScene(scene);
            stage.setTitle(this.applicationTitle);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

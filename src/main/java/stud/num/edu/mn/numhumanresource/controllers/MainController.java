package stud.num.edu.mn.numhumanresource.controllers;

import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javafx.scene.control.Button;
import stud.num.edu.mn.numhumanresource.dao.ImsRoleDAO;
import stud.num.edu.mn.numhumanresource.dao.RefTimeTypeDAO;
import stud.num.edu.mn.numhumanresource.entity.ImsPermission;
import stud.num.edu.mn.numhumanresource.entity.ImsRole;
import stud.num.edu.mn.numhumanresource.entity.RefTimeType;

import java.util.ArrayList;
import java.util.List;

@Component
public class MainController {

    private final HostServices hostServices;

    MainController(HostServices hostServices) {
        this.hostServices = hostServices;
    }

    @Autowired
    RefTimeTypeDAO refTimeTypeDAO;

    @Autowired
    ImsRoleDAO imsRoleDAO;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnReport;

    @FXML
    private Button btnSetting;

    @FXML
    private Button btnTime;

    @FXML
    private Button btnSalary;

    @FXML
    private Button btnWorker;

    @FXML
    private Button btnSignout;

    @FXML
    void handleClicks(ActionEvent event) {

    }

    @FXML
    public void initialize(){

        List<RefTimeType> list = this.refTimeTypeDAO.findAllByQuery();
        for (RefTimeType timeType : list){
            System.out.println(timeType);
        }

        ImsRole role = new ImsRole();
        ImsRole role2 = new ImsRole();
        ImsPermission permission = new ImsPermission();
        ImsPermission permission1 = new ImsPermission();
        ImsPermission permission3 = new ImsPermission();
        ImsPermission permission4 = new ImsPermission();
        permission.setName("ROLE_ADMIN_SUB1");
        permission1.setName("ROLE_ADMIN_SUB2");
        permission3.setName("ROLE_ADMIN_SUB3");
        permission4.setName("ROLE_ADMIN_SUB4");
        List<ImsPermission> list2 = new ArrayList<>();
        List<ImsPermission> list3 = new ArrayList<>();
        list2.add(permission);
        list2.add(permission1);

        list3.add(permission3);
        list3.add(permission4);

        role.setPermission(list2);
        role.setName("ROLE_ADMIN");

        role2.setName("ROLE_HRM_ADMIN");
        role2.setPermission(list3);
        this.imsRoleDAO.save(role);
        this.imsRoleDAO.save(role2);

        ImsRole role1 = this.imsRoleDAO.findByIdTest(1L);
        ImsRole role3 = this.imsRoleDAO.findByIdTest(2L);
        System.out.println(role1);
        System.out.println(role3);
    }

}

package gdut.imis.view;

import gdut.imis.entity.EnglishStu;
import gdut.imis.entity.Student;
import gdut.imis.service.GradeService;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class SortController {
	@FXML
	private TextField departField;

	
	private Stage dialogStage;	//������̨
	private Student stu;
	
	
	@FXML
	private void initialize() {	//��ʼ������
		
	}

	//�Զ�������̨
	public Stage getDialogStage() {
		return dialogStage;
	}


	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	
	@FXML
	private void handleOk() {
		String depart = departField.getText();
		new GradeService().sortByGrade(depart);
		dialogStage.close();
	}
	
	@FXML
	private void handleCancle() {
		dialogStage.close();
	}
	
}


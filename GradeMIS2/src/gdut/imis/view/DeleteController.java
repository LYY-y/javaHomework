package gdut.imis.view;

import gdut.imis.entity.LiteratureStu;
import gdut.imis.entity.Student;
import gdut.imis.service.GradeService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DeleteController {
	@FXML
	private TextField noField;
	
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
		String str = noField.getText();
		new GradeService().delete(str);
		dialogStage.close();
	}
	
	@FXML
	private void handleCancle() {
		dialogStage.close();
	}
	
}
package gdut.imis.view;

import java.io.IOException;

import gdut.imis.service.GradeService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainScenceController {
	@FXML
	private MenuItem addEngstu;
	@FXML
	private MenuItem AddCompStu;
	@FXML
	private MenuItem addLitStu;
	@FXML
	private MenuItem delete;
	@FXML
	private MenuItem engUpdate;
	@FXML
	private MenuItem comUpdate;
	@FXML
	private MenuItem litUpdate;
	@FXML
	private MenuItem save;
	@FXML
	private MenuItem findByNo;
	@FXML
	private MenuItem findByName;
	@FXML
	private MenuItem findSome;
	@FXML
	private MenuItem sort;
	
	//�����ϵѧ����������
	@FXML
	private void handleAddCompStu() {
		showComStuAdd();
	}
	
	private void showComStuAdd() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("ComStuAdd.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//���öԻ�����̨��
			dialogStage.setTitle("�����ϵ��Ϣ¼��");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//�����ʼ��
			Scene scene = new Scene(page);	//���ó�������ҳ�����
			dialogStage.setScene(scene);	//����������̨
			
			//��������ҳ�������
			ComStuAddController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//��ʾ�Ի��򲢵ȴ��û�����
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Ӣ��ϵѧ����������
	@FXML
	private void handleAddEngstu() {
		showEngStuAdd();
	}
	
	private void showEngStuAdd() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("EngStuAdd.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//���öԻ�����̨��
			dialogStage.setTitle("Ӣ��ϵ��Ϣ¼��");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//�����ʼ��
			Scene scene = new Scene(page);	//���ó�������ҳ�����
			dialogStage.setScene(scene);	//����������̨
			
			//��������ҳ�������
			EngStuAddController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//��ʾ�Ի��򲢵ȴ��û�����
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	////��ѧϵѧ����������
	@FXML
	private void handleAddLitAdd() {
		showLitStuAdd();
	}
	
	private void showLitStuAdd() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("LitStuAdd.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//���öԻ�����̨��
			dialogStage.setTitle("��ѧϵ��Ϣ¼��");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//�����ʼ��
			Scene scene = new Scene(page);	//���ó�������ҳ�����
			dialogStage.setScene(scene);	//����������̨
			
			//��������ҳ�������
			LitStuAddController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//��ʾ�Ի��򲢵ȴ��û�����
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//ɾ��ѧ����Ϣ����
	@FXML
	private void handleDelete() {
		showDelete();
	}
	
	private void showDelete() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("Delete.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//���öԻ�����̨��
			dialogStage.setTitle("ɾ����Ϣ¼��");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//�����ʼ��
			Scene scene = new Scene(page);	//���ó�������ҳ�����
			dialogStage.setScene(scene);	//����������̨
			
			//��������ҳ�������
			DeleteController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//��ʾ�Ի��򲢵ȴ��û�����
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//Ӣ��ϵѧ���޸Ĺ���
	@FXML
	private void handleUpdateEngstu() {
		showEngStuUpdate();
	}
	
	private void showEngStuUpdate() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("EngUpdate.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//���öԻ�����̨��
			dialogStage.setTitle("Ӣ��ϵѧ���޸���Ϣ¼��");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//�����ʼ��
			Scene scene = new Scene(page);	//���ó�������ҳ�����
			dialogStage.setScene(scene);	//����������̨
			
			//��������ҳ�������
			EngUpdateController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//��ʾ�Ի��򲢵ȴ��û�����
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//�����ϵѧ���޸Ĺ���
	@FXML
	private void handleUpdateComstu() {
		showComStuUpdate();
	}
	
	private void showComStuUpdate() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("ComUpdate.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//���öԻ�����̨��
			dialogStage.setTitle("�����ϵѧ���޸���Ϣ¼��");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//�����ʼ��
			Scene scene = new Scene(page);	//���ó�������ҳ�����
			dialogStage.setScene(scene);	//����������̨
			
			//��������ҳ�������
			ComUpdateController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//��ʾ�Ի��򲢵ȴ��û�����
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//��ѧϵѧ���޸Ĺ���
	@FXML
	private void handleUpdateLitstu() {
		showLitStuUpdate();
	}
	
	private void showLitStuUpdate() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("LitUpdate.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//���öԻ�����̨��
			dialogStage.setTitle("��ѧϵѧ���޸���Ϣ¼��");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//�����ʼ��
			Scene scene = new Scene(page);	//���ó�������ҳ�����
			dialogStage.setScene(scene);	//����������̨
			
			//��������ҳ�������
			LitUpdateController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//��ʾ�Ի��򲢵ȴ��û�����
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//���湦��
	@FXML
	private void handleSave() {
		new GradeService().save();
	}
	
	//��ѧ�Ų�ѯ
	@FXML
	private void handleFindByNo() {
		showFindByNo();
	}
	
	private void showFindByNo() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("FindByNo.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//���öԻ�����̨��
			dialogStage.setTitle("��ѧ�Ų�ѯ");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//�����ʼ��
			Scene scene = new Scene(page);	//���ó�������ҳ�����
			dialogStage.setScene(scene);	//����������̨
			
			FindByNoController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//��ʾ�Ի��򲢵ȴ��û�����
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//��������ѯ
	@FXML
	private void handleFindByName() {
		showFindByName();
	}
	
	private void showFindByName() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainScenceController.class.getResource("FindByName.fxml"));
			AnchorPane page = (AnchorPane)loader.load();
			Stage dialogStage = new Stage();	//���öԻ�����̨��
			dialogStage.setTitle("��������ѯ");
			dialogStage.initModality(Modality.WINDOW_MODAL);	//�����ʼ��
			Scene scene = new Scene(page);	//���ó�������ҳ�����
			dialogStage.setScene(scene);	//����������̨
			
			//��������ҳ�������
			FindByNameController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			//��ʾ�Ի��򲢵ȴ��û�����
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//���ɼ�ɸѡ
		@FXML
		private void handleFindSome() {
			showFindSome();
		}
		
		private void showFindSome() {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainScenceController.class.getResource("FindSome.fxml"));
				AnchorPane page = (AnchorPane)loader.load();
				Stage dialogStage = new Stage();	//���öԻ�����̨��
				dialogStage.setTitle("�ۺϳɼ�ɸѡ");
				dialogStage.initModality(Modality.WINDOW_MODAL);	//�����ʼ��
				Scene scene = new Scene(page);	//���ó�������ҳ�����
				dialogStage.setScene(scene);	//����������̨
				
				//��������ҳ�������
				FindSomeController controller = loader.getController();
				controller.setDialogStage(dialogStage);
				//��ʾ�Ի��򲢵ȴ��û�����
				dialogStage.showAndWait();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//��ϵ����
				@FXML
				private void handleSort() {
					showSort();
				}
				
				private void showSort() {
					try {
						FXMLLoader loader = new FXMLLoader();
						loader.setLocation(MainScenceController.class.getResource("Sort.fxml"));
						AnchorPane page = (AnchorPane)loader.load();
						Stage dialogStage = new Stage();	//���öԻ�����̨��
						dialogStage.setTitle("ϵ����");
						dialogStage.initModality(Modality.WINDOW_MODAL);	//�����ʼ��
						Scene scene = new Scene(page);	//���ó�������ҳ�����
						dialogStage.setScene(scene);	//����������̨
						
						//��������ҳ�������
						SortController controller = loader.getController();
						controller.setDialogStage(dialogStage);
						//��ʾ�Ի��򲢵ȴ��û�����
						dialogStage.showAndWait();
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
	
}
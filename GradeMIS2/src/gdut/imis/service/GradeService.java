package gdut.imis.service;

import java.util.ArrayList;

import gdut.imis.dao.StudentDAO;
import gdut.imis.entity.Student;

public class GradeService implements ImpGrade {
	private static ArrayList<Student> stuList;
	public void init() {
		stuList = StudentDAO.read();
	}
	@Override
	public boolean add(Student stu) {
		for(Student s:stuList) {		//����Ƿ����ظ�ѧ��
			if (s.getNo().equals(stu.getNo())) {
				System.out.println("ѧ���ظ�������ʧ�ܣ�");
				return false;
			}
		}
		stuList.add(stu);
		System.out.println("���ӳɹ���");
		return true;
	}

	@Override
	public boolean delete(String no) {
		for(Student s:stuList) {		//����Ƿ��и�ѧ�ż�¼
			if (s.getNo().equals(no)) {
				stuList.remove(s);
				System.out.println("ɾ���ɹ���");
				return true;
			}
		}
		System.out.println("���Ҳ�����ѧ��ѧ�ż�¼��ɾ��ʧ�ܣ�");
		return false;
	}

	@Override
	public boolean update(Student stu) {
		for(Student s:stuList) {		//����Ƿ��и�ѧ�ż�¼
			if (s.getNo().equals(stu.getNo())) {
				s.setNo(stu.getNo());
				s.setName(stu.getName());
				s.setAge(stu.getAge());
				s.setSex(stu.getSex());
				s.setDepart(stu.getDepart());
				s.setMidGrade(stu.getMidGrade());
				s.setFinalGrade(stu.getFinalGrade());
				System.out.println("���³ɹ���");
				return true;
			}
		}
		System.out.println("���Ҳ�����ѧ��ѧ�ż�¼������ʧ�ܣ�");
		return false;
	}

	@Override
	public Student findByno(String no) {
		for(Student s:stuList) {		//��ѯ�Ƿ��и�ѧ�ż�¼
			if (s.getNo().equals(no)) {
				System.out.println("��ѯ�ɹ���"+s.getName());
				return s;
			}
		}
		System.out.println("���Ҳ�����ѧ��ѧ�ż�¼����ѯʧ�ܣ�");
		return null;
	}

	@Override
	public ArrayList<Student> findByname(String name) {
		ArrayList<Student> findList = new ArrayList<Student>();
		for(Student s:stuList) {		//��ѯ�Ƿ��и�������¼
			if (s.getName().equals(name)) {
				findList.add(s);
				System.out.println(s.getNo());
			}
		}
		return findList;
	}

	@Override
	public ArrayList<Student> findSome(String depart, double low, double upper) {
		ArrayList<Student> findList = new ArrayList<Student>();
		for(Student s:stuList) {		//ɸѡ��ָ��ϵ��ѧ��
			if (s.getDepart().equals(depart)) {
				if(s.countGrade()>=low && s.countGrade()<=upper) {
					findList.add(s);
					System.out.println(s.getNo()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getSex()+"\t"+s.getDepart()+"\t"+s.getMidGrade()+"\t"+s.getFinalGrade()+"\t"+s.countGrade()+"\n");
				}
			}
		}
		return findList;
	}

	@Override
	public ArrayList<Student> sortByGrade(String depart) {
		ArrayList<Student> sortList = new ArrayList<Student>();
		for(Student s:stuList) {		//ɸѡ��ָ��ϵ��ѧ��
			if (s.getDepart().equals(depart)) {
				sortList.add(s);
			}
		}
		Student[] sortArr=new Student[sortList.size()];
		sortArr=sortList.toArray(sortArr);
		
		//�����ۺϳɼ�����ð�ݽ�������
		for (int k = 0; k < sortArr.length-1; k++) {
			boolean flag = true;
			for (int i = 0; i < sortArr.length-1-i; i++) {
				Student tempStudent;
				if (sortArr[i].countGrade()<sortArr[i+1].countGrade()) {
					tempStudent = sortArr[i];
					sortArr[i]=sortArr[i+1];
					sortArr[i+1]=tempStudent;
					flag=false;
				}
			}
			if(flag) {	//������û�з�����������֤��������ɹ���ֱ������ѭ������
				break;
			}
		}
		System.out.println("ѧ��"+"\t"+"����"+"\t"+"����"+"\t"+"�Ա�"+"\t"+"ϵ��"+"\t"+"���п���"+"\t"+"��ĩ����"+"\t"+"�ۺϳɼ�");
		for(Student s:sortArr) {
			System.out.print(s.getNo()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getSex()+"\t"+s.getDepart()+"\t"+s.getMidGrade()+"\t"+s.getFinalGrade()+"\t"+s.countGrade()+"\n");
		}
		return sortList;
	}

	@Override
	public void save() {
		Student[] stuArr = new Student[stuList.size()];
		stuArr = stuList.toArray(stuArr);
		StudentDAO.write(stuArr);
	}
	
	

}
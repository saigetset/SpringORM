package com.sai.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sai.bo.StudentBO;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public String insertStudent(StudentBO bo) {
		int value = (int) hibernateTemplate.save(bo);
		if(value>=1)
			return "Inserted Successfully";
		else
			return "Insertion failed";
	}

	@Override
	public StudentBO getStudent(int id) {
		StudentBO bo = hibernateTemplate.get(StudentBO.class, id);
		return bo;
	}

	@Override
	public void deleteById(int id) {
		StudentBO bo = hibernateTemplate.get(StudentBO.class, id);
		if(bo!=null)
			hibernateTemplate.delete(bo);
		else
			System.out.println("Record not available for deletion");
	}

	@SuppressWarnings("unused")
	@Override
	public void deleteByObject(StudentBO bo) {
		StudentBO std = hibernateTemplate.get(StudentBO.class, bo.getId());
		if(bo!=null)
			hibernateTemplate.delete(std);
		else
			System.out.println("Record not available for deletion");
	}

	@Override
	public List<StudentBO> getAllStudents() {
		List<StudentBO> list = hibernateTemplate.loadAll(StudentBO.class);
		return list;
	}

	@Override
	public void updateStudent(StudentBO bo) {
		hibernateTemplate.saveOrUpdate(bo);
	}
	
}

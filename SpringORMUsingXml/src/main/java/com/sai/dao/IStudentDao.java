package com.sai.dao;

import java.util.List;

import com.sai.bo.StudentBO;

public interface IStudentDao {
	public String insertStudent(StudentBO bo);
	public StudentBO getStudent(int id);
	public void deleteById(int id);
	public void deleteByObject(StudentBO bo);
	public List<StudentBO> getAllStudents();
	public void updateStudent(StudentBO bo);
}

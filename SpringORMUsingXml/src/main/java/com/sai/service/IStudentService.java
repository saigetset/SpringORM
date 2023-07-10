package com.sai.service;

import java.util.List;

import com.sai.dto.StudentDTO;

public interface IStudentService {
	public String insertStudent(StudentDTO dto);
	public StudentDTO getStudent(int id);
	public void deleteById(int id);
	public void deleteByObject(StudentDTO dto);
	public List<StudentDTO> getAllStudents();
	public void updateStudent(StudentDTO dto);
}

package com.sai.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.bo.StudentBO;
import com.sai.dao.IStudentDao;
import com.sai.dto.StudentDTO;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private IStudentDao dao;

	@Override
	public String insertStudent(StudentDTO dto) {
		StudentBO bo = new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		return dao.insertStudent(bo);
	}

	@Override
	public StudentDTO getStudent(int id) {
		StudentDTO dto = new StudentDTO();
		StudentBO bo = dao.getStudent(id);
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
	}

	@Override
	public void deleteByObject(StudentDTO dto) {
		StudentBO bo = new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		dao.deleteByObject(bo);
	}

	@Override
	public List<StudentDTO> getAllStudents() {
		List<StudentBO> bolist = dao.getAllStudents();
		List<StudentDTO> dtolist = new ArrayList<StudentDTO>();
		bolist.forEach(bo -> {
			StudentDTO dto = new StudentDTO();
			BeanUtils.copyProperties(bo, dto);
			dtolist.add(dto);
		});
		return dtolist;
	}

	@Override
	public void updateStudent(StudentDTO dto) {
		StudentBO bo = new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		dao.updateStudent(bo);
	}
	

}

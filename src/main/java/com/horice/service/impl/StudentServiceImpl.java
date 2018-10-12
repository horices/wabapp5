package com.horice.service.impl;

import com.horice.entity.Student;
import com.horice.mapper.StudentMapper;
import com.horice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getStudentById(int id) {
        return studentMapper.selectStudent(id);
    }
}

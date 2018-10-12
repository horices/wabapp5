package com.horice.service;

import com.horice.entity.Student;
import com.horice.mapper.StudentMapper;

public interface StudentService {
    Student getStudentById(int id);
}

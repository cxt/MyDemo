package com.cxt.dao;

import com.cxt.model.Student;

import java.util.List;

/**
 * 处理学生的数据操作接口
 * @author liuyazhuang
 *
 */
public interface StudentMapper {  
      
    Integer insert(Student s);  
      
    List<Student> findAll();
      
    List<Student> findByStudentIds(List<Integer> studentIds);  

}  


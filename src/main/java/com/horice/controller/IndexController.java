package com.horice.controller;

import com.horice.entity.Student;
import com.horice.service.StudentService;
import com.horice.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    private StudentService studentService;
    @RequestMapping("/index")
    //@ResponseBody
    public String index(@RequestParam(value = "id",required = false,defaultValue = "1") Integer id, Student student, Map<String,Object> map){


        Student student1 = studentService.getStudentById(id);
        System.out.println(student1);
        System.out.println(student);
        System.out.println(id);
        List list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        map.put("title","测试标题");
        return "index";
    }
}

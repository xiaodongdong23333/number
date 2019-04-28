package com.whd.web;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.whd.service.StudentService;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/student")
public class StudentController  {


    @Autowired
    private StudentService studentService;



   /* @RequestMapping(value = "/list", method = RequestMethod.GET)
    private String list(@RequestParam(required= true,defaultValue = "1")Integer pn, Model model, HttpServletRequest request) {
        PageHelper.startPage(pn,5);
        List<Student> list = studentService.queryAll();
        PageInfo<Student> pageInfo = new PageInfo<Student>(list);
        model.addAttribute("list",list);
        model.addAttribute("pageInfo",pageInfo);
        return "student/list";// WEB-INF/jsp/"list".jsp
    }


    @RequestMapping(value = "/delete/{id}")
    private String delete(@PathVariable long id) {
        studentService.deleteByPrimaryKey(id);
        return "redirect:/student/list";// WEB-INF/jsp/"list".jsp
    }

    @RequestMapping(value = "/change/{id}")
    private String change(@PathVariable long id,Model model) {
        model.addAttribute("Student",studentService.selectByPrimaryKey(id));
        return"student/change";// WEB-INF/jsp/"list".jsp
    }

    @RequestMapping(value = "/change",method = RequestMethod.POST)  //请求映射
    public String change(Student record){
        studentService.updateByPrimaryKey(record);
        return"redirect:/student/list";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)  //请求映射
    public String add(Student record){
        studentService.insert(record);

        return"redirect:/student/list";
    }
*/
}

package com.whd.web;

import com.whd.entity.Sign;
import com.whd.entity.SignKey;
import com.whd.service.CourseService;
import com.whd.service.SignService;
import com.whd.service.StudentService;
import com.whd.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private SignService signService;

    @RequestMapping("/main")
    public String main(){
        return "new/main";
    }

    @RequestMapping("/main/student")
    public String student(){
        return "/new/student";}

    @RequestMapping(value = "main/student/add",method = RequestMethod.POST)  //请求映射
    public String add(Sign record){
        SignKey key = new SignKey();
        key.setCourseId(record.getCourseId());
        key.setStudentId(record.getStudentId());

        if(signService.selectByPrimaryKey(key) == null) {
            signService.insert(record);

        }else if(signService.selectByPrimaryKey(key).getCheckOut() == null){
            Sign newRecord = new Sign();
            newRecord.setCourseId(record.getCourseId());
            newRecord.setStudentId(record.getStudentId());
            newRecord.setCheckIn(signService.selectByPrimaryKey(key).getCheckIn());
            newRecord.setCheckOut(record.getCheckIn());
            signService.updateByPrimaryKey(newRecord);
            //签到成功
            if((courseService.selectByPrimaryKey(record.getCourseId()).getTimeStart().compareTo(newRecord.getCheckIn()) > 0)
                    && (newRecord.getCheckOut().compareTo(courseService.selectByPrimaryKey(record.getCourseId()).getTimeEnd())) > 0){
                newRecord.setIsSign("1");
            }else{
                //签到失败
                newRecord.setIsSign("0");
            }
            signService.updateByPrimaryKey(newRecord);
        }else{
            return"/new/main";
        }
        return"/new/main";
    }

    @RequestMapping("/main/teacher")
    public String teacher(){return "/new/teacher";}
}

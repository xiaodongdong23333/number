package com.whd.web;

import com.whd.constant.C;
import com.whd.entity.Sign;
import com.whd.entity.SignKey;
import com.whd.entity.Staff;
import com.whd.entity.StaffRecord;
import com.whd.service.StaffService;
import com.whd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Calendar;
import java.util.Date;

@Controller
public class StaffController {

  /*  @Autowired
    private StaffService staffService;

    *//*@RequestMapping("/main")
    public String main(){
        return "main";
    }*//*

    @RequestMapping("/main/staff")
    public String staff(){
        return "/new/staff";}

    @RequestMapping(value = "main/staff/add",method = RequestMethod.POST)  //请求映射
    public String add(StaffRecord record){
        Staff staff = new Staff();
        //姓名
        staff.setName(record.getStaffName());
        //密码
        staff.setPassword(record.getStaffPassword());
        //0代表用户类型
        staff.setType(C.user_type);
        //时间
        Calendar ca = Calendar.getInstance();
        Date now = ca.getTime();
        staff.setTime(now);
        //id
        staff.setId(now.getTime());
        staffService.insert(staff);
        return "main";
    }*/
}

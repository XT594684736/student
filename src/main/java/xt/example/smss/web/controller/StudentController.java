package xt.example.smss.web.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import xt.example.smss.Util.Message;
import xt.example.smss.Util.MessageUtil;
import xt.example.smss.bean.Student;

import java.util.Date;

//注释成控制类
@RestController
@Api(description = "学生控制器")
public class StudentController {
    //使用Message工具类

//    //添加
//    @PostMapping("/add")
//    public Message add() {
//        Message<String> message =new Message<>();
//        Date date = new Date();
//        message.setTime(date.getTime());//将时间转换成ms（long类型）
//        message.setStatus(200);
//        message.setMessage("success");
//        message.setData("添加学生成功");
//        return message;
//}
//
//    //删除
//    @GetMapping("/delete")
//    public Message delete() {
//        Message<String> message = new Message<>();
//        message.setStatus(200);
//        message.setMessage("success");
//        message.setTime(new Date().getTime());//将时间转换成ms（long类型）
//        message.setData("删除学生成功");
//        return message;
//    }

    //使用MessageUtil工具类，对message的相关内容进行了封装
    //添加
    @PostMapping("/add")
    @ApiOperation(value = "添加学生")
    // @ApiImplicitParam(name = "stuID", value = "学号", paramType = "query", dataType= "int")//int 会自动转换成Integer
//    @ApiImplicitParams({
//            //注意多个值之间的“,”使用方式类似于数
//            @ApiImplicitParam(name = "stuID", value = "学号", paramType = "query", dataType = "int",required = true),
//            @ApiImplicitParam(name = "name", value = "学生姓名", paramType = "query", dataType = "String",required = true)
//    })
    public Message add(Student student) { //根据学生主键id添加学生
        return MessageUtil.success("添加学生成功");//当内容为String类型时，o：代表一个提示信息
    }

    //删除
    @ApiOperation(value = "删除学生")
    @GetMapping("/delete")
    //当传入参数为对象时，下列代码即可省略，否则，重名的变量会进行覆盖，例如：此方法中的name 会覆盖了 student对象中的name
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "stuID", value = "学号", paramType = "query", dataType = "int",required = true),
//            @ApiImplicitParam(name = "name", value = "学生姓名", paramType = "query", dataType = "String",required = true)
//    })
    public Message delete(Student student) {
        return MessageUtil.success("删除学生成功");
    }
}

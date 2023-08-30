package com.seisoul.Controller;

import com.seisoul.entity.ReserveMessage;
import com.seisoul.service.NewReserve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ReserveController {
    @Autowired
    private NewReserve newReserve;

    @PostMapping("/reserve") // 接收前端表单，封装进实体类
    public ResponseEntity<String> reserveAppointment(@RequestBody ReserveMessage reserveMessage) {
        // 在这里处理来自前端的JSON数据
        // ReservationRequest 对象将自动从请求的JSON数据中填充
        // 保存预约信息到数据库，成功则i为1，
        int i = newReserve.addReserve(reserveMessage);
        System.out.println(i);
        System.out.println(reserveMessage);

        // 返回响应，可以是成功或失败的消息
        return ResponseEntity.ok("预约已提交，请在您的邮箱中确认日程");
    }

    /*@PostMapping(value = "/your-backend-endpoint")  *//* reserve   your-backend-endpoint*//*
    public ResponseEntity<String> reserve(@ModelAttribute ReserveMessage reserveMessage){
        int i = newReserve.addReserve(reserveMessage);
        System.out.println(i);
        System.out.println(reserveMessage);
        return ResponseEntity.ok("回应成功");
    }*/
}

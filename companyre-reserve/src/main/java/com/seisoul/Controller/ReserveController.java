package com.seisoul.Controller;

import com.seisoul.Entity.ReserveData;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ReserveController {
    @PostMapping(value = "/reserve")
    public ResponseEntity<String> reserve(){
        System.out.println("成功");
        return ResponseEntity.ok("回应成功");
    }
}

package cn.hao.dt57_ecs02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Dt57Ecs02Application {

    @GetMapping("/myEcs")
    public String myEcs(){
        return "hello myEcs,加油";
    }
    public static void main(String[] args) {
        SpringApplication.run(Dt57Ecs02Application.class, args);
    }

}

package com.fstop.test.controller;



import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/example")
@Slf4j
public class ExampleController {
//    @Autowired
//    exampleService examS;
    private String message = "Pages";

    @GetMapping("/test")
    public String index(Map<String, Object> model) {//,Model theModel
        log.info("TEST controller");
        this.message="輸入頁";
        model.put("message", this.message);
//        theModel.addAttribute("example",new example());
        return "test";
    }
    
    @PostMapping("/confirm")
    public String Confirm (@RequestParam Map<String, Object> test , Map<String,Object> model) {
//    	example theExample = new example();
//    	String id = model.get("id");
//    	model.put("id",model.get("id"));
//    	model.put("name",model.get("name"));
    	model.put("id",test.get("id"));
    	model.put("name",test.get("name"));
        return "confirm";
    }

}
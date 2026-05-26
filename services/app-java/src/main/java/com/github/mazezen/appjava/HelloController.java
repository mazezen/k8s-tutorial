package com.github.mazezen.appjava;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/api/hello")
    public Map<String, String> hello() {
        Map<String, String> response = new HashMap<>();
        response.put("ok", "hello app java");
        return response;
    }

}

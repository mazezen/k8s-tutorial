package com.github.mazezen.appjava;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @RequestMapping("/api")
    public Map<String, Boolean> index() {
        Map<String, Boolean> response = new HashMap<>();
        response.put("ok", true);
        return response;
    }

}

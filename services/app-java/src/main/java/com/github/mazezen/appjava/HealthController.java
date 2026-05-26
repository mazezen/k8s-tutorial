package com.github.mazezen.appjava;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @RequestMapping("/api/health")
    public Map<String, Integer> healthCheck() {
        Map<String, Integer> response = new HashMap<>();
        response.put("ok", 1);
        return response;
    }

}

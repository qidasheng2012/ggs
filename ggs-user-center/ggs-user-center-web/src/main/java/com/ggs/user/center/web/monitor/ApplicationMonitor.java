package com.ggs.user.center.web.monitor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 服务健康监控
 */
@Slf4j
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ApplicationMonitor {

    @GetMapping(value = "/monitor")
    public Map monitor(){
        log.info("social contract upp-order-center monitor success");
        Map map =new HashMap<>();
        map.put("msg" ,"success");
        map.put("code" ,"200");
        map.put("data" ,"null");
        return map;
    }
}

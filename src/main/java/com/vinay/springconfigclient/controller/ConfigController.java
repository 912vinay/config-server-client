package com.vinay.springconfigclient.controller;

import com.vinay.springconfigclient.config.PropConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RefreshScope
public class ConfigController {

    @Autowired
    PropConfig propConfig;

    @RequestMapping(value = "getprop", method = RequestMethod.GET)
    public ResponseEntity<Object> getConfig() {
        List<String> list = new ArrayList<>();
        list.add(propConfig.getName());
        list.add(propConfig.getEmail());
        list.add(propConfig.getMsg());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}

package org.example.restcontroller;

import org.example.feign.FeignServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class FeignDemoController {

    @Autowired
    private FeignServiceUtil feignServiceUtil;

    @GetMapping("/user-name")
    public String getUserName() {
      return  feignServiceUtil.getString();
    }

    @GetMapping("/user-address")
    public String getUserAddress() {
        return  feignServiceUtil.getAddress();
    }
}

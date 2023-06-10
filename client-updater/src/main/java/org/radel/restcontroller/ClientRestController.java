package org.radel.restcontroller;

import org.radel.feign.FeignServiceUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientRestController {

    private final FeignServiceUtil feignServiceUtil;

    public ClientRestController(FeignServiceUtil feignServiceUtil) {
        this.feignServiceUtil = feignServiceUtil;
    }

    @GetMapping("/update")
    public String getTestMsg() {
        return feignServiceUtil.getTestString();
    }
}

package org.radel.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-client")
public interface FeignServiceUtil {
    @GetMapping("/api/client/test")
    String getTestString();
}

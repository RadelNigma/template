package org.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-b")
public interface FeignServiceUtil {
    @GetMapping("/api/books/name")
    String getName();

    @GetMapping("/api/books/address")
    String getAddress();

}

package com.aaa.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "cloud-porduct")
public interface PorductService {

    @RequestMapping("/user/getUser")
    String a();
}

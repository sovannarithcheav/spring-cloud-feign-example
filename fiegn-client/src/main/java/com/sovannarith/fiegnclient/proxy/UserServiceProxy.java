package com.sovannarith.fiegnclient.proxy;

import com.sovannarith.fiegnclient.model.response.Billionaire;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "user-service", url = "${user.service.url}")
public interface UserServiceProxy {

    @GetMapping("/billionaire/list")
    List<Billionaire> listBillionaires();

}

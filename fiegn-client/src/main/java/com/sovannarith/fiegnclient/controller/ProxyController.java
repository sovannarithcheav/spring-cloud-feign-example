package com.sovannarith.fiegnclient.controller;


import com.sovannarith.fiegnclient.model.response.Billionaire;
import com.sovannarith.fiegnclient.proxy.UserServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ProxyController {

    @Autowired
    private UserServiceProxy proxy;

    @GetMapping("/proxy/list")
    public List<Billionaire> list(){
        return proxy.listBillionaires();
    }

}

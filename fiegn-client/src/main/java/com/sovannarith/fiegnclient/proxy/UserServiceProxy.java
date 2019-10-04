package com.sovannarith.fiegnclient.proxy;

import com.sovannarith.fiegnclient.configuration.FeignConfiguration;
import com.sovannarith.fiegnclient.model.response.Billionaire;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;

@FeignClient(name = "user-service", url = "${user.service.url}", configuration = FeignConfiguration.class)
@RequestMapping
public interface UserServiceProxy {

    @GetMapping("/billionaire/list")
    @ResponseBody
    List<Billionaire> listBillionaires();

    @PostMapping(value = "/billionaire/upload", consumes = MULTIPART_FORM_DATA_VALUE)
    ResponseEntity uploadFiles(@RequestPart(name = "file") MultipartFile[] file);

    @GetMapping("/billionaire/endpoint")
    @ResponseBody
    Object get(@RequestParam(value = "id", required = false) List<String> id);
}

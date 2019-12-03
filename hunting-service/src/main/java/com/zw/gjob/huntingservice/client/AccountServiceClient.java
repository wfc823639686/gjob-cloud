package com.zw.gjob.huntingservice.client;

import com.zw.gjob.commonsservice.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "account-service", fallback = AccountServiceClientFallback.class)
public interface AccountServiceClient {

    @PostMapping(value = "/account/auth/getAccessToken")
    String getAccessToken(@RequestBody User user);
}

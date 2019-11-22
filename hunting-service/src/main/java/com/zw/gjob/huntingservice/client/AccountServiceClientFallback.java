package com.zw.gjob.huntingservice.client;

import com.zw.gjob.commonsservice.entity.User;
import org.springframework.stereotype.Component;

@Component
public class AccountServiceClientFallback implements AccountServiceClient {

    @Override
    public String getAccessToken(User user) {
        return "error for statAddUser";
    }
}

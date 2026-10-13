package ru.trickluan.spring.lw2.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.trickluan.spring.lw2.model.Response;
import ru.trickluan.spring.lw2.util.DateTimeUtil;

import java.util.Date;
import java.util.UUID;

@Slf4j
@Service
@Qualifier("ModifySystemTimeResponseService")
public class ModifySystemTimeResponseService implements ModifyResponseService {
    @Override
    public Response modify(Response response) {
        response.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));
        log.info("Modify system time response {}", response);
        return response;
    }
}

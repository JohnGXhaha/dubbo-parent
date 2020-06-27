package com.gx.server.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gx.common.model.People;
import com.gx.common.service.PeopleService;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @author GX
 */
@Slf4j
@Service
public class PeopleServiceImpl implements PeopleService {
    @Override
    public People detail(People people) {
        people.setId(new Random().nextLong());
        log.debug("People:{},ID:{}",people.getName(),people.getId());
        return people;
    }
}

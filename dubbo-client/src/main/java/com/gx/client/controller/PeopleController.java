package com.gx.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gx.common.model.People;
import com.gx.common.service.PeopleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GX
 */
@RestController
public class PeopleController {

    @Reference
    private PeopleService peopleService;

    @GetMapping("/people/{name}")
    public People getPeople(@PathVariable("name") String name) {
        People people = new People();
        people.setName(name);
        return peopleService.detail(people);
    }
}


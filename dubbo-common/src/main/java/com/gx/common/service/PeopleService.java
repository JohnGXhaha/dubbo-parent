package com.gx.common.service;

import com.gx.common.model.People;

/**
 * @author GX
 */
public interface PeopleService {
    /**
     * 获取人员详情
     * @param people
     * @return
     * */
    People detail(People people);
}

package com.gwhn.angulartest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gwhn.angulartest.entity.Todo;
import com.gwhn.angulartest.mapper.TodoMapper;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

/**
 * @author banxian1804@qq.com
 * @date 2022/1/7 18:32
 */
public class DatabasePopulator extends ServiceImpl<TodoMapper,Todo> {

    @Resource
    private TodoMapper todoMapper;


    @PostConstruct
    void init()
    {
        try {
            Todo t1 = new Todo(UUID.randomUUID().toString(), "Task 1", new Date());
            Todo t2 = new Todo(UUID.randomUUID().toString(), "Task 2", new Date());
            Todo t3 = new Todo(UUID.randomUUID().toString(), "Task 3", new Date());
            saveOrUpdateBatch(Arrays.asList(t1,t2,t3));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

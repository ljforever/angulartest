package com.gwhn.angulartest.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gwhn.angulartest.entity.Todo;
import com.gwhn.angulartest.mapper.TodoMapper;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author banxian1804@qq.com
 * @date 2022/1/7 16:08
 */
public interface TodoService {

    public List<Todo> findAll();

    public void add(Todo todo);

    public void delete(int id);
}

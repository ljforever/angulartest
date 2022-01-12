package com.gwhn.angulartest.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gwhn.angulartest.entity.Todo;
import com.gwhn.angulartest.mapper.TodoMapper;
import com.gwhn.angulartest.service.TodoService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author banxian1804@qq.com
 * @date 2022/1/7 16:08
 */
@Component("todoServiceImpl")
public class TodoServiceImpl extends ServiceImpl<TodoMapper, Todo> implements TodoService {

    @Resource
    private TodoMapper todoMapper;

    public List<Todo> findAll(){
        QueryWrapper<Todo> queryWrapper = new QueryWrapper<>();
        return todoMapper.selectList(queryWrapper);
    }

    public void add(Todo todo){
        todoMapper.insert(todo);
    }

    public void delete(int id){
        todoMapper.deleteById(id);
    }
}

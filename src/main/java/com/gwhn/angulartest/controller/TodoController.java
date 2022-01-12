package com.gwhn.angulartest.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gwhn.angulartest.entity.Todo;
import com.gwhn.angulartest.mapper.TodoMapper;
import com.gwhn.angulartest.service.TodoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author banxian1804@qq.com
 * @date 2022/1/7 15:46
 */
@RestController
@RequestMapping("/todos")
public class TodoController {

    @Resource(name = "todoServiceImpl")
    private TodoService todoService;

    @RequestMapping("/find")
    public List<Todo> findAll(){
        QueryWrapper<Todo> queryWrapper = new QueryWrapper<>();
        return todoService.findAll();
    }

    @RequestMapping("/add")
    public void add(Todo todo){
        todoService.add(todo);
    }

    @RequestMapping(value="/delete/{id}", method= RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id){
        todoService.delete(id);
    }


}

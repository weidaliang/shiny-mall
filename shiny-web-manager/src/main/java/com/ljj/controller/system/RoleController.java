package com.ljj.controller.system;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ljj.entity.PageResult;
import com.ljj.entity.Result;
import com.ljj.pojo.system.Role;
import com.ljj.service.system.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Reference
    private RoleService roleService;

    @GetMapping("/findAll")
    public List<Role> findAll(){
        return roleService.findAll();
    }

    @GetMapping("/findPage")
    public PageResult<Role> findPage(int page, int size){
        return roleService.findPage(page, size);
    }

    @PostMapping("/findList")
    public List<Role> findList(@RequestBody Map<String,Object> searchMap){
        return roleService.findList(searchMap);
    }

    @PostMapping("/findPage")
    public PageResult<Role> findPage(@RequestBody Map<String,Object> searchMap, int page, int size){
        return  roleService.findPage(searchMap,page,size);
    }

    @GetMapping("/findById")
    public Role findById(Integer id){
        return roleService.findById(id);
    }


    @PostMapping("/add")
    public Result add(@RequestBody Role role){
        roleService.add(role);
        return new Result();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Role role){
        roleService.update(role);
        return new Result();
    }

    @GetMapping("/delete")
    public Result delete(Integer id){
        roleService.delete(id);
        return new Result();
    }

}

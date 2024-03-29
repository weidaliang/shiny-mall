package com.ljj.service.system;
import com.ljj.entity.PageResult;
import com.ljj.pojo.system.Resource;

import java.util.*;

/**
 * resource业务逻辑层
 */
public interface ResourceService {


    public List<Resource> findAll();


    public PageResult<Resource> findPage(int page, int size);


    public List<Resource> findList(Map<String, Object> searchMap);


    public PageResult<Resource> findPage(Map<String, Object> searchMap, int page, int size);


    public Resource findById(Integer id);

    public void add(Resource resource);


    public void update(Resource resource);


    public void delete(Integer id);

}

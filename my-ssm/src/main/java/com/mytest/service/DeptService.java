package com.mytest.service;

import com.mytest.dao.DeptDao;
import com.mytest.entity.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * (Dept)表服务接口
 *
 * @author makejava
 * @since 2019-07-03 12:05:07
 */
@Service
public class DeptService {
    @Resource(name = "deptDao")
    private DeptDao deptDao;

    public Dept queryById(Integer id) {
        return deptDao.selectByPrimaryKey(id);

    }

    public List<Dept> queryDeptAll() {
        return deptDao.selectAll();
    }
}
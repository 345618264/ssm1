package com.mytest.service;

import com.mytest.dao.EmpDao;
import com.mytest.entity.Emp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * (Emp)表服务接口
 *
 * @author makejava
 * @since 2019-07-03 12:04:24
 */
@Service
public class EmpService {
    @Resource(name = "empDao")
    private EmpDao empDao;


    public Emp queryById(Integer id) {
        return empDao.selectByPrimaryKey(id);
    }

    public List<Emp> queryEmpAll() {
        return empDao.selectAll();
    }
}
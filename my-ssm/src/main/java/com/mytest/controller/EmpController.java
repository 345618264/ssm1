package com.mytest.controller;

import com.mytest.entity.Emp;
import com.mytest.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * (Emp)表控制层
 *
 * @author makejava
 * @since 2019-07-03 12:04:24
 */
@Controller
@RequestMapping("/emp")
public class EmpController {
    /**
     * 服务对象
     */
    @Resource
    private EmpService empService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("/selectEmpOne")
    public Emp selectOne(Integer id) {
        return this.empService.queryById(id);
    }

    @RequestMapping("/selectEmpAll")
    public String selectEmpAll(Model model) {
        model.addAttribute("emps", this.empService.queryEmpAll());
        return "empList";
    }

}
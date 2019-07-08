package com.mytest.controller;

import com.mytest.entity.Dept;
import com.mytest.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Dept)表控制层
 *
 * @author makejava
 * @since 2019-07-03 12:05:07
 */
@Controller
@RequestMapping("/dept")
public class DeptController {
    /**
     * 服务对象
     */
    @Resource
    private DeptService deptService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectDeptOne")
    public String selectDeptOne(Integer id, Model model) {
        model.addAttribute("depts", this.deptService.queryById(id));
        return "deptList";
    }

    @GetMapping("/selectDeptAll")
    public List<Dept> selectDeptAll() {
        return this.deptService.queryDeptAll();
    }

}
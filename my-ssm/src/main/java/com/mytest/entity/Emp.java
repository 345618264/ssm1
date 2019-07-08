package com.mytest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * (Emp)实体类
 *
 * @author makejava
 * @since 2019-07-03 12:04:24
 */
@Table(name = "emp")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Emp implements Serializable {
    private static final long serialVersionUID = -43670976767907152L;
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer eid;

    private String ename;

    private String esex;

    private Integer eage;

    private Object esalary;

    private Integer id;


}
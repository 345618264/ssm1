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
 * (Dept)实体类
 *
 * @author makejava
 * @since 2019-07-03 12:05:06
 */
@Table(name = "dept")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable {
    private static final long serialVersionUID = 983261984042670671L;

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer did;

    private String dname;

    private String address;

    private String manager;

}
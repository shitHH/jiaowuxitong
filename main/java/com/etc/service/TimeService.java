package com.etc.service;

import com.etc.po.*;

import java.util.List;

/**
 * @author yyt
 * @version 1.0
 * Create by 2022/9/30 22:56
 * 时间段业务逻辑接口
 */
public interface TimeService {

    /**
     * @return 时间段集合
     *  查询所有时间段
     */
    public List<Time> findAll();

    /**
     * @return 时间段
     * 通过ID查询时间段
     */
    public Time findById(int id);

    /**
     * @param time 时间段对象
     * @return 受影响行数
     * 添加时间段
     */
    public boolean addTime(Time time);

    /**
     * @param id 时间段编号
     * @return 受影响行数
     * 删除时间段
     */
    public boolean deleteTime(int id);

    /**
     * @param time 时间段对象
     * @return 受影响行数
     * 更新时间段对象
     */
    public boolean updateTime(Time time);
}

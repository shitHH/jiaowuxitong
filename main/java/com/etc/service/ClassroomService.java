package com.etc.service;

import com.etc.po.Classroom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 教室业务逻辑访问接口
 */
public interface ClassroomService {
    /**
     * @return 教室对象集合
     * 查询所有教室
     */
    public List<Classroom> selectAll();

    /**
     * @param classroomid 教室编号
     * @return 教室对象
     * 根据教室编号查询教室
     */
    public Classroom selectByid(int classroomid);

    /**
     * @param classroom 教室对象
     * @return 是否成功
     * 受影响行数
     */
    public boolean add(Classroom classroom);

    /**
     * @param classroomid 教室编号
     * @return 是否成功
     * 删除教师
     */
    public boolean delete(int []classroomid);

    /**
     * @param classroom 教室对象
     * @return 是否成功
     * 修改教室
     */
    public boolean update(Classroom classroom);

    public Classroom checkClassroomName(@Param("name") String name);

    /**
     * @param name 教室名
     * @return Classroom集合
     * 模糊查询
     */
    public List<Classroom> findByName(@Param("name") String name);
}

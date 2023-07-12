package com.etc.dao;

import com.etc.po.Classroom;
import com.etc.vo.MajorVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 教室数据访问接口
 */
@Repository
public interface ClassroomDao {
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
     * @return 受影响行数
     * 受影响行数
     */
    public int add(Classroom classroom);

    /**
     * @param classroomid 教室编号
     * @return 收影响行数
     * 删除教师
     */
    public int delete(int[] classroomid);

    /**
     * @param classroom 教室对象
     * @return 受影响行数
     * 修改教室
     */
    public int update(Classroom classroom);

    public Classroom checkClassroomName(@Param("name") String name);

    /**
     * @param name 教室名
     * @return Classroom集合
     * 模糊查询
     */
    public List<Classroom> findByName(@Param("name") String name);
}

package com.etc.dao;

import com.etc.po.Lession;
import com.etc.vo.LessionTeacherVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lyt
 * 课程数据接口
 */
@Repository
public interface LessionDao {
    /**
     * @return 课程集合
     */
    public List<LessionTeacherVo> findAll();
    public LessionTeacherVo findBylid(int lid);

    /**
     * 根据课程编号查询课程
     *
     * @param lId 课程编号
     * @return 课程集合
     */
    public Lession findByid(int lId);

    /**
     * 根据老师编号查询课程
     *
     * @param tId 老师编号
     * @return 课程集合
     */
    public List<LessionTeacherVo> findByTid(int tId);

    /**
     * 增加课程
     *
     * @param lession 课程对象
     * @return 受影响行数
     */
    public int addLession(Lession lession);

    /**
     * 删除课程
     *
     * @param lId 课程编号
     * @return 受影响行数
     */
    public int deleteLession(@Param("lId") int lId);

    /**
     * 修改课程对象
     *
     * @param lession 课程对象
     * @return 受影响行数
     */
    public int updateLession(Lession lession);

    /**
     * @param name 课程名
     * @return 对象
     * 检查是否重名
     */
    public Lession checkName(@Param("name") String name);

    /**
     * @param name 名称
     * @return 集合学科
     * 模糊查询
     */
    public List<LessionTeacherVo> findByName(@Param("name") String name);
    public List<LessionTeacherVo> findByLtype(@Param("ltype") String ltype);
}

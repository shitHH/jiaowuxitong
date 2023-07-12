package com.etc.service;

import com.etc.po.Lession;
import com.etc.vo.LessionTeacherVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lyt
 * 课程业务逻辑接口
 */
@Component
public interface LessionService {
    /**
     * @return 课程集合
     */
    public List<LessionTeacherVo> findAll();
    public LessionTeacherVo findBylid(int lid);

    /**
     * 根据课程编号查询课程
     * @param lId 课程编号
     * @return 课程集合
     */
    public Lession findByid(int lId);

    /**
     * 根据老师编号查询课程
     * @param tId 老师编号
     * @return 课程集合
     */
    public List<LessionTeacherVo> findByTid(int tId);

    /**
     * 增加课程
     * @param lession 课程对象
     * @return 是否增加成功
     */
    public boolean addLession(Lession lession);

    /**
     * 删除课程
     * @param lId 课程编号
     * @return 是否删除成功
     */
    public boolean deleteLession(int lId);

    /**
     * 修改课程对象
     * @param lession 课程对象
     * @return 是否修改成功
     */
    public boolean updateLession(Lession lession);

    /**
     * @param name 课程名
     * @return 对象
     * 检车是否重名
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

package com.etc.service;

import com.etc.po.Teacher;
import com.etc.vo.TeacherVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Carl
 * @version 1.0
 * @project java0613-2-group-project-3
 * @date 2022/10/8 10:22:10
 */

@Component
public interface TeacherService {

    /**
     * @return 教师集合
     */
    List<TeacherVO> findAll();

    /**
     * @param tid 通过教师编号查找教师
     * @return 教师数据对象
     */
    TeacherVO  findByTid(int tid);
    List<TeacherVO> findByName(@Param("tName")String tName);

    /**
     * 通过教师工号和密码查询教师对象
     * @param tid 教师工号
     * @param tpass 教师密码
     * @return 教师对象
     */
    TeacherVO findByTidAndTpass(int tid,String tpass);

    /**
     * @param roleid 角色编号
     * @return  教师数据对象
     */
    List<TeacherVO> findByRoleid(int roleid);

    /**
     * @param collid 学院编号
     * @return 教师数据对象
     */
    List<TeacherVO> findByCollid(int collid);

    /**
     * @param teacher 添加老师
     * @return 受影响行数
     */
    boolean addteacher(Teacher teacher);

    /**
     * @param teacher 修改老师信息
     * @return   受影响行数
     */
    boolean  editteacher(Teacher teacher);

    /**
     * @param teacher 老师对象
     * @return 修改状态是否成功
     */
    boolean updateState(TeacherVO teacher);
    /**
     * @param ttel 教师电话
     * @return 老师对象
     */
    TeacherVO findByTtel(@Param("ttel") String ttel);
    /**
     * @param temail 教师邮箱
     * @return 教师对象
     */
    TeacherVO findByTemail(@Param("temail") String temail);


}

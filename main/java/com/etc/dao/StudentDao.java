package com.etc.dao;

import com.etc.po.Student;
import com.etc.vo.StudentVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author:yjt
 * 学生数据访问接口
 */
@Repository
public interface StudentDao {

    /**
     * 查询所有学生
     * @return 学生集合
     */
    public List<StudentVO> findAll();

    /**
     * 通过电话模糊查询学生对象
     * @param sTel 电话
     * @return 学生对象
     */
    public Student findBySTel(@Param("stel")String sTel);

    /**
     * 通过学生编号查询学生对象
     * @param sId 学生编号
     * @return 学生对象
     */
    public StudentVO findBySId(int sId);

    /**
     * 通过学生姓名模糊查询学生对象
     * @param sName 学生姓名
     * @return 学生对象
     */
    public List<StudentVO> findBySName(@Param("sName")String sName);

    /**
     * 通过班级编号查询学生对象
     * @param cId 班级编号
     * @return 学生对象
     */
    public List<StudentVO> findByCId(int cId);

    /**
     * 通过班级名称查询学生对象
     * @param className 班级名称
     * @return 学生对象
     */
    public List<StudentVO> findByClassName(String className);

    /**
     * 通过年级编号查询学生对象
     * @param gId 年级编号
     * @return 学生对象
     */
    public List<StudentVO> findByGId(int gId);

    /**
     * 通过年级名称查询学生对象
     * @param gName 年级名称
     * @return 学生对象
     */
    public List<StudentVO> findByGName(String gName);
    public List<StudentVO> findByTname(String tname);

    /**
     * 通过学生电话和密码查询学生对象
     * @param sTel 学生电话
     * @param sPass 学生密码
     * @return 学生对象
     */
    public StudentVO findByTelAndPass(String sTel,String sPass);

    /**
     * 通过学生编号和密码查询学生对象
     * @param sId 学生编号
     * @param sPass 学生密码
     * @return 学生对象
     */
    public StudentVO findBySIdAndPass(int sId,String sPass);


    /**
     * 通过学会邮箱模糊查询学生对象
     * @param sEmail 学生邮箱
     * @return 学生对象
     */
    public Student findByEmail(@Param("sEmail")String sEmail);

    /**
     * 通过学生编号查询学生对象
     * @param sId 学生编号
     * @return 学生对象
     */
    public StudentVO findBySId2(int sId);

    /**
     * 通过性别模糊查询学生
     * @param sex 学生性别
     * @return 学生集合
     */
    public List<StudentVO> findBySex(@Param("sex")String sex);

    /**
     * 添加学生
     * @param studentVO 学生对象
     * @return 受影响行数
     */
    public int addStudent(StudentVO studentVO);

    /**
     * 添加学生
     * @param studentVO 学生对象
     * @return 受影响行数
     */
    public int add(Student studentVO);

    /**
     * 更新学生
     * @param studentVO 学生对象
     * @return 受影响行数
     */
    public int updateStudent(StudentVO studentVO);

    /**
     * 更新学生
     * @param studentVO 学生对象
     * @return 受影响行数
     */
    public int editStudent(StudentVO studentVO);

    /**
     * 更新学生状态
     * @param studentVO 学生对象
     * @return 受影响行数
     */
    public int updateSState(StudentVO studentVO);


    /**
     * 更改密码
     * @param studentVO 学生对象
     * @return 受影响行数
     */
    public int updateSPass(StudentVO studentVO);

    /**
     * 删除学生
     * @param cId 学生编号
     * @return 受影响行数
     */
    public int deleteStudent(int cId);

}

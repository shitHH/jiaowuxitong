package com.etc.service;

import com.etc.po.Student;
import com.etc.vo.StudentVO;
import com.etc.vo.TeacherVO;

import java.util.List;

/**
 * @author:yjt
 * @category
 * 学生业务逻辑接口
 */
public interface StudentService {

    /**
     * 查询所有学生
     * @return 学生集合
     */
    public List<StudentVO> findAll();

    /**
     * 通过电话查询学生对象
     * @param sTel 电话
     * @return 学生对象
     */
    public Student findBySTel(String sTel);

    /**
     * 通过学生编号查询学生对象
     * @param sId 学生编号
     * @return 学生对象
     */
    public StudentVO findBySId(int sId);

    /**
     * 通过学生姓名查询学生对象
     * @param sName 学生姓名
     * @return 学生对象
     */
    public List<StudentVO> findBySName(String sName);

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
     * 通过学会邮箱查询学生对象
     * @param sEmail 学生邮箱
     * @return 学生对象
     */
    public Student findByEmail(String sEmail);
    public StudentVO findBySId2(int sId);

    /**
     * 添加学生
     * @param studentVO 学生对象
     * @return 是否成功
     */
    public boolean addStudent(StudentVO studentVO);

    /**
     * 添加学生
     * @param studentVO 学生对象
     * @return 是否成功
     */
    public boolean add(Student studentVO);

    /**
     * 更新学生
     * @param studentVO 学生对象
     * @return 是否成功
     */
    public boolean updateStudent(StudentVO studentVO);

    /**
     * 更新学生
     * @param studentVO 学生对象
     * @return 受影响行数
     */
    public boolean editStudent(StudentVO studentVO);

    /**
     * 更新学生状态
     * @param studentVO 学生对象
     * @return 是否成功
     */
    public boolean updateSState(StudentVO studentVO);


    /**
     * 更改密码
     * @param studentVO 学生对象
     * @return 是否成功
     */
    public boolean updateSPass(StudentVO studentVO);

    /**
     * 删除学生
     * @param cId 学生编号
     * @return 是否成功
     */
    public boolean deleteStudent(int cId);


}

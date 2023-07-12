package com.etc.dao;

import com.etc.po.Class;
import com.etc.vo.ClassVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author:yjt
 * @category 班级数据访问接口
 */
@Repository
public interface ClassDao {

    /**
     * 查询所有班级
     * @return 班级集合
     */
    public List<ClassVO> findAll();

    /**
     * 通过班级编号查询班级对象
     * @param cId 班级编号
     * @return 班级对象
     */
    public ClassVO findByCId(int cId);
    public Class findByCid(int cId);

    /**
     * 通过班级名称查询班级对象
     * @param className 班级名称
     * @return 班级对象
     */
    public List<ClassVO> findByClassName(@Param("className") String className);

    /**
     * 通过专业编号查询班级对象
     * @param mId 专业编号
     * @return 班级对象
     */
    public List<ClassVO> findByMId(int mId);

    /**
     * 通过专业名称查询班级对象
     * @param mName 专业名称
     * @return 班级对象
     */
    public List<ClassVO> findByMName(@Param("mName") String mName);

    /**
     * 通过年级编号查询班级对象
     * @param gId 年级编号
     * @return 班级对象
     */
    public List<ClassVO> findByGId(int gId);

    /**
     * 通过年级名称查询班级对象
     * @param gName 年级名称
     * @return 班级对象
     */
    public List<ClassVO> findByGName(@Param("gName") String gName);

    /**
     * 通过班级状态查询班级对象
     * @param cState 班级状态
     * @return 班级对象
     */
    public List<ClassVO> findByCState(String cState);

    /**
     * 添加
     * @param c 班级对象
     * @return 受影响行数
     */
    public int addClass(Class c);

    /**
     * 更新
     * @param c 班级对象
     * @return 受影响行数
     */
    public int updateClass(Class c);

    /**
     * 删除
     * @param cId 班级编号
     * @return 受影响行数
     */
    public int deleteClass(int cId);
}

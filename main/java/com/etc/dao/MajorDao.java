package com.etc.dao;

import com.etc.po.Major;
import com.etc.vo.LessionTeacherVo;
import com.etc.vo.MajorVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lyt
 * 专业访问接口
 */
@Repository
public interface MajorDao {
    /**
     * 查询所有专业
     *
     * @return 专业集合
     */
    public List<MajorVo> findAll();

    /**
     * @param mId 专业编号
     * @return 专业集合
     */
    public MajorVo findById(int mId);

    /**
     * 根据学院编号查询专业
     *
     * @param collId 学院编号
     * @return 专业集合
     */
    public List<MajorVo> findByCollId(@Param("collId") int collId);

    /**
     * 根据学院名称查询专业
     *
     * @param collName 学院名称
     * @return 专业集合
     */
    public List<MajorVo> findByCollName(String collName);

    /**
     * 增加专业
     *
     * @param major 专业对象
     * @return 受影响行数
     */
    public int addMajor(Major major);

    public Major checkName(@Param("name") String name);

    public int updateMajor(Major major);

    /**
     * @param name MajorVo
     * @return MajorVo学科
     * 模糊查询
     */
    public List<MajorVo> findByName(@Param("name") String name);
}

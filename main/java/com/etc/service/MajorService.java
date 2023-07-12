package com.etc.service;

import com.etc.po.Major;
import com.etc.vo.LessionTeacherVo;
import com.etc.vo.MajorVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lyt
 * 专业业务逻辑接口
 */
@Component
public interface MajorService {
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
    public List<MajorVo> findByCollId(int collId);

    /**
     * 增加专业
     *
     * @param major 专业对象
     * @return 是否增加成功
     */
    public boolean addMajor(Major major);


    public Major checkName(@Param("name") String name);

    public boolean updateMajor(Major major);

    /**
     * @param name 专业
     * @return 专业学科
     * 模糊查询
     */
    public List<MajorVo> findByName(@Param("name") String name);
}

package com.etc.dao;

import com.etc.po.Degree;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 学位数据访问接口
 */
@Repository
public interface DegreeDao {
    /**
     * @return 学位集合
     * 查询所有学位
     */
    public List<Degree> selectAll();

    /**
     * @param degreeid 学位编号
     * @return 学位对象
     * 根据学位编号查询学位
     */
    public Degree selectOne(int degreeid);

    /**
     * @param degree 学位对象
     * @return 受影响行数
     * 增加学位
     */
    public int add(Degree degree);

    /**
     * @param degreeId 学位对象
     * @return 受影响行数
     * 删除学位
     */
    public int delete(int []degreeId);

    /**
     * @param degree 学位对象
     * @return 受影响行数
     * 修改学位
     */
    public int update(Degree degree);
}

package com.etc.dao;

import com.etc.po.ChooseClass;
import com.etc.vo.ChooseClassVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 选课数据访问接口
 */
@Repository
public interface ChooseclassDao {
    /**
     * @param chooseClass 课程编号
     * @return 受影响行数
     * 选课
     */
    public int chooseClass(ChooseClass chooseClass);

    /**
     * @param choid 选课编号
     * @return 受影响行数
     * 删除选课
     */
    public int delete(int []choid);

    /**
     * @return 受影响行数
     * 修改选课
     */
    public int update(ChooseClass chooseClass);

    /**
     * @return 选课
     * 查询所有选课
     */
    public List<ChooseClassVO> selectAll();

    /**
     * @param sid 学生编号
     * @return 选课
     * 查询单个学生选课
     */
    public List<ChooseClassVO> selectBysid(int sid);

    /**
     * @param choid 选课编号
     * @return 根据选课编号查询选课
     */
    public ChooseClassVO selectOne(int choid);

}

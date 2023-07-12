package com.etc.dao;

import com.etc.po.Record;
import com.etc.vo.RecordVO;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author:yjt
 * @category 学费记录数据访问接口
 */
@Repository
public interface RecordDao {

    /**
     * 查询所有学费记录
     * @return 学费记录集合
     */
    public List<RecordVO> findAll();

    /**
     * 通过学费记录编号查询学费记录对象
     * @param monId 学费记录编号
     * @return 学费记录对象
     */
    public RecordVO findByMonId(int monId);

    /**
     * 通过学生编号查询学费记录对象
     * @param sId 学生编号
     * @return 学费记录对象
     */
    public List<RecordVO> findBySId(int sId);

    /**
     * 通过学生名称查询学费记录对象
     * @param sName 学生名称
     * @return 学费记录对象
     */
    public List<RecordVO> findBySName(String sName);

    /**
     * 通过缴费时间查询学费记录对象
     * @param timestamp 缴费时间
     * @return 学费记录对象
     */
    public List<RecordVO> findByMTime(Timestamp timestamp);

    /**
     * 通过缴费年度查询学费记录对象
     * @param mYear 缴费年度
     * @return 学费记录对象
     */
    public List<RecordVO> findByMYear(String mYear);

    /**
     * 根据缴费状态查询缴费集合
     * @param rState 缴费状态
     * @return 缴费集合
     */
    public List<RecordVO> findByRstate(String rState);

    /**
     * 添加
     * @param record 学费记录对象
     * @return 受影响行数
     */
    public int addRecord(Record record);

    /**
     * 更新
     * @param recordVO 学费记录对象
     * @return 受影响行数
     */
    public int updateRecord(RecordVO recordVO);

    /**
     * 删除
     * @param monId 学费记录编号
     * @return 受影响行数
     */
    public int deleteRecord(int monId);
}

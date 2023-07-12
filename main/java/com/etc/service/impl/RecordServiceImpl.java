package com.etc.service.impl;

import com.etc.dao.RecordDao;
import com.etc.po.Record;
import com.etc.service.RecordService;
import com.etc.vo.RecordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author:yjt
 * @category 学费记录业务逻辑实现类
 */
@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    RecordDao recordDao;

    @Override
    public List<RecordVO> findAll() {
        return recordDao.findAll();
    }

    @Override
    public RecordVO findByMonId(int monId) {
        return recordDao.findByMonId(monId);
    }

    @Override
    public List<RecordVO> findBySId(int sId) {
        return recordDao.findBySId(sId);
    }

    @Override
    public List<RecordVO> findBySName(String sName) {
        return recordDao.findBySName(sName);
    }

    @Override
    public List<RecordVO> findByMTime(Timestamp timestamp) {
        return recordDao.findByMTime(timestamp);
    }

    @Override
    public List<RecordVO> findByMYear(String mYear) {
        return recordDao.findByMYear(mYear);
    }

    @Override
    public List<RecordVO> findByRstate(String rState) {
        return recordDao.findByRstate(rState);
    }

    @Override
    public boolean addRecord(Record record) {
        return recordDao.addRecord(record)>0?true:false;
    }

    @Override
    public boolean updateRecord(RecordVO recordVO) {
        return recordDao.updateRecord(recordVO)>0?true:false;
    }

    @Override
    public boolean deleteRecord(int monId) {
        return recordDao.deleteRecord(monId)>0?true:false;
    }
}

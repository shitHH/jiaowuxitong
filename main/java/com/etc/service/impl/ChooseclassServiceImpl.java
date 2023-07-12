package com.etc.service.impl;

import com.etc.dao.ChooseclassDao;
import com.etc.po.ChooseClass;
import com.etc.service.ChooseclassService;
import com.etc.vo.ChooseClassVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 选课业务逻辑实现类
 */
@Service
public class ChooseclassServiceImpl  implements ChooseclassService {
    @Autowired
    ChooseclassDao chooseclassDao;
    @Override
    public boolean chooseClass(ChooseClass chooseClass) {
        return chooseclassDao.chooseClass(chooseClass)>0?true:false;
    }

    @Override
    public boolean delete(int []choid) {
        return chooseclassDao.delete(choid)>0?true:false;
    }

    @Override
    public boolean update(ChooseClass chooseClass) {
        return chooseclassDao.update(chooseClass)>0?true:false;
    }

    @Override
    public List<ChooseClassVO> selectAll() {
        return chooseclassDao.selectAll();
    }

    @Override
    public List<ChooseClassVO> selectBysid(int sid) {
        return chooseclassDao.selectBysid(sid);
    }

    @Override
    public ChooseClassVO selectOne(int choid) {
        return selectOne(choid);
    }
}

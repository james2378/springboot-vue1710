package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FangkeyuyueDao;
import com.entity.FangkeyuyueEntity;
import com.service.FangkeyuyueService;
import com.entity.vo.FangkeyuyueVO;
import com.entity.view.FangkeyuyueView;

@Service("fangkeyuyueService")
public class FangkeyuyueServiceImpl extends ServiceImpl<FangkeyuyueDao, FangkeyuyueEntity> implements FangkeyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangkeyuyueEntity> page = this.selectPage(
                new Query<FangkeyuyueEntity>(params).getPage(),
                new EntityWrapper<FangkeyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangkeyuyueEntity> wrapper) {
		  Page<FangkeyuyueView> page =new Query<FangkeyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangkeyuyueVO> selectListVO(Wrapper<FangkeyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangkeyuyueVO selectVO(Wrapper<FangkeyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangkeyuyueView> selectListView(Wrapper<FangkeyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangkeyuyueView selectView(Wrapper<FangkeyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<FangkeyuyueEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<FangkeyuyueEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<FangkeyuyueEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }


    @Override
    public List<Map<String, Object>> biaotifangwenzhuangtaiTypeStat(Map<String, Object> params, Wrapper<FangkeyuyueEntity> wrapper) {
        return baseMapper.biaotifangwenzhuangtaiTypeStat(params, wrapper);
    }


}

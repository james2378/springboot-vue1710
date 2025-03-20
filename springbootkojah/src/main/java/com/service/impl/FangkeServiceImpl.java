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


import com.dao.FangkeDao;
import com.entity.FangkeEntity;
import com.service.FangkeService;
import com.entity.vo.FangkeVO;
import com.entity.view.FangkeView;

@Service("fangkeService")
public class FangkeServiceImpl extends ServiceImpl<FangkeDao, FangkeEntity> implements FangkeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangkeEntity> page = this.selectPage(
                new Query<FangkeEntity>(params).getPage(),
                new EntityWrapper<FangkeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangkeEntity> wrapper) {
		  Page<FangkeView> page =new Query<FangkeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangkeVO> selectListVO(Wrapper<FangkeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangkeVO selectVO(Wrapper<FangkeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangkeView> selectListView(Wrapper<FangkeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangkeView selectView(Wrapper<FangkeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

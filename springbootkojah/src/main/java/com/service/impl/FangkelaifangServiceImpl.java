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


import com.dao.FangkelaifangDao;
import com.entity.FangkelaifangEntity;
import com.service.FangkelaifangService;
import com.entity.vo.FangkelaifangVO;
import com.entity.view.FangkelaifangView;

@Service("fangkelaifangService")
public class FangkelaifangServiceImpl extends ServiceImpl<FangkelaifangDao, FangkelaifangEntity> implements FangkelaifangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangkelaifangEntity> page = this.selectPage(
                new Query<FangkelaifangEntity>(params).getPage(),
                new EntityWrapper<FangkelaifangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangkelaifangEntity> wrapper) {
		  Page<FangkelaifangView> page =new Query<FangkelaifangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangkelaifangVO> selectListVO(Wrapper<FangkelaifangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangkelaifangVO selectVO(Wrapper<FangkelaifangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangkelaifangView> selectListView(Wrapper<FangkelaifangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangkelaifangView selectView(Wrapper<FangkelaifangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

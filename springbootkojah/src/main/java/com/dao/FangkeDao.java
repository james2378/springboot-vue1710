package com.dao;

import com.entity.FangkeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangkeVO;
import com.entity.view.FangkeView;


/**
 * 访客
 * 
 * @author 
 * @email 
 * @date 2023-02-14 10:28:01
 */
public interface FangkeDao extends BaseMapper<FangkeEntity> {
	
	List<FangkeVO> selectListVO(@Param("ew") Wrapper<FangkeEntity> wrapper);
	
	FangkeVO selectVO(@Param("ew") Wrapper<FangkeEntity> wrapper);
	
	List<FangkeView> selectListView(@Param("ew") Wrapper<FangkeEntity> wrapper);

	List<FangkeView> selectListView(Pagination page,@Param("ew") Wrapper<FangkeEntity> wrapper);
	
	FangkeView selectView(@Param("ew") Wrapper<FangkeEntity> wrapper);
	

}

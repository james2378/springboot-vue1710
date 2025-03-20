package com.dao;

import com.entity.FangkelaifangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangkelaifangVO;
import com.entity.view.FangkelaifangView;


/**
 * 访客来访
 * 
 * @author 
 * @email 
 * @date 2023-02-14 10:28:01
 */
public interface FangkelaifangDao extends BaseMapper<FangkelaifangEntity> {
	
	List<FangkelaifangVO> selectListVO(@Param("ew") Wrapper<FangkelaifangEntity> wrapper);
	
	FangkelaifangVO selectVO(@Param("ew") Wrapper<FangkelaifangEntity> wrapper);
	
	List<FangkelaifangView> selectListView(@Param("ew") Wrapper<FangkelaifangEntity> wrapper);

	List<FangkelaifangView> selectListView(Pagination page,@Param("ew") Wrapper<FangkelaifangEntity> wrapper);
	
	FangkelaifangView selectView(@Param("ew") Wrapper<FangkelaifangEntity> wrapper);
	

}

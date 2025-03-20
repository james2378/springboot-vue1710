package com.dao;

import com.entity.FangkeyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangkeyuyueVO;
import com.entity.view.FangkeyuyueView;


/**
 * 访客预约
 * 
 * @author 
 * @email 
 * @date 2023-02-14 10:28:01
 */
public interface FangkeyuyueDao extends BaseMapper<FangkeyuyueEntity> {
	
	List<FangkeyuyueVO> selectListVO(@Param("ew") Wrapper<FangkeyuyueEntity> wrapper);
	
	FangkeyuyueVO selectVO(@Param("ew") Wrapper<FangkeyuyueEntity> wrapper);
	
	List<FangkeyuyueView> selectListView(@Param("ew") Wrapper<FangkeyuyueEntity> wrapper);

	List<FangkeyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<FangkeyuyueEntity> wrapper);
	
	FangkeyuyueView selectView(@Param("ew") Wrapper<FangkeyuyueEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<FangkeyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<FangkeyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<FangkeyuyueEntity> wrapper);


    List<Map<String, Object>> biaotifangwenzhuangtaiTypeStat(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<FangkeyuyueEntity> wrapper);

}

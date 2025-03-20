package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangkeyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangkeyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangkeyuyueView;


/**
 * 访客预约
 *
 * @author 
 * @email 
 * @date 2023-02-14 10:28:01
 */
public interface FangkeyuyueService extends IService<FangkeyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangkeyuyueVO> selectListVO(Wrapper<FangkeyuyueEntity> wrapper);
   	
   	FangkeyuyueVO selectVO(@Param("ew") Wrapper<FangkeyuyueEntity> wrapper);
   	
   	List<FangkeyuyueView> selectListView(Wrapper<FangkeyuyueEntity> wrapper);
   	
   	FangkeyuyueView selectView(@Param("ew") Wrapper<FangkeyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangkeyuyueEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<FangkeyuyueEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<FangkeyuyueEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<FangkeyuyueEntity> wrapper);


    List<Map<String, Object>> biaotifangwenzhuangtaiTypeStat(Map<String, Object> params,Wrapper<FangkeyuyueEntity> wrapper);

}


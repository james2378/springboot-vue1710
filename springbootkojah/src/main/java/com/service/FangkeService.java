package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangkeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangkeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangkeView;


/**
 * 访客
 *
 * @author 
 * @email 
 * @date 2023-02-14 10:28:01
 */
public interface FangkeService extends IService<FangkeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangkeVO> selectListVO(Wrapper<FangkeEntity> wrapper);
   	
   	FangkeVO selectVO(@Param("ew") Wrapper<FangkeEntity> wrapper);
   	
   	List<FangkeView> selectListView(Wrapper<FangkeEntity> wrapper);
   	
   	FangkeView selectView(@Param("ew") Wrapper<FangkeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangkeEntity> wrapper);
   	

}


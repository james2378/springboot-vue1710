package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangkelaifangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangkelaifangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangkelaifangView;


/**
 * 访客来访
 *
 * @author 
 * @email 
 * @date 2023-02-14 10:28:01
 */
public interface FangkelaifangService extends IService<FangkelaifangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangkelaifangVO> selectListVO(Wrapper<FangkelaifangEntity> wrapper);
   	
   	FangkelaifangVO selectVO(@Param("ew") Wrapper<FangkelaifangEntity> wrapper);
   	
   	List<FangkelaifangView> selectListView(Wrapper<FangkelaifangEntity> wrapper);
   	
   	FangkelaifangView selectView(@Param("ew") Wrapper<FangkelaifangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangkelaifangEntity> wrapper);
   	

}


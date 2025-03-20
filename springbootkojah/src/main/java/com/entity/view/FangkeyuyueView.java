package com.entity.view;

import com.entity.FangkeyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 访客预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-14 10:28:01
 */
@TableName("fangkeyuyue")
public class FangkeyuyueView  extends FangkeyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangkeyuyueView(){
	}
 
 	public FangkeyuyueView(FangkeyuyueEntity fangkeyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, fangkeyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

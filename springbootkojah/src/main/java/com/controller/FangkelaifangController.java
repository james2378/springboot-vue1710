package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FangkelaifangEntity;
import com.entity.view.FangkelaifangView;

import com.service.FangkelaifangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 访客来访
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-14 10:28:01
 */
@RestController
@RequestMapping("/fangkelaifang")
public class FangkelaifangController {
    @Autowired
    private FangkelaifangService fangkelaifangService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FangkelaifangEntity fangkelaifang,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fangke")) {
			fangkelaifang.setFangkezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FangkelaifangEntity> ew = new EntityWrapper<FangkelaifangEntity>();

		PageUtils page = fangkelaifangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fangkelaifang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FangkelaifangEntity fangkelaifang, 
		HttpServletRequest request){
        EntityWrapper<FangkelaifangEntity> ew = new EntityWrapper<FangkelaifangEntity>();

		PageUtils page = fangkelaifangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fangkelaifang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FangkelaifangEntity fangkelaifang){
       	EntityWrapper<FangkelaifangEntity> ew = new EntityWrapper<FangkelaifangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fangkelaifang, "fangkelaifang")); 
        return R.ok().put("data", fangkelaifangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FangkelaifangEntity fangkelaifang){
        EntityWrapper< FangkelaifangEntity> ew = new EntityWrapper< FangkelaifangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fangkelaifang, "fangkelaifang")); 
		FangkelaifangView fangkelaifangView =  fangkelaifangService.selectView(ew);
		return R.ok("查询访客来访成功").put("data", fangkelaifangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FangkelaifangEntity fangkelaifang = fangkelaifangService.selectById(id);
        return R.ok().put("data", fangkelaifang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FangkelaifangEntity fangkelaifang = fangkelaifangService.selectById(id);
        return R.ok().put("data", fangkelaifang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FangkelaifangEntity fangkelaifang, HttpServletRequest request){
    	fangkelaifang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fangkelaifang);
        fangkelaifangService.insert(fangkelaifang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FangkelaifangEntity fangkelaifang, HttpServletRequest request){
    	fangkelaifang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fangkelaifang);
        fangkelaifangService.insert(fangkelaifang);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FangkelaifangEntity fangkelaifang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fangkelaifang);
        fangkelaifangService.updateById(fangkelaifang);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fangkelaifangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<FangkelaifangEntity> wrapper = new EntityWrapper<FangkelaifangEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("fangke")) {
			wrapper.eq("fangkezhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = fangkelaifangService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}

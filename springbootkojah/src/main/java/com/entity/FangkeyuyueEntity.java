package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 访客预约
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-14 10:28:01
 */
@TableName("fangkeyuyue")
public class FangkeyuyueEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangkeyuyueEntity() {
		
	}
	
	public FangkeyuyueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 预约编号
	 */
					
	private String yuyuebianhao;
	
	/**
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 访客账号
	 */
					
	private String fangkezhanghao;
	
	/**
	 * 访客姓名
	 */
					
	private String fangkexingming;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 访人姓名
	 */
					
	private String fangrenxingming;
	
	/**
	 * 访人手机号
	 */
					
	private String fangrenshoujihao;
	
	/**
	 * 访问日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fangwenriqi;
	
	/**
	 * 访问状态
	 */
					
	private String fangwenzhuangtai;
	
	/**
	 * 预约时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date yuyueshijian;
	
	/**
	 * 访问事因
	 */
					
	private String fangwenshiyin;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：预约编号
	 */
	public void setYuyuebianhao(String yuyuebianhao) {
		this.yuyuebianhao = yuyuebianhao;
	}
	/**
	 * 获取：预约编号
	 */
	public String getYuyuebianhao() {
		return yuyuebianhao;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：访客账号
	 */
	public void setFangkezhanghao(String fangkezhanghao) {
		this.fangkezhanghao = fangkezhanghao;
	}
	/**
	 * 获取：访客账号
	 */
	public String getFangkezhanghao() {
		return fangkezhanghao;
	}
	/**
	 * 设置：访客姓名
	 */
	public void setFangkexingming(String fangkexingming) {
		this.fangkexingming = fangkexingming;
	}
	/**
	 * 获取：访客姓名
	 */
	public String getFangkexingming() {
		return fangkexingming;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：访人姓名
	 */
	public void setFangrenxingming(String fangrenxingming) {
		this.fangrenxingming = fangrenxingming;
	}
	/**
	 * 获取：访人姓名
	 */
	public String getFangrenxingming() {
		return fangrenxingming;
	}
	/**
	 * 设置：访人手机号
	 */
	public void setFangrenshoujihao(String fangrenshoujihao) {
		this.fangrenshoujihao = fangrenshoujihao;
	}
	/**
	 * 获取：访人手机号
	 */
	public String getFangrenshoujihao() {
		return fangrenshoujihao;
	}
	/**
	 * 设置：访问日期
	 */
	public void setFangwenriqi(Date fangwenriqi) {
		this.fangwenriqi = fangwenriqi;
	}
	/**
	 * 获取：访问日期
	 */
	public Date getFangwenriqi() {
		return fangwenriqi;
	}
	/**
	 * 设置：访问状态
	 */
	public void setFangwenzhuangtai(String fangwenzhuangtai) {
		this.fangwenzhuangtai = fangwenzhuangtai;
	}
	/**
	 * 获取：访问状态
	 */
	public String getFangwenzhuangtai() {
		return fangwenzhuangtai;
	}
	/**
	 * 设置：预约时间
	 */
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
	}
	/**
	 * 设置：访问事因
	 */
	public void setFangwenshiyin(String fangwenshiyin) {
		this.fangwenshiyin = fangwenshiyin;
	}
	/**
	 * 获取：访问事因
	 */
	public String getFangwenshiyin() {
		return fangwenshiyin;
	}

}

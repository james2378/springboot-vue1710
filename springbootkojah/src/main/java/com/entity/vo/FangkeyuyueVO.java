package com.entity.vo;

import com.entity.FangkeyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 访客预约
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-14 10:28:01
 */
public class FangkeyuyueVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fangwenriqi;
		
	/**
	 * 访问状态
	 */
	
	private String fangwenzhuangtai;
		
	/**
	 * 预约时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueshijian;
		
	/**
	 * 访问事因
	 */
	
	private String fangwenshiyin;
				
	
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

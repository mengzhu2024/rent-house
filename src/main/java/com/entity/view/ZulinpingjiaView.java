package com.entity.view;

import com.entity.ZulinpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;


/**
 * 租赁评价
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zulinpingjia")
public class ZulinpingjiaView  extends ZulinpingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZulinpingjiaView(){
	}

 	public ZulinpingjiaView(ZulinpingjiaEntity zulinpingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, zulinpingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZulinpingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZulinpingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZulinpingjiaView;


/**
 * 租赁评价
 *
 */
public interface ZulinpingjiaService extends IService<ZulinpingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);

   	List<ZulinpingjiaVO> selectListVO(Wrapper<ZulinpingjiaEntity> wrapper);

   	ZulinpingjiaVO selectVO(@Param("ew") Wrapper<ZulinpingjiaEntity> wrapper);

   	List<ZulinpingjiaView> selectListView(Wrapper<ZulinpingjiaEntity> wrapper);

   	ZulinpingjiaView selectView(@Param("ew") Wrapper<ZulinpingjiaEntity> wrapper);

   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZulinpingjiaEntity> wrapper);

}


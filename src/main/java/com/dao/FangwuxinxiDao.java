package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.FangwuxinxiEntity;
import com.entity.view.FangwuxinxiView;
import com.entity.vo.FangwuxinxiVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 房屋信息
 *
 */
public interface FangwuxinxiDao extends BaseMapper<FangwuxinxiEntity> {

	List<FangwuxinxiVO> selectListVO(@Param("ew") Wrapper<FangwuxinxiEntity> wrapper);

	FangwuxinxiVO selectVO(@Param("ew") Wrapper<FangwuxinxiEntity> wrapper);

	List<FangwuxinxiView> selectListView(@Param("ew") Wrapper<FangwuxinxiEntity> wrapper);

	List<FangwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FangwuxinxiEntity> wrapper);

	FangwuxinxiView selectView(@Param("ew") Wrapper<FangwuxinxiEntity> wrapper);

}

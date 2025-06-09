package com.dao;

import com.entity.ShijianduanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShijianduanVO;
import com.entity.view.ShijianduanView;


/**
 * 时间段
 * 
 * @author 
 * @email 
 * @date 2021-04-27 17:44:59
 */
public interface ShijianduanDao extends BaseMapper<ShijianduanEntity> {
	
	List<ShijianduanVO> selectListVO(@Param("ew") Wrapper<ShijianduanEntity> wrapper);
	
	ShijianduanVO selectVO(@Param("ew") Wrapper<ShijianduanEntity> wrapper);
	
	List<ShijianduanView> selectListView(@Param("ew") Wrapper<ShijianduanEntity> wrapper);

	List<ShijianduanView> selectListView(Pagination page,@Param("ew") Wrapper<ShijianduanEntity> wrapper);
	
	ShijianduanView selectView(@Param("ew") Wrapper<ShijianduanEntity> wrapper);
	
}

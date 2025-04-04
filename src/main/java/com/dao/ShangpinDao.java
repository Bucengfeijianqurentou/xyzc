package com.dao;

import com.entity.ShangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.entity.view.ShangpinView;

/**
 * 校园资产 Dao 接口
 *
 * @author 
 */
public interface ShangpinDao extends BaseMapper<ShangpinEntity> {

   List<ShangpinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);
   
   /**
    * 查询总资产数量（所有资产库存总和）
    * @return 资产总数量
    */
   @Select("SELECT SUM(shangpin_kucun_number) AS total_inventory FROM shangpin")
   Integer selectTotalInventory();
}

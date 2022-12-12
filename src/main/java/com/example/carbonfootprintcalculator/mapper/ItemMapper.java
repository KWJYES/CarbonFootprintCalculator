package com.example.carbonfootprintcalculator.mapper;

import com.example.carbonfootprintcalculator.entity.item;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ItemMapper {
    /**
     * 插入
     */
    @Update("insert into t_item values(#{itemName},#{carbonNum},#{date})")
    void   insert(item item);
/**
 * 更新
 */
    @Update("update t_item set carbonNum = #{carbonNum} where itemName = #{itemName}")
    void  update(item item);
/**
 * 删除
 */
    @Delete("delete  from t_item where itemName = #{itemName}")
    void  delete(item item);
/**
 * 查询
 */
//注册时判断物品是否存在
@Select("select* from t_item where itemName = #{itemName}")
item insertByName(String name);

    @Select("select* from t_item where itemName = #{itemName}")
    item findById(String name);
}

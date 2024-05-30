package com.example.mapper;

import com.example.entity.House;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HouseMapper {
    /**
     * 增加宿舍楼
     * @param house
     */
    void addHouse(House house);

    /**
     * 删除宿舍楼
     */
    void deleteByHno(Integer hno);

    /**
     * 更新宿舍楼信息
     */
    void updateHouse(House house);

    /**
     * 查找宿舍楼信息
     * 暂时实现这一个就够
     */
    List<House> getHouseList();
}

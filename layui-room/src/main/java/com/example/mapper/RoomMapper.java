package com.example.mapper;

import com.example.entity.Room;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoomMapper {
    /**
     * 查找宿舍信息
     */
    List<Room> getRoomList();

    /**
     * 插入宿舍信息
     */
    void addRoom(Room room);

    /**
     * 删除宿舍信息
     */
    void deleteByRno(Integer rno);

    /**
     * 更新宿舍信息
     */
    void updateRoom(Room room);
}

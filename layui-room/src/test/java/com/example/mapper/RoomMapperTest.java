package com.example.mapper;

import com.example.LayuiRoomApplicationTests;
import com.example.entity.Room;
import com.example.entity.Student;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

class RoomMapperTest extends LayuiRoomApplicationTests {

    @Resource
    private RoomMapper roomMapper;

    @Test
    void getRoomList() {
        roomMapper.getRoomList().forEach(System.out::println);
    }

    @Test
    void addRoom(){
        /**、
         * 触发器无法实现，那么
         * 在前端显示的时候，根据宿舍楼的规格显示
         * 然后宿舍人数这个就初步预想着删掉吧
         */
        for (int i = 0; i < 100; i++) {
            Room room = new Room();
            room.setRno(i);
            if(i%3==1){
                room.setHno(1);
            }else if(i%3 == 2){
                room.setHno(2);
            }else{
                room.setHno(3);
            }
            //自行统计人数
            //room.setRoomCount();
            room.setRoomName("测试房间"+i);
            room.setRoom1(1);
            room.setRoom2(2);
            room.setRoom3(3);
            room.setRoom4(4);
            room.setRoom5(5);
            room.setRoom6(6);
            room.setRoom7(7);
            room.setRoom8(8);
            roomMapper.addRoom(room);
        }
    }




}
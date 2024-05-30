package com.example.mapper;

import com.example.LayuiRoomApplicationTests;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

class HouseMapperTest extends LayuiRoomApplicationTests {

    @Resource
    private HouseMapper houseMapper;

    @Test
    void addHouse() {
    }

    @Test
    void deleteByHno() {
    }

    @Test
    void updateHouse() {
    }

    @Test
    void getHouseList() {
        houseMapper.getHouseList().forEach(System.out::println);
    }
}
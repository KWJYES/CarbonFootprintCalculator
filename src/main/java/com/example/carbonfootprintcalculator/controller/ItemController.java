package com.example.carbonfootprintcalculator.controller;
import com.example.carbonfootprintcalculator.entity.*;
import com.example.carbonfootprintcalculator.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Service
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemMapper itemMapper;
    @PostMapping("/insert")
    public void insert(@RequestBody Item item){
                itemMapper.insert(item);
    }
//    @PostMapping("/update")
//    public void update(@RequestBody item item) {
//        itemMapper.update(item);
//    }
    @PostMapping("/dele")
    public void dele(@RequestBody Item item){
        itemMapper.delete(item);
    }

    @PostMapping("/find")
    public Item find(@RequestBody User user) {
        return itemMapper.findByUserName(user.getUname());
    }

}

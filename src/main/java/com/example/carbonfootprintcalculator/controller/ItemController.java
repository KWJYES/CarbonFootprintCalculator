package com.example.carbonfootprintcalculator.controller;
import com.example.carbonfootprintcalculator.entity.*;
import com.example.carbonfootprintcalculator.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Service
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemMapper itemMapper;
    @PostMapping("/insert")
    public Response insert(@RequestBody Item item){
                item.toTree();
                itemMapper.insert(item);
        return new Response(200, "操作成功", "");
    }
//    @PostMapping("/update")
//    public void update(@RequestBody item item) {
//        itemMapper.update(item);
//    }
    @PostMapping("/dele")
    public Response dele(@RequestBody Item item){
        itemMapper.delete(item);
        return new Response(200, "操作成功", "");
    }

    @PostMapping("/find")
    public List<Item> find(@RequestBody User user) {
        return itemMapper.findByUserName(user.getUname());
    }

}

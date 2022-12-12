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
    public void insert(@RequestBody item item){
            String Iname = item.getItemName();
            if (itemMapper.insertByName(Iname) ==null) {
//                System.out.println(itemMapper.insertByName(Iname).getItemName());
                itemMapper.insert(item);
            }
            else {
                itemMapper.update(item);
            }
    }
//    @PostMapping("/update")
//    public void update(@RequestBody item item) {
//        itemMapper.update(item);
//    }
    @PostMapping("/dele")
    public void dele(@RequestBody item item){
        itemMapper.delete(item);
    }

    @PostMapping("/find")
    public item find(@RequestBody item item) {
        return itemMapper.findById(item.getItemName());
    }

}

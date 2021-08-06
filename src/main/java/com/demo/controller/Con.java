package com.demo.controller;

import com.demo.enter.ManyToEntirty;
import com.demo.mapper.ManyMap;
import com.demo.mapper.Mapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 靖鸿宣
 * @since 2021/8/6
 */
@RestController
public class Con {

  @Resource private ManyMap map;
  @Resource private Mapper maps;

  @GetMapping("/test")
  public ManyToEntirty getCon() {
    //    ManyToEntirty mapper = new ManyToEntirty();
    //    List<Entirty> entirties = new ArrayList<>(100);
    //    entirties.add(new Entirty("hello", "word", "eee", "hhh1", "ddd"));
    //    entirties.add(new Entirty("hello2", "word", "eee1", "hhh", "ddd"));
    //    maps.saveAll(entirties);
    //    mapper.setId(1L);
    //    mapper.setEntirties(entirties);
    //    ManyToEntirty save = map.save(mapper);
    //
    //    System.out.println(save);
    map.deleteById(11L);
    return null;
  }
}

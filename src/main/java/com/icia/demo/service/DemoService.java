package com.icia.demo.service;

import com.icia.demo.dto.DemoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DemoService {
    @Autowired
    public DemoService demoService;
    public DemoDTO demo1(String name, int age) {
        DemoDTO demoDTO = new DemoDTO();
        demoDTO.setName(name);
        demoDTO.setAge(age);
        System.out.println("demoService.demo1");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        return demoDTO;
    }

    public ArrayList demo2(DemoDTO demoDTO) {
        ArrayList <DemoDTO> demoList = new ArrayList<>();
        demoList.add(demoDTO);
        return demoList;
    }
}

package com.project.everyfut.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping(value = {"/"})  // 루트 (index.html을 위해) 혹은 web 접근시에 Vue 프로젝트의 view 호출
    public String viewMapping() {
        return "index.html";
    }
}
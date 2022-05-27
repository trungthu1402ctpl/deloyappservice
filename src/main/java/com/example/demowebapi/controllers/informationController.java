package com.example.demowebapi.controllers;

import com.example.demowebapi.models.article;
import com.example.demowebapi.repositorys.articleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class informationController {
    @Autowired
    articleRepository rep;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/list-author", method = RequestMethod.GET)
    public String index() {
        long id = 1;
        article infor = rep.findById(id).get();
        System.out.println(infor.getAuthor()+" Hello");
        String result = "Title: " + infor.getTitle() + ", Author: " + infor.getAuthor() + ", Body: " + infor.getBody() ;
        return result;
    }
}

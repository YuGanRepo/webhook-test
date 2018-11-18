package com.yucode.ci;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Yu.Gan
 * @desc:
 * @date: 2018/11/18 13:22
 */
@RestController
@RequestMapping("/")
public class MainController {

  @RequestMapping
  public String hello() {
    return "Hello World!！！！";
  }

}

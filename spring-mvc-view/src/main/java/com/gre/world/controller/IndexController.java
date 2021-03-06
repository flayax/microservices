package com.gre.world.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @author 风骚的GRE
 * @Descriptions TODO
 * @date 2018/8/14.
 */
@Controller
public class IndexController {

    @GetMapping({"/",""})
    public String index(Model model){
        model.addAttribute("string",new StringUtil());
        return "index";
    }

    public static class StringUtil {

        public StringUtil() {
        }

        public boolean isNotBlank(String value) {
            return StringUtils.hasText(value);
        }

    }

    @ModelAttribute(name = "message")
    public String message() {
        return "Hello,world";
    }
}

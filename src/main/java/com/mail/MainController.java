package com.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private JavaMailSender javaMailSender;

    @GetMapping("/")
    public String mail(){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setTo("x@gmail.com");
        simpleMailMessage.setCc("x@gmail.com");
        simpleMailMessage.setText("Index succeed");

        javaMailSender.send(simpleMailMessage);

        return "mail";
    }
}

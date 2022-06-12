package com.flixwc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@SpringBootTest
class BootMailTest {

    @Autowired
    private MailSender mailSender;
    @Autowired
    private JavaMailSender javaMailSender;

    @Test
    public void test(){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("test");
        simpleMailMessage.setText("hello, gay");
        simpleMailMessage.setTo("2316700204@qq.com");
        simpleMailMessage.setFrom("felixwc_ah@qq.com");
        mailSender.send(simpleMailMessage);
    }
    @Test
    public void testMime() throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true,"utf-8");
        helper.setFrom("");
        helper.setTo("");
        javaMailSender.send(mimeMessage);
    }
}
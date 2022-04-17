package com.felixwc.dao;

import com.felixwc.pojo.BookDo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BookDao1Test {
    @Autowired
    private BookDao1 bookDao;

    @Test
    void test() {
        bookDao.save(new BookDo().setName("Java"));
        List<BookDo> list = bookDao.findAll();
        list.stream().forEach(System.out::println);
    }
}
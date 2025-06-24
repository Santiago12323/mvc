package com.edu.escuelaing.arsw.mvc.domain.usecases;

import com.edu.escuelaing.arsw.mvc.domain.ports.MvcService;

public class MvcServiceImpl implements MvcService {
    @Override
    public String getHtml(String name){
        return "<!DOCTYPE HTML>\n" +
                "<html xmlns:th=\"http://www.thymeleaf.org\">\n" +
                "<head>\n" +
                "    <title>Getting Started: Serving Web Content</title>\n" +
                "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "</head>\n" +
                "<body>\n" +
                "<p th:text=\"|Hello, ${name}!|\" />\n" +
                "</body>\n" +
                "</html>";
    }
}

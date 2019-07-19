package test.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import test.entity.Book;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("json")
public class JsonController {
    private static final Log log=LogFactory.getLog(JsonController.class);

    @RequestMapping("test")
    public void setJson(@RequestBody Book book, HttpServletResponse response)throws Exception{
        ObjectMapper mapper=new ObjectMapper();
        log.info(mapper.writeValueAsString(book));
        book.setAuthor("j");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(mapper.writeValueAsBytes(book));
    }
}

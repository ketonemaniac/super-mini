package com.sctrcd.supermini;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloRestController {
    
    public HelloRestController() {
    }
    
    @RequestMapping(value = "/hello")
    public String countries() {
        return "Hello, World!";
    }


    /**
     * https://spring.io/blog/2011/10/13/using-cloud-foundry-services-with-spring-part-1-the-basics
     * @param response
     * @throws IOException
     */
    @RequestMapping("/env")
    public void env(HttpServletResponse response) throws IOException {
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.println("System Environment:");
        for (Map.Entry<String, String> envvar : System.getenv().entrySet()) {
            out.println(envvar.getKey() + ": " + envvar.getValue());
        }
        out.println("hello, " + System.getenv().get("hello"));
    }
}

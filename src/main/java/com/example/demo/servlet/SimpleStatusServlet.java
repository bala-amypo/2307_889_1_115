package com.example.demo.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/simple-status")
public class SimpleStatusServlet extends HttpServlet {

    // MUST be public (tests call directly)
    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {

        response.setContentType("text/plain");

        response.setStatus(HttpServletResponse.SC_OK);

        PrintWriter writer = response.getWriter();

       
        writer.write("Cold Chain Temperature Breach Alert System is running");

       
        writer.flush();
    }
}

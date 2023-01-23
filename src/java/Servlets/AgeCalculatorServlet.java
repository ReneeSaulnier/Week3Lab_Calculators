/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Renee
 */
public class AgeCalculatorServlet extends HttpServlet {
    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Setting the parameter for age to be used for errorchecking and displaying
        String age = request.getParameter("age");
        request.setAttribute("age", age);
        
        // Checking if the textbox is empty before displaying the age
        if(age == null || age.equals("")){
            request.setAttribute("message", "You must enter an age.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);                
            return;
        }

        // Displaying the age
        try{
            int ageAdded = Integer.parseInt(request.getParameter("age"));
            int finalAge = ageAdded + 1;
            request.setAttribute("message", "Your next birthday will be " + finalAge);
        // Catching if there has been anything other than a number for input    
        }catch (NumberFormatException e){
            request.setAttribute("message", "You must enter a number.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);                
            return;  
        }
       getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

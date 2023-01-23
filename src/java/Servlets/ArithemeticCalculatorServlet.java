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
public class ArithemeticCalculatorServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Recieving my parameters
        String first = request.getParameter("first");
        String last = request.getParameter("last");
        String submit = request.getParameter("submit");
        
        // Setting them into the variables
        request.setAttribute("first", first);
        request.setAttribute("last", last);
        request.setAttribute("submit", submit);
        
        try{
            // Setting variables for the calculations
            int firstNumber = Integer.parseInt(request.getParameter("first"));
            int secondNumber = Integer.parseInt(request.getParameter("last"));
            
            // Using a switch to check which calculations will be preformed then displaying the answer in the message tag
            switch(submit){
                case "+": request.setAttribute("message", firstNumber + secondNumber);
                break;
                case "-": request.setAttribute("message", firstNumber - secondNumber);
                break;
                case "*": request.setAttribute("message", firstNumber * secondNumber);
                break;
                case "%": request.setAttribute("message", firstNumber % secondNumber);
                break;
            }
            
          // Checking for any possible exceptions
        } catch (NumberFormatException e){
            request.setAttribute("message", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);                
            return;
        }   
     getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

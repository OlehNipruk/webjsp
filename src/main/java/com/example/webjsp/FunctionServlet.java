package com.example.webjsp;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/function")
public class FunctionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Отримання значень параметрів з запиту
        double a = Double.parseDouble(request.getParameter("a"));
        double b = Double.parseDouble(request.getParameter("b"));
        double c = Double.parseDouble(request.getParameter("c"));
        double start = Double.parseDouble(request.getParameter("start"));
        double end = Double.parseDouble(request.getParameter("end"));
        double step = Double.parseDouble(request.getParameter("step"));

        // Генерація xValues та yValues за допомогою FunctionCalculator
        double[] xValues = FunctionCalculator.generateXValues(start, end, step, a, b, c);
        double[] yValues = FunctionCalculator.generateYValues(xValues, a, b, c);

        // Знаходження індексів максимального та мінімального значення y
        int maxIndex = FunctionCalculator.findIndexOfMax(yValues);
        int minIndex = FunctionCalculator.findIndexOfMin(yValues);

        // Розрахунок суми та середнього значення y
        double sum = FunctionCalculator.calculateSum(yValues);
        double average = FunctionCalculator.calculateAverage(yValues);

        // Передача результатів на сторінку результатів
        request.setAttribute("xValues", xValues);
        request.setAttribute("yValues", yValues);
        request.setAttribute("maxX", xValues[maxIndex]);
        request.setAttribute("maxY", yValues[maxIndex]);
        request.setAttribute("minX", xValues[minIndex]);
        request.setAttribute("minY", yValues[minIndex]);
        request.setAttribute("sum", sum);
        request.setAttribute("average", average);

        // Перенаправлення на сторінку результатів
        request.getRequestDispatcher("resultPage.jsp").forward(request, response);
    }
}
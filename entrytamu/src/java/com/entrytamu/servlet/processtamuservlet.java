/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entrytamu.servlet;

import com.entrytamu.ejb.EntrytamuFacade;
import com.entrytamu.entities.Entrytamu;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author luqman.sahidin
 */
@WebServlet(name = "processtamuservlet", urlPatterns = {"/processtamuservlet"})
public class processtamuservlet extends HttpServlet {

    @EJB
    private EntrytamuFacade entrytamuFacade;

    private static final Logger LOG = Logger.getLogger(processtamuservlet.class.getName());
    static final DateFormat FormatTanggal = new SimpleDateFormat("dd/MM/yyy");

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            
            String NID = request.getParameter("NID");
            String $tanggal = request.getParameter("Tanggal");
            String Nama = request.getParameter("Nama");
            String Alamat = request.getParameter("Alamat");
            String Keperluan = request.getParameter("Keperluan");
            
            Date Tanggal = FormatTanggal.parse($tanggal);
            
            LOG.info("NID: "+NID);
            
            Entrytamu entrytamu = new Entrytamu();
            entrytamu.setNID(NID);
            entrytamu.setTanggal(Tanggal);
            entrytamu.setNama(Nama);
            entrytamu.setAlamat(Alamat);
            entrytamu.setKeperluan(Keperluan);
            
            entrytamuFacade.create(entrytamu);
            
            RequestDispatcher reqDis = request.getRequestDispatcher("/index.jsp");
            request.setAttribute("entrytamu", entrytamu);
            reqDis.forward(request, response);
            
        }   catch (ParseException ex) {
            Logger.getLogger(processtamuservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.net.util.SubnetUtils;
import org.apache.commons.net.util.SubnetUtils.SubnetInfo;
/**
 *
 * @author rife-
 */
public class ConsultaIp extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String enderecoIpInformado = request.getParameter("enderecoIp");
            SubnetUtils utils = new SubnetUtils(enderecoIpInformado);
            SubnetInfo info = utils.getInfo();
            
            String enderecoIP = info.getAddress();
            String mascaraDeRede = info.getNetmask();
            String enderecoDeRede = info.getBroadcastAddress();
            
            String cidr = info.getCidrSignature();
            
            String classeDoEnderecoIp = "";
            
            if (cidr.contains("/24")){
                classeDoEnderecoIp = "C";
            }else if(cidr.contains("/16")){
                classeDoEnderecoIp = "B";
            }else if (cidr.contains("/8")){
                classeDoEnderecoIp = "A";
            }
            
            out.println("<html>");
            
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"respostaConsulta.css\" type=\"text/css\"/>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<title>APS - Desenvolvimento de Aplicações Web</title>");
            out.println("</head>");
            
            out.println("<body>");
            
            out.println("<table id=\"respostaConsulta\">");
            
            out.println("<tr>");
            out.println("<td>Endereço IP</td>");
            out.println("<td>" + enderecoIP + "</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Máscara de Rede</td>");
            out.println("<td>" + mascaraDeRede + "</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Endereço de Rede</td>");
            out.println("<td>" + enderecoDeRede + "</td>");
            out.println("</tr>");
            
            out.println("<tr>");
            out.println("<td>Classe</td>");
            out.println("<td>" + classeDoEnderecoIp + "</td>");
            out.println("</tr>");
            
            out.println("</table>");
            
            out.println("</body>");
            out.println("</html>");
            
                       
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

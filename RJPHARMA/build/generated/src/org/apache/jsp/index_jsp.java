package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/WEB-INF/jspf/conect.jsp");
    _jspx_dependants.add("/WEB-INF/tags/tagCssTitle.tag");
    _jspx_dependants.add("/WEB-INF/tags/body.tag");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection(""
        + "jdbc:mysql://localhost:3311/pwii", "root", "root");
Statement stm = con.createStatement();

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      if (_jspx_meth_pg_tagCssTitle_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!--VALIDANDO LOGIN;-->\n");
      out.write("        ");
if(session.getAttribute("login")!=null){
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <tr><td>&nbsp;<i>Logado como:</i> <b>");
      out.print(session.getAttribute("lgn"));
      out.write("</b> </td><td> <a href=\"logout.jsp\"><input type=\"button\" value=\"Sair\" /></a></td></tr>\n");
      out.write("        </table>\n");
      out.write("        ");
} else{
            response.sendRedirect("login.jsp?msg=Efetue o login!");
        }
      out.write("\n");
      out.write("        <!--VALIDANDO LOGIN;-->\n");
      out.write("        \n");
      out.write("        ");
      if (_jspx_meth_pg_body_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
            
            if (request.getParameter("ms")!= null) {
                String sqldel = "delete from medicamento where ms=" + request.getParameter("ms");
                int resdel = stm.executeUpdate(sqldel);
                if (resdel > 0) {
                    out.println("&nbsp;");
                    out.println("<i>Medicamento removido com sucesso.</i>");
                } else {
//                    out.println("Ocorreu algum erro, entre em contato com o administrador do sistema.");
                }
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        ");
      beans.FtData data = null;
      synchronized (_jspx_page_context) {
        data = (beans.FtData) _jspx_page_context.getAttribute("data", PageContext.PAGE_SCOPE);
        if (data == null){
          data = new beans.FtData();
          _jspx_page_context.setAttribute("data", data, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <!-- O mes atual é ");
      out.print(data.mesExt(8));
      out.write(" -->\n");
      out.write("        ");

            if (request.getParameter("nome") == null) {
        
      out.write("\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <h2>CADASTRE UM MEDICAMENTO</h2>\n");
      out.write("            <br />\n");
      out.write("            <form action=\"index.jsp\" method=\"post\" name=\"frmUser\">\n");
      out.write("                <table border=\"1\" width=\"450px\" height=\"150px\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"text-align: center;\">MS:</td>\n");
      out.write("                        <td style=\"text-align: center;\"><input name=\"ms\" type=\"text\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"text-align: center;\">Nome:</td>\n");
      out.write("                        <td style=\"text-align: center;\"><input name=\"nome\" type=\"text\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"text-align: center;\">Preço R$:</td>\n");
      out.write("                        <td style=\"text-align: center;\"><input name=\"valor\" type=\"number\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"text-align: center;\">Descrição</td>\n");
      out.write("                        <td style=\"text-align: center;\"><input name=\"descr\" type=\"text\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <br />\n");
      out.write("                <input type=\"submit\" value=\"Cadastrar\" />\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        ");

            } else {
                String ms = request.getParameter("ms");
                String nome = request.getParameter("nome");
                String valor = request.getParameter("valor");
                String descr = request.getParameter("descr");

                String sql = "insert into medicamento(ms, nome, valor, descr) values ('"
                        + ms + "','" + nome + "','" + valor + "','" + descr + "')";
                int res = stm.executeUpdate(sql);
                if (res > 0) {
                    out.println("&nbsp;");
                    out.println("<i>Registro incluido com sucesso.</i>");
                    out.println("<br />");
                    out.println("<br />");
                    out.println("<center><a href='index.jsp'><input type='button' value='Voltar' /></a></center>");

                } else {
                    out.println("Se ferrou");
                }
            }
        
      out.write("\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <br />\n");
      out.write("            <h3>Dados cadastrados</h3>\n");
      out.write("            <br />\n");
      out.write("            <table border=\"1\" width=\"650px\" height=\"40px\">\n");
      out.write("                ");

                    ResultSet res = stm.executeQuery("select * from medicamento");
                    out.println("<tr align='center'><td>MS</td><td>MEDICAMENTO</td><td>VALOR</td><td>DESCRIÇÃO</td><td>AÇÃO</td></tr>");
                    if (res.next()) {
                        do {

                            out.println("<tr><td>" + res.getString(1));
                            out.println("</td><td>" + res.getString(2));
                            out.println("</td><td>" + res.getString(3));
                            out.println("</td><td>" + res.getString(4));
                            out.println("</td><td><a href='index.jsp?ms=" + res.getString(1) + "'>REMOVER</a> / <a href='edit.jsp?ms=" + res.getString(1) + "'>EDITAR</a></td></tr>");                
                                                        
                        } while (res.next());
                    } else {
                        out.println("<i>Sem medicamentos cadastrados</i>");
                        out.println("<br />");
                        out.println("<br />");
                    }


                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/jspf/rodape.jspf", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_pg_tagCssTitle_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  pg:tagCssTitle
    org.apache.jsp.tag.web.tagCssTitle_tag _jspx_th_pg_tagCssTitle_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.tagCssTitle_tag.class) : new org.apache.jsp.tag.web.tagCssTitle_tag();
    _jspx_th_pg_tagCssTitle_0.setJspContext(_jspx_page_context);
    _jspx_th_pg_tagCssTitle_0.setMessage("RJ PHARMA 1.0");
    _jspx_th_pg_tagCssTitle_0.doTag();
    return false;
  }

  private boolean _jspx_meth_pg_body_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  pg:body
    org.apache.jsp.tag.web.body_tag _jspx_th_pg_body_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.body_tag.class) : new org.apache.jsp.tag.web.body_tag();
    _jspx_th_pg_body_0.setJspContext(_jspx_page_context);
    _jspx_th_pg_body_0.setSubtitulo("Controle de estoque para medicamentos");
    _jspx_th_pg_body_0.setTitulo("Sistema RJ PHARMA");
    _jspx_th_pg_body_0.doTag();
    return false;
  }
}

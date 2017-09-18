package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class body_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList<String> _jspx_nested = null;
    java.util.ArrayList<String> _jspx_at_begin = null;
    java.util.ArrayList<String> _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private java.lang.String titulo;
  private java.lang.String subtitulo;
  private java.lang.String banner;

  public java.lang.String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(java.lang.String titulo) {
    this.titulo = titulo;
  }

  public java.lang.String getSubtitulo() {
    return this.subtitulo;
  }

  public void setSubtitulo(java.lang.String subtitulo) {
    this.subtitulo = subtitulo;
  }

  public java.lang.String getBanner() {
    return this.banner;
  }

  public void setBanner(java.lang.String banner) {
    this.banner = banner;
  }

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    if( getTitulo() != null ) {
      _jspx_page_context.setAttribute("titulo", getTitulo());
}
    if( getSubtitulo() != null ) {
      _jspx_page_context.setAttribute("subtitulo", getSubtitulo());
}
    if( getBanner() != null ) {
      _jspx_page_context.setAttribute("banner", getBanner());
}

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("        <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${titulo}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("</h1>\n");
      out.write("        <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subtitulo}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("</h2>\n");
      out.write("        \n");
      out.write("        <p>\n");
      out.write("        Versão 1.0<br />\n");
      out.write("        Última Atualização: 15/09/2017<br />\n");
      out.write("        Detalhe da Atualização:<BR />\n");
      out.write("        DB Login System + Privilegy System.<br />\n");
      out.write("        <br />\n");
      out.write("        Próximo Patch:<br />\n");
      out.write("        - <i>Static WebService</i> <b>(90%)</b><br />\n");
      out.write("        - <i>DB WebService</i> <b>(0%)</b><br />\n");
      out.write("        - <i>Sistema de consumo do WebService</i> <b>(0%)</b><br />        \n");
      out.write("        </p>\n");
      out.write("</header>");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}

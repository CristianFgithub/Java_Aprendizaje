<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page import="java.util.*" %>
<html>
<style type="text/css">
.titcentrado {
	text-align: center;
}
</style>

<body bgcolor="#99CC66">
<h1 class="titcentrado">Carro de la compra (supuesto)</h1>
<form name="Formulario_Compra" action="Lista_Compra.jsp">
 
  <p>Artículos a comprar:</p>
  <p>
    <label>
      <input type="checkbox" name="articulos" value="agua " >
      Agua </label>
    <br>
    <label>
      <input type="checkbox" name="articulos" value="leche" >
      Leche </label>
    <br>
     <label>
      <input type="checkbox" name="articulos" value="pan" >
      Pan </label>
    <br>
     <label>
      <input type="checkbox" name="articulos" value="mazanas" >
      Manzanas </label>
    <br>
     <label>
      <input type="checkbox" name="articulos" value="carne" >
      Carne </label>
      <br>
       <label>
      <input type="checkbox" name="articulos" value="pescado" >
      Pescado </label>
  </p>
  <p>
    <input type="submit" name="button" id="button" value="Enviar">
    <br>
  </p>
</form>

<h3>Carro de la compra virtual</h3>

<ul>
<%


	ArrayList<String> listaAlimentos=(ArrayList<String>)session.getAttribute("misAlimentos");

	if(listaAlimentos==null){
		
		listaAlimentos=new ArrayList<String>();
		
		session.setAttribute("misAlimentos", listaAlimentos);
			
	}
	
	

	String [] alimentos = request.getParameterValues("articulos");

	if(alimentos!=null){

		for(String alimento:alimentos){
			
			listaAlimentos.add(alimento);
			
			//out.println("<li>"+alimento+"</li>");
			
			
		}
	}
	
	for(String alimentoLista:listaAlimentos)out.println("<li>"+alimentoLista+"</li>");



%>
</ul>
</body>

</html>
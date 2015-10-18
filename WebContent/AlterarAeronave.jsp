<%@page import="to.AeronaveTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="css/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
    
<script async defer type = "text/javascript">
function mostraResult(){
var url = window.location.toString();
var aux = url.split("?");
var aux1 = aux[1].split("&");
var aux2 = aux1[0].split("=");
var aux3 = aux1[1].split("=");
var aux4 = aux1[2].split("=");
var aux5 = aux1[3].split("=");
document.getElementById("nome").value = aux4[1];
document.getElementById("id").value = aux2[1];
document.getElementById("cod").value = aux3[1];
document.getElementById("quant").value = aux5[1];
selectedIndex = aux3[1];

}

</script>
</head>
<body onLoad = "mostraResult()" id="top">
  <div id="wrapper">

        
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Alterar Aeronave</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
						<div class="panel-body">
                             <form method ="post" action = "AlterarAeronave">  
                            <div class="row">
                                <div class="col-lg-6">
                                       <form role="form">
                                        <div class="form-group">
                                           
                                         
                                            
                                            <label>Código Aeronave</label>
                                            <input class="form-control" id = "cod" name = "cod" required = true>
                                            <label>Nome</label>
                                            <input class="form-control" id = "nome" name = "nome" required = true>
                                            <label>Quantidade de assentos</label>
                                            <input class="form-control" id = "quant" name ="quantidade"  required = true>
                                               <button  name = "salvar"type="submit" class="btn btn-default">Salvar</button>  
                                             <div style="visibility: hidden"> 
                                            <label>Código </label>
                                            <input class="form-control" id = "id" name="id" autofocus required = true>
                                           </div>
                                           </form>
                                            </div>
                                        </div>
										</form>
                                        
                                </div>
                                <!-- /.col-lg-6 (nested) -->
                                 
                                 
                                 </div>
                            </div>
               
        <!-- /#page-wrapper -->
    <!-- jQuery -->
    <script src="js/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="js/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/sb-admin-2.js"></script>

</body>

</html>
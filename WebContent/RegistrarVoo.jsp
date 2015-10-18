<%@page import="java.util.*"%>

<!DOCTYPE html>
<head>
  <title>Registrar Voo</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>  <BODY BACKGROUND="Boeing.jpg">
</head>
<body>

<%
  try{
	  
  int status = (int)request.getSession().getAttribute("StatusVoo");
  if(status == -1){
  %>
  <script>alert('Erro no inserir dados!!!')</script> 
  <% 
  }
  else if ( status == 0){
  %>
  <script>alert('Dados inseridos com sucesso!!!')</script> 
  }
  <%
  }
}
	  
  
  catch(Exception ex){
  //ex.printStackTrace();
  }
  
  %>
  
 
<div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Registrar Voo</h1>
</div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Dados do Voo
                        </div>
                        <form method ="post" action = "CadastroVoo">
						<div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form">
                                        <div class="form-group">
            
		<tr> <td> <label for="codigo">Código:</label>
		</td><td> <input class="form-control" name="codigo" class="txt"/> </td> </tr>
		
		<tr> <td> <label for="Origem">Origem:</label>
		</td> <td> <input class="form-control" name="origem" class="txt"/> </td> </tr>
		
		<br>
		
		<tr> <td> <label for="Origem">Destino:</label>
		</td> <td> <input class="form-control" name="destino" class="txt"/> </td> </tr>
		
		<tr> <td><label>Escalas</label>
		</td> <td><select class="form-control" name = "escalas" id = "escalas">
		<option value = "0"> 0 </option>
		<option value = "0"> 1 </option>
		<option value = "0"> 2 </option>
		<option value = "0"> 3 </option>
		<option value = "0"> 4 </option>
		<option value = "0"> 5 </option>
		<option value = "0"> 6 </option>
		<option value = "0"> 7 </option>
		</select> </td> </tr>
		<br>
		<tr> <td> <label for="Data">Data/Hora:</label>
		</td><td> <input class="form-control" name="data" class="txt"/> </td> </tr>
		
		<tr> <td> <label for="Aeronave">Aeronave:</label>
		</td> <td> <input class="form-control" name="aeronave" class="txt"/> </td> </tr>
		<br>
		
		 <tr><td> <label>Situacao</label>
		 </td> <td> <select class="form-control" name = "situacao" id = "situacao">
		<option value = "emespera"> Em espera </option>
              <option value = "Confirmado"> Confirmado </option>
              <option value = "Cancelado"> Cancelado </option>
              <option value = "Atrasado"> Atrasado </option>
              <option value = "Embarque"> Embarque </option>
              <option value = "Finalizado"> Finalizado</option>
         
		</select> </td> </tr>
		<div>
       
                                            <button  name = "salvar"type="submit" class="btn btn-default">Salvar</button>
                                            </div>
                                            </form>
                                            </form>   
                                            
 <form method = "post" action = "carregavoo">
                                            <br> </br>
                                            <button  name = "consultar"type="submit" class="btn btn-default">Consultar</button>
                                            </form>
                                        </div>
										 
                                        
                                </div>
                                <!-- /.col-lg-6 (nested) -->
                                 
                                 
                                 </div>
                            </div>
                            <!-- /.row (nested) -->
                        </div>
						           
                        
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
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
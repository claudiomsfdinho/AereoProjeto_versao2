<!DOCTYPE html>
<head>
  <title>Registrar Aeronave</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
 <%
  try{
  int status = (int)request.getSession().getAttribute("Status");
  if(status == -1){
  %>
  <script>alert('Erro no inserir dados!!!')</script> 
  <% 
  }
  else if ( status == 0){
  %>
  <script>alert('Dados inseridos com sucesso!!!')</script> 
  <%}}
  catch(Exception ex){
  //ex.printStackTrace();
  }
  
  %>
<div id="wrapper">

<div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Registrar Aeronave</h1>
</div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Aeronave
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                        <form method ="post" action = "CadastroAeronave"> 
                                       <form role="form">
                                        <div class="form-group">
                                            
            
		 <label for="codigo">Código da Aeronave:</label>
		 <input class="form-control" name="codigo" class="txt"/> 
		
		
		
		<br>
		
		<label>Nome</label>
		<select class="form-control" name = "nome">
		<option value = "Airbus A300"> Airbus A300 </option>
		<option value = "Airbus A330"> Airbus A330 </option>
		<option value = "Boeing 717"> Boeing 717 </option>
		<option value = "Boeing 747"> Boeing 747 </option>
		<option value = "Embraer ERJ-140"> Embraer ERJ-140 </option>
		<option value = "Embraer Legacy 500"> Embraer Legacy 500 </option>
		<option value = "Fokker 100"> Fokker 100 </option>
		
		</select> 
		 <label for="Origem">Quantidade:</label>
		 <input class="form-control" name="quantidade" class="txt"/> 
		<div>
       
                                            <button  name = "salvar"type="submit" class="btn btn-default">Salvar</button>
                                            </div>
                                            </form>
                                            </form>   
                                            
 <form method = "post" action = "carregaaeronave">
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
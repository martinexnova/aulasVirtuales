
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=Edge">
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <title>Welcome To | Bootstrap Based Admin Template - Material Design</title>
        <!-- Favicon-->
        <link rel="icon" href="favicon.ico" type="image/x-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Roboto:400,700&subset=latin,cyrillic-ext" rel="stylesheet" type="text/css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" type="text/css">

        <!-- Bootstrap Core Css -->
        <link href="plugins/bootstrap/css/bootstrap.css" rel="stylesheet">

        <!-- Waves Effect Css -->
        <link href="plugins/node-waves/waves.css" rel="stylesheet" />

        <!-- Animation Css -->
        <link href="plugins/animate-css/animate.css" rel="stylesheet" />

        <!-- Morris Chart Css-->
        <link href="plugins/morrisjs/morris.css" rel="stylesheet" />

        <!-- Custom Css -->
        <link href="css/style.css" rel="stylesheet">

        <!-- AdminBSB Themes. You can choose a theme from css/themes instead of get all themes -->
        <link href="css/themes/all-themes.css" rel="stylesheet" />
    </head>

    <body class="theme-red">
        <!-- Page Loader -->

        <%--include header --%> 

        <%@include file="/header.jsp" %>

        <%--end include header --%>  



        <%--include izquierda --%> 

        <%@include file="izquierda.jsp"%>

        <%--end include izquierda --%>  



        <%--muestra el contenido --%> 

        <section class="content">
            <div class="container-fluid">
                <div class="block-header">
                    <h3><strong>VER COMPAÑERO DE CLASES</strong></h3>
                </div>
                <!-- Tabs With Icon Title -->
               
                                <!-- Nav tabs
                                <ul class="nav nav-tabs" role="tablist">
                                    <li role="presentation" class="active">
                                        <a href="#cargUnidad_nav" data-toggle="tab">
                                            <i class="material-icons">assignment_returned </i> Carga por Unidad
                                        </a>
                                    </li>
                                    <li role="presentation">
                                        <a href="#cargMasiva_nav" data-toggle="tab">
                                            <i class="material-icons">file_upload </i> Carga Masiva
                                        </a>
                                    </li>
                                </ul>

                                Tab panes -->
                                <div class="tab-content">
                                    <div role="tabpanel" class="tab-pane fade in active" id="cargUnidad_nav">
                                        <div class="row clearfix">
                                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                <div class="card">
                                                    <div class="header">
                                                        <div class="col-md-10 col-sm-9 col-xs-8">
                                                            <h2>
                                                                <strong>LISTA</strong>
                                                            </h2>
                                                        </div>
                                                        <!--
                                                        <button type="button" class="btn bg-cyan waves-effect btn-sm col-md-2 col-sm-3 col-xs-4" data-toggle="modal" data-target="#buscarUnidad">
                                                            <i class="material-icons">search</i>
                                                            <span>Buscar Unidad</span>
                                                        </button>
                                                        -->
                                                    </div>
                                                    <div class="body">
                                                        <form action="loginc"  method="post">
                                                             <div class="row clearfix">
                                                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                                <div class="card">
                                                            <div class="body table-responsive js-sweetalert">
                                                                <table class="table table-bordered table-striped table-hover js-basic-example dataTable">
                                                                    <thead>
                                                                        <tr>
                                                                            <th>Nombre</th>
                                                                            <th>Apellido</th>
                                                                            <th>Email</th>
                                                                            <th>Telefono</th>
                                                                            <th>Carrera</th>
                                                                            <th>Ciclo</th>
                                                                              <th>Seccion</th>
                                                                        </tr>
                                                                    </thead>
                                                                    <tbody>

                                                                    <c:forEach items="${alumnos}" var="listar" varStatus="status">
                                                                        <tr>
                                                                            <td>${listar.name}</td>
                                                                            <td>${listar.lastname}</td>
                                                                            <td>${listar.email}</td>
                                                                            <td>${listar.numberPhone}</td>
                                                                            <td>${listar.carrera}</td>
                                                                            <td>${listar.ciclo}</td>
                                                                            <td>${listar.seccion}</td>
                                                                        </tr>
                                                                    </c:forEach>
                                                                    </tbody>
                                                                </table>
                                                            </div>
                                                               </div>
                                                           </div>
                                                       </div>                                                

                                                        </form>
                                                    </div>


                                                    <!-- Modal Buscar Unidad -->
                                                    <div class="modal fade" id="buscarUnidad" tabindex="-1" role="dialog">
                                                        <div class="modal-dialog modal-lg" role="document">
                                                            <div class="modal-content">
                                                                <div class="modal-header">
                                                                    <h4 class="modal-title" id="largeModalLabel">Buscar Unidad</h4>
                                                                </div>
                                                                <div class="modal-body">
                                                                    <div class="form-group form-float form-group-lg">
                                                                        <div class="col-lg-1 col-md-2 col-sm-4 col-xs-5 form-control-label">
                                                                            <label>Nucleo</label>
                                                                        </div>
                                                                        <div class="col-lg-3 col-md-4 col-sm-8 col-xs-7">
                                                                            <div class="form-group">
                                                                                <div class="form-line">
                                                                                    <select class="form-control show-tick">
                                                                                        <option>- Seleccionar -</option>
                                                                                        <option>I DE</option>
                                                                                        <option>II DE</option>
                                                                                    </select>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                        <div class="col-lg-6 col-md-9 col-sm-9 col-xs-9">
                                                                            <div class="form-line ">
                                                                                <input type="text" class="form-control" />
                                                                                <label class="form-label">Nombre de la unidad</label>
                                                                            </div>
                                                                        </div>
                                                                        <div class="col-lg-2 col-md-3 col-sm-3 col-xs-3">
                                                                            <button type="button" class="btn btn-info waves-effect col-md-12 col-sm-12 col-xs-12" onclick="javascript:buscarpersonal();">
                                                                                <i class="material-icons">search</i>
                                                                                <span>Buscar</span>
                                                                            </button>
                                                                        </div>
                                                                    </div>                                                           
                                                                    <div class="row clearfix">
                                                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                                            <div class="body">
                                                                                <div class="table-responsive">
                                                                                    <table class="table table-bordered table-striped table-hover js-basic-example dataTable">
                                                                                        <thead>
                                                                                            <tr>
                                                                                                <th>Nro</th>
                                                                                                <th>CIP</th>
                                                                                                <th>DNI</th>
                                                                                                <th>Grado</th>
                                                                                                <th>Apellidos y Nombres</th>
                                                                                            </tr>
                                                                                        </thead>
                                                                                        <tfoot>
                                                                                            <tr>
                                                                                                <th>Nro</th>
                                                                                                <th>CIP</th>
                                                                                                <th>DNI</th>
                                                                                                <th>Grado</th>
                                                                                                <th>Apellidos y Nombres</th>
                                                                                            </tr>
                                                                                        </tfoot>
                                                                                        <tbody>
                                                                                            <tr>
                                                                                                <td>1</td>
                                                                                                <td>331843500</td>
                                                                                                <td>70196861</td>
                                                                                                <td>SO2</td>
                                                                                                <td>Ocas Vasquez Luis</td>
                                                                                            </tr>
                                                                                            <tr>
                                                                                                <td>2</td>
                                                                                                <td>331843500</td>
                                                                                                <td>70196861</td>
                                                                                                <td>SO2</td>
                                                                                                <td>Ocas Vasquez Luis</td>
                                                                                            </tr>
                                                                                            <tr>
                                                                                                <td>3</td>
                                                                                                <td>331843500</td>
                                                                                                <td>70196861</td>
                                                                                                <td>SO2</td>
                                                                                                <td>Ocas Vasquez Luis</td>
                                                                                            </tr>
                                                                                            <tr>
                                                                                                <td>4</td>
                                                                                                <td>331843500</td>
                                                                                                <td>70196861</td>
                                                                                                <td>SO2</td>
                                                                                                <td>Ocas Vasquez Luis</td>
                                                                                            </tr>                                                                                       
                                                                                        </tbody>
                                                                                    </table>
                                                                                </div>
                                                                            </div>                                                                    
                                                                        </div>
                                                                    </div>
                                                                    <div class="modal-footer">
                                                                        <button type="button" class="btn btn-success" data-dismiss="modal" onclick="javasript:mostrarbusqueda();" >Aceptar</button>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>


                                        </div>
                                        <!--
                                        <div class="row clearfix">
                                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                <div class="card">
                                                    <div class="header bg-blue-grey">
                                                        <h2>
                                                            <strong>Lista - Bonos por Unidad</strong>
                                                        </h2>
                                                    </div>
                                                    <div class="body table-responsive js-sweetalert">
                                                        <table class="table table-striped">
                                                            <thead>
                                                                <tr>
                                                                    <th>DNI</th>
                                                                    <th>Nro Reg</th>
                                                                    <th>Mes Proc</th>
                                                                    <th>Cod Ing</th>
                                                                    <th>Cod Uni</th>
                                                                    <th>Apellidos y Nombres</th>
                                                                    <th>CIP</th>
                                                                    <th>Grado</th>
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                </div>
                                            </div>-->
                                        </div>
                                    </div>

                                    <div role="tabpanel" class="tab-pane fade" id="cargMasiva_nav">                                        
                                        <div class="row clearfix">
                                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                <div class="card">
                                                    <div class="header">
                                                        <div class="col-md-10 col-sm-9 col-xs-8">
                                                            <h2>
                                                                <strong>Importación de Datos</strong>
                                                            </h2>
                                                        </div>
                                                    </div>
                                                    <div class="body">
                                                        <form class="form-horizontal" id="form_validation" method="POST">
                                                            <div class="row clearfix">
                                                                <div class="col-lg-2 col-md-2 col-sm-4 col-xs-5 form-control-label">
                                                                    <label>Fecha</label>
                                                                </div>
                                                                <div class="col-lg-4 col-md-4 col-sm-8 col-xs-7">
                                                                    <div class="input-group">                                                                        
                                                                        <div class="form-line">
                                                                            <input type="text" class="datepicker form-control" placeholder="Escoge la fecha" class="col-lg-12 col-md-12 col-sm-12 col-xs-12">                                                                             
                                                                        </div>
                                                                        <span class="input-group-addon">
                                                                            <i class="material-icons">date_range</i>
                                                                        </span>
                                                                    </div>
                                                                </div>
                                                            </div>                                                            
                                                            <div class="row clearfix">                                                                        
                                                                <div class="col-lg-2 col-md-2 col-sm-4 col-xs-5 form-control-label">
                                                                    <label>Cargar</label>
                                                                </div>
                                                                <div class="col-lg-4 col-md-4 col-sm-8 col-xs-7">
                                                                    <input name="file" type="file" class="col-sm-12 col-xs-12"/>
                                                                </div>
                                                                <div class="col-lg-4 col-md-4 col-sm-5 col-xs-4">
                                                                    <button type="button" class="btn btn-success waves-effect btn-sm col-md-6 col-sm-8 col-xs-12">
                                                                        <i class="material-icons">file_upload </i>
                                                                        <span>Subir Archivo</span>
                                                                    </button>
                                                                </div>
                                                            </div>
                                                        </form>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>


                                        <div class="row clearfix">
                                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                <div class="card">
                                                    <div class="body">
                                                        <form action="/" id="frmFileUpload" class="dropzone" method="post" enctype="multipart/form-data">
                                                            <div class="dz-message">
                                                                <div class="drag-icon-cph">
                                                                    <i class="material-icons">touch_app</i>
                                                                </div>
                                                                <h3>CARGA MASIVA DE ARCHIVOS</h3>
                                                                <em>Arrastre y Suelte con un clic. Archivos XSL (Excel)</em>
                                                            </div>
                                                            <div class="fallback">
                                                                <input name="file" type="file" multiple />
                                                            </div>
                                                        </form>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="row clearfix">
                                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                <div class="card">
                                                    <div class="header bg-blue-grey">
                                                        <h2>
                                                            <strong>Lista - Bonos por Unidad</strong>
                                                        </h2>
                                                    </div>
                                                    <div class="body">
                                                        <div class="table-responsive">
                                                            <table class="table table-bordered table-striped table-hover js-basic-example dataTable">
                                                                <thead>
                                                                    <tr>
                                                                        <th>DNI</th>
                                                                        <th>Nro Reg</th>
                                                                        <th>Mes Proc</th>
                                                                        <th>Cod Ing</th>
                                                                        <th>Cod Uni</th>
                                                                        <th>Apellidos y Nombres</th>
                                                                        <th>CIP</th>
                                                                        <th>Grado</th>
                                                                    </tr>
                                                                </thead>
                                                                <tbody>
                                                                </tbody>
                                                            </table>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                  
                            <!-- #END# Tabs With Icon Title -->
                        </div>
                    </div>
                    </section>


                    <%--end muestra el contendo --%>  





                    <!-- Jquery Core Js -->
                    <script src="plugins/jquery/jquery.min.js"></script>

                    <!-- Bootstrap Core Js -->
                    <script src="plugins/bootstrap/js/bootstrap.js"></script>

                    <!-- Select Plugin Js -->
                    <script src="plugins/bootstrap-select/js/bootstrap-select.js"></script>

                    <!-- Slimscroll Plugin Js -->
                    <script src="plugins/jquery-slimscroll/jquery.slimscroll.js"></script>

                    <!-- Waves Effect Plugin Js -->
                    <script src="plugins/node-waves/waves.js"></script>

                    <!-- Jquery CountTo Plugin Js -->
                    <script src="plugins/jquery-countto/jquery.countTo.js"></script>

                    <!-- Morris Plugin Js -->
                    <script src="plugins/raphael/raphael.min.js"></script>
                    <script src="plugins/morrisjs/morris.js"></script>

                    <!-- ChartJs -->
                    <script src="plugins/chartjs/Chart.bundle.js"></script>

                    <!-- Flot Charts Plugin Js -->
                    <script src="plugins/flot-charts/jquery.flot.js"></script>
                    <script src="plugins/flot-charts/jquery.flot.resize.js"></script>
                    <script src="plugins/flot-charts/jquery.flot.pie.js"></script>
                    <script src="plugins/flot-charts/jquery.flot.categories.js"></script>
                    <script src="plugins/flot-charts/jquery.flot.time.js"></script>

                    <!-- Sparkline Chart Plugin Js -->
                    <script src="plugins/jquery-sparkline/jquery.sparkline.js"></script>

                    <!-- Custom Js -->
                    <script src="js/admin.js"></script>
                    <script src="js/pages/index.js"></script>

                    <!-- Demo Js -->
                    <script src="js/demo.js"></script>
                    </body>

                    </html>

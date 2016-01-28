<%-- 
    Document   : index
    Created on : Jan 8, 2016, 2:49:41 PM
    Author     : luqman.sahidin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entry Tamu</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
    </head>
    <body>
        <div class="container">
            <h1>Data Tamu Masuk</h1>
            <form method="post" action="<%= request.getContextPath()%>/processtamuservlet">
                <div class="form-group">
                    <table border="0" style="width: 100%">
                        <thead>
                            <tr>
                                <th style="width: 60%">
                                    <label>No KTP/SIM:</label>
                                    <input type="text" class="form-control" name="NID" value="" placeholder="Nomor KTP / SIM" required="true" />
                                </th>
                                <th style="width: 5%">
                                </th>
                                <th style="width: 35%">
                                        <div class="form-group has-success has-feedback">
                                            <label class="control-label" for="inputGroupSuccess3">Email:</label>
                                            <div class="input-group">
                                                <span class="input-group-addon">@</span>
                                                <input type="text" class="form-control" id="inputGroupSuccess3" aria-describedby="inputGroupSuccess3Status" required="true">
                                            </div>
                                            <span class="glyphicon glyphicon-ok form-control-feedback" aria-hidden="true"></span>
                                            <!--span id="inputGroupSuccess3Status" class="sr-only">(success)</span-->
                                        </div>
                                </th>
                            </tr>
                        </thead>
                        <tbody>
                        </tbody>
                    </table>
                </div>
                <div class="form-group">
                    <label>Tanggal:</label>
                    <input class="form-control date" name="Tanggal" value="" placeholder="Tanggal masuk" required="true"  />
                </div>
                <div class="form-group">
                    <label>Nama Lengkap:</label>
                    <input type="text" class="form-control" name="Nama" value="" placeholder="Nama lengkap tamu" required="true" />
                </div>
                <div class="form-group">
                    <label>Alamat:</label>
                    <input type="text" class="form-control" name="Alamat" value="" placeholder="Alamat rumah / kantor tamu" />
                </div>
                <div class="form-group">
                    <label>Keperluan:</label>
                    <input type="text" class="form-control" name="Keperluan" value="" placeholder="Tuliskan keperluan" />
                </div>
                <div  class="form-group">
                    <input type="submit" value="Simpan" class="btn btn-primary" />
                </div>
            </form>
        </div>
    </body>
</html>
<script>
    $("input.date").datepicker({dateFormat: "dd/mm/yy"});
</script>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
input[type=submit] {
font-family: Trebuchet MS;
 background-color: white; 
  color: black; 
  border: 2px solid #f44336;
text-decoration: none;
color: black;
padding: 10px 60px;
margin: 20px 20px;
cursor: pointer;
}
input[type=submit]:hover {
background-color: #f44336;
  color: white;
}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
<form action="changePassword">
        <br>
        <div style="width: 50%">
          <input type="password" class="form-control" name="newPswd" id="psw" placeholder="Enter new password">
        </div>
      <br>
        <div style="width: 50%">
          <input type="password" class="form-control" name="password" id="cpsw" placeholder="Confirm new password">
        </div>
        <br><br>
        <div style="width: 50%">
        <input type="submit" class="btn btn-primary btn-block" onclick="checkPassword()">
        </div>
      </form>
      <hr>
      </center>
    </div>
   
</body>
</html>

<script type="text/javascript">
  function checkpassword(){
    if ($('#psw').val() != $('#cpsw').val()){
      return false;
    }
  }
</script>
<script type="text/javascript">
  function checkpswdempty(){
    if($('#psw').val() == ''){
      return false;
    }
  }
</script>
<script type="text/javascript">
   function checkcnfpswdempty(){
    if($('#cpsw').val() == ''){
      return false;
    }
  }
</script>
<script type="text/javascript">
  function checkPassword(){
    var val = checkpswdempty();
  if (val == false) {alert('Password field cannot be empty');
    return false;
  }
  val = checkcnfpswdempty();
  if (val == false) {alert('Confirm Password field cannot be empty');
    return false;
  }
  val = checkpassword();
    if(val == false){alert('Passwords do not match');
      return false;
  }
  else{
    return true;
  }
}
</script>
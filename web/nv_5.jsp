<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#section {
	background-color:black;
	margin-top:70px;
	width: 200px;
	float: right;
	padding: 50px;
}
</style>
</head>
<body>
<form action="/Pizzatarian_login/cart">
 <input type="hidden" name="id" value="5">
 <div id="section">
 <font color="white">VEGETARIANA<br>
  Tomato sauce, mozzarella and a various vegetable!
  <br>
  <br>
  <pre>Size: 	M	  S
Price:	500	  350</pre></font></div>
 <img src="img/seventh heaven nv.jpg" alt="chicken mexicana" height="298" width="427">  <p><strong>Size:  </strong><label for="typ"></label> <label for="typ"></label><select name="typ" required id="typ"><option ></option>
       <option value="M">Medium</option>
       <option value="S">Small</option> </select></p>
       Quantiy:<input type="text" align="right"  name="qty" required id="qty">
 <input type="submit" name="add" value="Add">
 </form>
</body>
</html>
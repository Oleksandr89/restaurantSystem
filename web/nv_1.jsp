<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title></title>
    <style>
        #section {
            background-color: black;
            margin-top: 70px;
            width: 200px;
            float: right;
            padding: 50px;
        }
    </style>
</head>
<body>
<form action="/Pizzatarian_login/cart">
    <input type="hidden" name="id" value="1">
    <div id="section">
        <font color="white">MARGHERITA <br>
            Tomato sauce, mozzarella, and oregano!
            <br>
            <br><pre>Size: 	M	  S
Price:	370	  200</pre></font></div>
    <img src="img/chef's chicken choice.jpg" alt="chef's chicken choice" height="298" width="427">
    <p><strong>Size: </strong><label for="typ"></label> <label for="typ"></label><select name="typ" required id="typ">
        <option></option>
        <option value="M">Medium</option>
        <option value="S">Small</option>
    </select></p>
    Quantity:<input type="text" align="right" name="qty" required id="qty">
    <input type="submit" name="add" value="Add">


</form>
</body>
</html>
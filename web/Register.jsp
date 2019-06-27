<%@  page import="project.*" %>
<%@ page import="project.models.AddDelights" %>
<%@ page import="project.models.Login" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Restaurant registration</title>
</head>
<body>

<%

    Login ob = new Login();
    AddDelights ob1 = new AddDelights();
    String fn = request.getParameter("FN");
    String ln = request.getParameter("LN");
    String cty = request.getParameter("CTY");
    String st = request.getParameter("ST");
    String m_no = request.getParameter("M_NO");
    String e_id = request.getParameter("E_ID");
    String pw = request.getParameter("PW");
    String id = ob1.generateRandomString();
    int id1 = Integer.parseInt(id);
    ob.connect();


    boolean result = ob.insert(id1, fn, ln, st, cty, m_no, e_id, pw);
    if (result)
        System.out.println("Regeistered Successfully");
    else
        System.out.println("Error.. Try Again...");
%>

</body>
</html>
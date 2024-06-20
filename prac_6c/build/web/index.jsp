<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.lang.NullPointerException"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="myEJB.ShoppingCart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!

private static ShoppingCart
cart,books;

public void jspInit()
{
try {
        InitialContext ic = new InitialContext();
        cart = (ShoppingCart) ic.lookup("java:global/ShopCart/ShoppingCart");
    } catch (Exception e){System.out.println(e);}
}%>
<%
    
    if (request.getParameter("custname")!= null) 
    {
        cart.initialize(request.getParameter("custname")); 
    }
    else
    {
        cart.initialize("Guest");
    }
  if (request.getParameter("chkbutton")!=null) 
  {
    String books[] = request.getParameterValues("chkBook");
   
if (books!=null) 
{
for (int i = 0; i<books.length; i++) 
    {
        cart.addBook(books[i]);
    }}}
  if (request.getParameter("btnaddBook")!=null) 
     {
            String book[] = request.getParameterValues("chkBook");
      }
  
%>
<html>
    <head>
        <meta http="Content-Type" content="text/html;charset=UTF-8">
      <title>shopping</title>
    </head>
    <body>
        <form method="post">
            Customer Name : <input type="text" name="custName" value="<%=request.getParameter("custName")%>"><br>
            <b>Book Title</b></br>
            <input type="checkbox" name="chkBook" value="Struck 2.0 for Beginners">Struck 2.0 for Beginners
            <input type="checkbox" name="chkBook" value="Oracle book">Oracle book
            <input type="checkbox" name="chkBook" value="Java EJB for Beginner">Java EJB for Beginner
            <input type="submit" value="ADD to my Basket" name="btnaddBook">
            <input type="submit" value="Remove" name="btnRmvBook">
            <%
                if (cart!=null) 
            {
                   out.println("<b>Basket</b>"); 
                   List<String> booklist = cart.getcontent();
                   Iterator iterator = booklist.iterator();
                   while (iterator.hasNext()) 
                   {                           
                       String title = (String)iterator.next();
                       }
                }
            %>
            </form>
        
    </body>
</html>

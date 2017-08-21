<%
   // Create cookies for first and last names.      
   Cookie firstName = new Cookie("first_name1", request.getParameter("first_name"));
   Cookie lastName = new Cookie("last_name1", request.getParameter("last_name"));
   
   // Set expiry date after 24 Hrs for both the cookies.
   firstName.setMaxAge(60*60*24); 
   lastName.setMaxAge(60*60*24); 
   
   // Add both the cookies in the response header.
   response.addCookie( firstName );
   response.addCookie( lastName );
%>

<html>
   <head>
      <title>Setting Cookies</title>
   </head>
   
   <body>
      <center>
         <h1>Setting Cookies</h1>
      </center>
      <ul>
         <li><p><b>First Name:</b>
            <%= request.getParameter("first_name")%>
         </p></li>
         <li><p><b>Last  Name:</b>
            <%= request.getParameter("last_name")%>
         </p></li>
      </ul>

      <center>
         <h1>Reading Cookies</h1>
      </center>
      <%
         Cookie cookie = null;
         Cookie[] cookies = null;
         
         // Get an array of Cookies associated with the this domain
         cookies = request.getCookies();
         
         if( cookies != null ) {
            out.println("<h2> Found Cookies Name and Value</h2>");
            
            for (int i = 0; i < cookies.length; i++) {
               cookie = cookies[i];
               out.print("Name : " + cookie.getName( ) + ",  ");
               out.print("Value: " + cookie.getValue( )+" <br/>");
            }
         } else {
            out.println("<h2>No cookies founds</h2>");
         }
      %>
   </body>
</html>
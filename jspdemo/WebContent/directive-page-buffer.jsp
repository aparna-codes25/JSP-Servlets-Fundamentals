	<%@page buffer="1kb"%>
	<%
	for(int i = 0;i<8000;i++){
		out.println((i+1)+"Hello World! <br/>");
		
		if(i+1 == 46) throw new RuntimeException("boom!");
		// 47 line ~ 1.2 kb
		// less than 47 lines - error page
		// more than 47 lines - partial HTML output
	}
	
	/* out.println("Before Flush. <br/>");
	out.flush();
	out.println("After Flush. <br/>"); */
	%>
	
	<%-- If output < buffer - full error page,
	If output > buffer - partial HTML page --%>
	
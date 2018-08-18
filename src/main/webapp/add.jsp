<jsp:useBean id="firstque" scope="page" class="com.nissan.firstque.firstque"/>
<%	
	String first_num = request.getParameter("t1");
	String second_num = request.getParameter("t2");
	
	String result =firstque.function_name(first_num,second_num);	
	
	out.print(result);
	
	//try{
//		Integer.parseInt(first_num);	
	//}
	//catch (NumberFormatException e){
		//System.out.println("First Number Format Exception");
	//}
	//try{
		//Float.parseFloat(first_num);
	//}
	//catch (NumberFormatException e){
		//System.out.println("First Number Format Exception");	
	//}
	//try{
		//Integer.parseInt(second_num);
	//}
	//catch (NumberFormatException e){
		//System.out.println("Second Number Format Exception");
	//}
		//try{
			//Float.parseFloat(second_num);
		//}
		//catch (NumberFormatException e){
			//System.out.println("Second Number Format Exception");
	//}
	
%>
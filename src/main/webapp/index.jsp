<html>
<body>
<h2>Enter the two numbers:</h2>
<script>
	function check()
	{
	  var x=document.forms["form"]["t1"].value;
	  var y=document.forms["form"]["t2"].value;
	  if (isNaN(x) || isNaN(y) || x=='' || y=='') 
	  {
	    alert("Please enter valid number....");
	    return false;
	  }
	}
</script>
<body>
        <form name="form" action="./add.jsp" onsubmit="return check()">
            <input type="text" name="t1"/>
            + <input type="text" name="t2"/>       <input type="submit" value="ADD"/>
        </form>
        
</body>

</body>
</html>

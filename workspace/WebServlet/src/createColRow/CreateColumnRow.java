package createColRow;

public class CreateColumnRow {
	 public static String createTable(int length){
		  
		    String start ="<table>";
		    String content= "";
		    String end ="</table>";
		    
		    //create column and row
		    for(int b =1; b <11; b++){
		      content+="<tr>";
		        for(int i =1; i <11; i++){
		        content+="<td class=\"cell\">("+b+","+i+")</td>";
		        }
		      content+="</tr>";
		    }
		    
		    return start+content+end;
}
}
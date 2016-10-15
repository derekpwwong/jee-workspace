package servletGenerateMagicSquare;

public class ServletGenerateMagicSquare {
	public static String returnMagicSquare(int size){
		//size
		int n = size;
        String content="";
		//define magic square size
        int[][] magic = new int[n][n];

        int row = n-1;
        int col = n/2;
        magic[row][col] = 1;

        for (int i = 2; i <= n*n; i++) {
            if (magic[(row + 1) % n][(col + 1) % n] == 0) {
                row = (row + 1) % n;
                col = (col + 1) % n;
            }
            else {
                row = (row - 1 + n) % n;
                // don't change column
            }
            magic[row][col] = i;
        }

        // print results
        for (int i = 0; i < n; i++) {
        	content+= "<tr>";
            for (int j = 0; j < n; j++) {
                //if (magic[i][j] < 10)  content+=" ";  // for alignment
                //if (magic[i][j] < 100) content=" ";  // for alignment
                //System.out.print(magic[i][j] + " ");
            	content+="<td class=\"cell\">"+magic[i][j]+"</td>";
            }
            //new line
            //System.out.println();
            content+= "</tr>";
        }
		return content;
	}
}
package rec.server.dizi;

public class DiziDeneme {
	
	public String[] dizi(int[] i){
		String[] s = new String[i.length];
		
		for(int k=0; k < i.length;k++){
			
			s[k]=String.valueOf(i[k]);
		}
		
		return s;
	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Belen Desta
 *
 */
public class MorseCodeConverter {
	private static MorseCodeTree tree= new MorseCodeTree();
	
	public static String convertToEnglish(String code) {
		tree.buildTree();
		String output="";
		String[] word;
		String[] letters;
		word= code.split("/");
		for(int i=0; i<word.length; i++){
			letters= word[i].trim().split(" ");
			for(int j=0; j<letters.length;j++) {
				output +=tree.fetch(letters[j].trim());
			}
			output +=" ";
		}
		output=output.trim();
		return output;
	}
  public static String printTree() {
	  ArrayList<String> list= new ArrayList<>();
	  list= tree.toArrayList();
	  String output = "";
	  for(int i=0; i<list.size(); i++) { 
		  output += list.get(i) !=null? list.get(i)+ " ":" ";
	  }
	  return output.trim();
	  
  }
	public static String convertToEnglish(File codefile) throws FileNotFoundException {
		String output="";
		ArrayList<String> list= new ArrayList<>();
		String[] word;
		String[] letters;
		Scanner fil= new Scanner(codefile);
		while(fil.hasNext()) {
			list.add(fil.nextLine());
		}
		fil.close();
		for(int i=0; i<list.size(); i++) {
			word= list.get(i).split(" / ");
			for(int j=0; j<word.length; j++) {
				letters= word[j].split(" ");
			
			for( int k=0; k< letters.length; k++) {
				output +=tree.fetch(letters[k]);
			}
			output += " ";
		}
     }
	
	output= output.trim();
	return output;
  }
  
}

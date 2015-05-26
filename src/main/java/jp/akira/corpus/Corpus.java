package jp.akira.corpus;
import org.kohsuke.args4j.*;
import java.io.*;
import java.util.*;

public class Corpus {
    @Option(name="--input")
	private String input_file_name;
    @Option(name="--validate")
	private boolean validate;
    @Option(name="--display_invalid_only")
	private boolean display_invalid_only;

    private ArrayList<String> data = new ArrayList<String>();
    
    public static void main(String[] args){
	Corpus app = new Corpus();
	CmdLineParser parser = new CmdLineParser(app);
	try{
	    parser.parseArgument(args);
	}catch(CmdLineException e){
	    e.printStackTrace();
	    System.exit(-1);
	}
	app.processMain();
	
    }
    private void processMain(){
	data = readFromFile(input_file_name);
	if(validate){
	    validate(data);
	}
    }
    private ArrayList<String> readFromFile(String file_name){
	ArrayList<String> data = new ArrayList<String>();
	try{
	    File file = new File(file_name);
	    BufferedReader reader = new BufferedReader(new FileReader(file));
	    String line = "";
	    while((line = reader.readLine()) != null){
		if(!isBlank(line)){
		    data.add(line);
		}
	    }
	}catch(FileNotFoundException e){
	    e.printStackTrace();
	}catch(IOException e){
	    e.printStackTrace();
	}
	return data;
    }

    private void printData(ArrayList<String> s){
	for(int i = 0; i<s.size(); i++){
	    System.out.println(s.get(i));
	}
    }

    private boolean isBlank(String s){
	s = s.replaceAll(" ","");
	if(s.isEmpty()){
	    return true;
	}
	return false;
    }

    private void validate(ArrayList<String> data){
	for(int i=0;i<data.size();i++){
	    readChars(data.get(i));
	}
    }

    private void readChars(String s){
	CyrillicChars cyrillic = new CyrillicChars();
	int length = s.length();
	char[] chars = new char[length];
	for(int i=0;i<length;i++){
	    chars[i] = s.charAt(i);
	}
	for(int i=0;i<length;i++){
	    if(display_invalid_only){
		if(!cyrillic.isAcceptable(chars[i])){
		    System.out.print("\033[0m" + chars[i]);
		}
	    }else{
		if(cyrillic.isAcceptable(chars[i])){
		    System.out.print("\033[0m" + chars[i]);
		}else{
		    System.err.print("\033[31m" + chars[i]);
		}
	    }
	}
	System.out.print("\033[0m\n");
    }
}

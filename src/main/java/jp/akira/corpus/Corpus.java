package jp.akira.corpus;
import org.kohsuke.args4j.*;
import java.io.*;

public class Corpus {
    @Option(name="--input")
	private String input_file_name;
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
	try{
	    File file = new File(input_file_name);
	    BufferedReader reader = new BufferedReader(new FileReader(file));
	    String line = "";
	    while((line = reader.readLine()) != null){
		System.out.println(line);
		readChars(line);
	    }
	}catch(FileNotFoundException e){
	    e.printStackTrace();
	}catch(IOException e){
	    e.printStackTrace();
	}
	// CyrillicBigA A = new CyrillicBigA();
	// System.out.println(A);
	// CyrillicSmallA a = new CyrillicSmallA();
	// System.out.println(a);
	// CyrillicBigB B = new CyrillicBigB();
	// System.out.println(B);
	// CyrillicSmallB b = new CyrillicSmallB();
	// System.out.println(b);
    }

    private void readChars(String s){
	int length = s.length();
	char[] chars = new char[length];
	for(int i=0;i<length;i++){
	    chars[i] = s.charAt(i);
	}
	System.out.println(Character.codePointAt(chars,0,length));
    }
}

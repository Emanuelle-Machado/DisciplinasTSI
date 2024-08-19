package decorator;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader extends Reader {

	private BufferedReader bufferedReader = null;
	
	public CSVReader(Reader reader) {
		super(reader);
		
		if(reader instanceof BufferedReader) 
			this.bufferedReader = (BufferedReader) reader;
		else 
			this.bufferedReader = new BufferedReader(reader);
		
	}
	
	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		return 0;
	}

	@Override
	public void close() throws IOException {
		this.bufferedReader.close();
	}
	
	public String readLine() throws IOException {
		return bufferedReader.readLine();
	}

	public List<String> readLines() throws IOException {
		List<String> lines = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        return lines;
	}


}

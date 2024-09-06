

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

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
		bufferedReader.read(cbuf, off, len);
		return 0;
	}
	@Override
	public void close() throws IOException {
		this.bufferedReader.close();
	}
	
	public String readLine() throws IOException {
		return bufferedReader.readLine();
	}

}

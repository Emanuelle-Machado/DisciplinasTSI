import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;



class CSVReaderTest {

	@TempDir
	static File tempDirPath;
	
	@BeforeAll
	static void shouldExisteTemporaryDirectory() {
		assertTrue(tempDirPath.isDirectory(), "Should be a directory ");
	}
	
	@Test
	void test() {
		assertTrue(true);
	}
	
	@Test
	void shouldWriteSeparatorToFile() {
		
		assertDoesNotThrow( () -> {
			
			File csvFile = new File(tempDirPath, "csvTest.csv");
			FileWriter csvWriter = new FileWriter(csvFile);
			csvWriter.write(Separator.PIPE.asChar());
			
			csvWriter.close();
			
			char expected = Separator.PIPE.asChar();
			FileReader fileReader = new FileReader(csvFile);
			char actual = (char) fileReader.read();
			fileReader.close();
			
			assertEquals(expected, actual);
		});
	}

}

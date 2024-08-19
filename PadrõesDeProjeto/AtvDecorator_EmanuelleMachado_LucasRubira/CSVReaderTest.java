package decorator;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class CSVReaderTest {
	@TempDir
	static File tempDirPath;

	File csvFile;
	CSVReader csvReader;

	@BeforeAll
	static void shouldExistTemporaryDirectory() {
		assertTrue(tempDirPath.isDirectory(), "Should be a directory");
	}

	@BeforeEach
	public void createCSVFile() {
		assertDoesNotThrow(() -> {
			csvFile = new File(tempDirPath, "csvTest.csv");
		});
	}

	@AfterEach
	public void closeCSVReaderAndDeleteTheFile() {
		assertDoesNotThrow(() -> {
			csvReader.close();
			csvFile.delete();
		});
	}

	@Test
	void shouldReadLine() {
		assertDoesNotThrow(() -> {
			writeFileContent(csvFile, new String[] { "Ameixa" });
			csvReader = new CSVReader(new FileReader(csvFile));
			String line = csvReader.readLine();
			String expectedLine = "Ameixa";
			assertNotNull(line);
			assertEquals(expectedLine, line);
		});
	}

	@Test
	void shouldReadLines() {
		assertDoesNotThrow(() -> {
			String[] tokens = { "Ameixa", "Morango;Banana;Maçã-Gala;Batata-Doce;Pera;Uva",
					"Ameixa;Banana;Maçã-Gala;Batata-Doce;Pera;Uva",
					"Ameixa;Banana;Maçã-Gala;Batata-Doce;Melancia;Uva" };
			writeFileContent(csvFile, tokens);
			csvReader = new CSVReader(new FileReader(csvFile));
			List<String> lines = csvReader.readLines();

			assertNotNull(lines);
			assertEquals(tokens.length, lines.size());

			for (int i = 0; i < tokens.length; i++) {
				assertEquals(tokens[i], lines.get(i));
			}
		});
	}

	private void writeFileContent(File file, String[] token) {
		assertDoesNotThrow(() -> {
			try (FileWriter writer = new FileWriter(file)) {
				for (String line : token) {
					writer.append(line).append("\n");
				}
			}
		});
	}
}

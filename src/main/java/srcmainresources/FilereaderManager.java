package srcmainresources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class FilereaderManager {
	
	public static Properties property;
	public static FileInputStream fileinputstream;
	
	public static void setupProperty() throws IOException {
		if (property == null) {
			File file = new File(
					"C:\\Users\\VASANTH\\eclipse-workspace\\TestNG\\src\\main\\java\\srcmainresources\\TestNG.properties");
			try {
				fileinputstream = new FileInputStream(file);
				property = new Properties();
				property.load(fileinputstream);
			} catch (FileNotFoundException e) {
				Assert.fail("ERROR: FILENOTFOUND EXCEPTION OCCUR DURING THE PROPERTY FILE LOADING");
			} catch (Exception e) {
				Assert.fail("ERROR: FILENOTFOUND EXCEPTION OCCUR DURING THE PROPERTY FILE READING");
			}
		}
	}

	public static String getDataproperty(String datavalue) throws IOException {
		setupProperty();
		String browserName=property.getProperty(datavalue);
		return browserName;

	}

}

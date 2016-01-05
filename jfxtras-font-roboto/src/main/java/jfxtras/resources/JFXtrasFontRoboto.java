package jfxtras.resources;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class JFXtrasFontRoboto {
	
	/**
	 * Load all available fonts
	 */
	public static void loadAll() {
	    for (AvailableFonts f : AvailableFonts.values()) {
	    	load(f);
	    }
	}
	
	/**
	 * Load a single font (if not already loaded)
	 * @param font
	 */
	synchronized public static void load(AvailableFonts font) {
		if (!loadedFonts.contains(font)) {
			javafx.scene.text.Font.loadFont(JFXtrasFontRoboto.class.getResource("/" + font.getFilename()).toExternalForm(), 12);
			loadedFonts.add(font);
		}
	}
	static private final Set<AvailableFonts> loadedFonts = Collections.synchronizedSet(new HashSet<>()); 
	
	public enum AvailableFonts {
		RobotoItalic("Roboto Italic", "Roboto-Italic.ttf"),
		RobotoRegular("Roboto Regular", "Roboto-Regular.ttf"),
		RobotoBlack("Roboto Black", "Roboto-Black.ttf"),
		RobotoBlackItalic("Roboto Black Italic", "Roboto-BlackItalic.ttf"),
		RobotoBold("Roboto Bold", "Roboto-Bold.ttf"),
		RobotoBoldItalic("Roboto Bold Italic", "Roboto-BoldItalic.ttf"),
		RobotoLight("Roboto Light", "Roboto-Light.ttf"),
		RobotoLightItalic("Roboto Light Italic", "Roboto-LightItalic.ttf"),
		RobotoMedium("Roboto Medium", "Roboto-Medium.ttf"),
		RobotoMediumItalic("Roboto Medium Italic", "Roboto-MediumItalic.ttf"),
		RobotoThin("Roboto Thin", "Roboto-Thin.ttf"),
		RobotoThinItalic("Roboto Thin Italic", "Roboto-ThinItalic.ttf"),
		RobotoCondensedBold("Roboto Condensed Bold", "RobotoCondensed-Bold.ttf"),
		RobotoCondensedBoldItalic("Roboto Condensed Bold Italic", "RobotoCondensed-BoldItalic.ttf"),
		RobotoCondensedItalic("Roboto Condensed Italic", "RobotoCondensed-Italic.ttf"),
		RobotoCondensedLight("Roboto Condensed Light", "RobotoCondensed-Light.ttf"),
		RobotoCondensedLightItalic("Roboto Condensed Light Italic", "RobotoCondensed-LightItalic.ttf"),
		RobotoCondensedRegular("Roboto Condensed Regular", "RobotoCondensed-Regular.ttf")
		;
		
		AvailableFonts(String fontname, String filename) {
			this.fontname = fontname;
			this.filename = filename;
		}
		final private String fontname;
		final private String filename;
		
		public String getFontname() {
			return this.fontname;
		}
		String getFilename() {
			return this.filename;
		}
	}
}
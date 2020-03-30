package at.jojokobi.donatengine.libgdx;

import at.jojokobi.donatengine.platform.FontSystem;
import at.jojokobi.donatengine.platform.IGamePlatform;

public class LibGDXPlatform implements IGamePlatform {
	
	private LibGDXFontSystem fontSystem = new LibGDXFontSystem();

	@Override
	public FontSystem getFontSystem() {
		return fontSystem;
	}
	
}

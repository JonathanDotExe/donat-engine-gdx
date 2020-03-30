package at.jojokobi.donatengine.libgdx;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;

import at.jojokobi.donatengine.platform.FontSystem;
import at.jojokobi.donatengine.style.Font;
import at.jojokobi.donatengine.util.Vector2D;

public class LibGDXFontSystem implements FontSystem {
	
	private GlyphLayout layout = new GlyphLayout();

	@Override
	public Vector2D calculateTextDimensions(String text, Font font) {
		layout.setText(toGDXFont(font), text);
		return new Vector2D(layout.width, layout.height);
	}
	
	public static BitmapFont toGDXFont (Font font) {
		return new BitmapFont();
	}

}

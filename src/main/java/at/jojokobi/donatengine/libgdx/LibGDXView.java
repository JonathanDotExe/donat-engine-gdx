package at.jojokobi.donatengine.libgdx;

import java.util.List;

import at.jojokobi.donatengine.objects.Camera;
import at.jojokobi.donatengine.rendering.CameraHandler;
import at.jojokobi.donatengine.rendering.GameView;
import at.jojokobi.donatengine.rendering.RenderData;
import at.jojokobi.donatengine.tiles.TileSystem;
import at.jojokobi.donatengine.util.Vector2D;

public class LibGDXView implements GameView {
	
	private String title = "";

	@Override
	public void bind(TileSystem tileSystem) {
		
	}

	@Override
	public void render(List<RenderData> data, TileSystem tileSystem, Camera cam) {
		
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public Vector2D getSize() {
		return null;
	}

	@Override
	public void setSize(Vector2D size) {
		
	}

	@Override
	public CameraHandler getCameraHandler() {
		return null;
	}

}

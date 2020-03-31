package at.jojokobi.donatengine.libgdx.renderering;

import java.util.List;

import at.jojokobi.donatengine.objects.Camera;
import at.jojokobi.donatengine.rendering.RenderData;
import at.jojokobi.donatengine.tiles.TileSystem;

public interface Renderer {
	
	public void init ();
	
	public void bind (TileSystem tileSystem);
	
	public void render (List<RenderData> data, TileSystem tileSystem, Camera cam);
	
	public void dispose ();

}

package at.jojokobi.donatengine.libgdx.renderering;

import java.util.List;

import at.jojokobi.donatengine.objects.Camera;
import at.jojokobi.donatengine.rendering.RenderData;
import at.jojokobi.donatengine.tiles.Tile;
import at.jojokobi.donatengine.tiles.TileSystem;

public interface RendererDelegate  {
	
	public void init ();
	
	public void onPlace(Tile tile, int tileX, int tileY, int tileZ, String area, TileSystem system);
	
	public void onRemove (int tileX, int tileY, int tileZ, String area, TileSystem system);
	
	public void update (TileSystem system);
	
	public void render (List<RenderData> data, TileSystem tileSystem, Camera cam);
	
	public void dispose();

}

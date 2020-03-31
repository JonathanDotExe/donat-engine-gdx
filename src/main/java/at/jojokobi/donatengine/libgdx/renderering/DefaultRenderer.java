package at.jojokobi.donatengine.libgdx.renderering;

import java.util.List;

import at.jojokobi.donatengine.objects.Camera;
import at.jojokobi.donatengine.rendering.RenderData;
import at.jojokobi.donatengine.tiles.Tile;
import at.jojokobi.donatengine.tiles.TileSystem;

public class DefaultRenderer implements Renderer {
	
	private RendererDelegate perspective;
	private TileSystem.Listener listener;
	private TileSystem tileSystem;
	
	@Override
	public void bind(TileSystem tileSystem) {
		if (this.tileSystem != null) {
			this.tileSystem.removeListener(listener);
		}
		tileSystem.addListener(listener = new TileSystem.Listener() {
			@Override
			public void onRemove(int tileX, int tileY, int tileZ, String area) {
				perspective.onRemove(tileX, tileY, tileZ, area, tileSystem);
			}
			
			@Override
			public void onPlace(Tile tile, int tileX, int tileY, int tileZ, String area) {
				perspective.onPlace(tile, tileX, tileY, tileZ, area, tileSystem);
			}
		});
	}

	@Override
	public void render(List<RenderData> data, TileSystem tileSystem, Camera cam) {
		RendererDelegate newPerspective = getPerspective(cam);
		if (!newPerspective.equals(perspective)) {
			perspective = newPerspective;
			perspective.update(tileSystem);
		}
		perspective.render(data, tileSystem, cam);
	}
	
	private RendererDelegate getPerspective (Camera cam) {
		//TODO Implement
		return null;
	}

	@Override
	public void init() {
		
	}

	@Override
	public void dispose() {
		
	}

}

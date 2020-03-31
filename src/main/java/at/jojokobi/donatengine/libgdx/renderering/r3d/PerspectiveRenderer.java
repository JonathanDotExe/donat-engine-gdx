package at.jojokobi.donatengine.libgdx.renderering.r3d;

import java.util.List;

import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.utils.ObjectMap;

import at.jojokobi.donatengine.libgdx.renderering.RendererDelegate;
import at.jojokobi.donatengine.objects.Camera;
import at.jojokobi.donatengine.rendering.RenderData;
import at.jojokobi.donatengine.tiles.Tile;
import at.jojokobi.donatengine.tiles.TileSystem;

public class PerspectiveRenderer implements RendererDelegate{
	
	private ModelBatch modelBatch;
	private PerspectiveCamera persCam;

	private ObjectMap<Class<? extends RenderData>, DataRenderer<?>> map = new ObjectMap<Class<? extends RenderData>, DataRenderer<?>>();
	
	@Override
	public void onPlace(Tile tile, int tileX, int tileY, int tileZ, String area, TileSystem system) {
		
	}

	@Override
	public void onRemove(int tileX, int tileY, int tileZ, String area, TileSystem system) {
		
	}

	@Override
	public void update(TileSystem system) {
		
	}

	@Override
	public void render(List<RenderData> data, TileSystem tileSystem, Camera cam) {
		update(cam);
		for (RenderData renderData : data) {
			DataRenderer<?> renderer = getRenderer(renderData.getClass());
			renderer.renderUnsafe(renderData, persCam, modelBatch);
		}
	}
	
	private DataRenderer<?> getRenderer (Class<? extends RenderData> clazz) {
		return map.get(clazz);
	}
	
	private void update (Camera cam) {
		persCam.fieldOfView = (float) cam.getFov();
		persCam.near = (float) cam.getNearClip();
		persCam.far = (float) cam.getFarClip();
		persCam.direction.x = (float) cam.getRotationX();
		persCam.direction.y = (float) cam.getRotationX();
		persCam.direction.z = (float) cam.getRotationX();
		persCam.update();
	}

	@Override
	public void init() {
		modelBatch = new ModelBatch();
		persCam = new PerspectiveCamera();
	}

	@Override
	public void dispose() {
		modelBatch.dispose();
	}

}

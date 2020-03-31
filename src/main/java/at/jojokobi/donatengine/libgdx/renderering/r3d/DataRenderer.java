package at.jojokobi.donatengine.libgdx.renderering.r3d;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.g3d.ModelBatch;

import at.jojokobi.donatengine.rendering.RenderData;

public interface DataRenderer<T extends RenderData> {
	
	public void render (T data, Camera cam, ModelBatch batch);
	
	public Class<T> getDataClass ();
	
	public default void renderUnsafe (RenderData data, Camera cam, ModelBatch batch) {
		render(getDataClass().cast(data), cam, batch);
	}
	
}

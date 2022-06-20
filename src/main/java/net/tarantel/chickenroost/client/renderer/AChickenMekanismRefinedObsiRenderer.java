
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenMekanismRefinedObsiEntity;
import net.tarantel.chickenroost.client.model.Modelchicken;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class AChickenMekanismRefinedObsiRenderer
		extends
			MobRenderer<AChickenMekanismRefinedObsiEntity, Modelchicken<AChickenMekanismRefinedObsiEntity>> {
	public AChickenMekanismRefinedObsiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchicken(context.bakeLayer(Modelchicken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenMekanismRefinedObsiEntity entity) {
		return new ResourceLocation("chicken_roost:textures/obsidianchicken.png");
	}
}

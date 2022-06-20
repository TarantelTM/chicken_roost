
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenMekanismSteelEntity;
import net.tarantel.chickenroost.client.model.Modelchicken;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class AChickenMekanismSteelRenderer extends MobRenderer<AChickenMekanismSteelEntity, Modelchicken<AChickenMekanismSteelEntity>> {
	public AChickenMekanismSteelRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchicken(context.bakeLayer(Modelchicken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenMekanismSteelEntity entity) {
		return new ResourceLocation("chicken_roost:textures/steel_chicken.png");
	}
}

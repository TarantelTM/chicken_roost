
package net.tarantel.chickenroost.client.renderer;

import net.tarantel.chickenroost.entity.AChickenMekanismLeadEntity;
import net.tarantel.chickenroost.client.model.Modelchicken;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class AChickenMekanismLeadRenderer extends MobRenderer<AChickenMekanismLeadEntity, Modelchicken<AChickenMekanismLeadEntity>> {
	public AChickenMekanismLeadRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelchicken(context.bakeLayer(Modelchicken.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AChickenMekanismLeadEntity entity) {
		return new ResourceLocation("chicken_roost:textures/lead_chicken.png");
	}
}

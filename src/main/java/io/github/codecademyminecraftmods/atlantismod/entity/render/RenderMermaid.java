package io.github.codecademyminecraftmods.atlantismod.entity.render;

import io.github.codecademyminecraftmods.atlantismod.entity.base.EntityMermaid;
import io.github.codecademyminecraftmods.atlantismod.entity.model.ModelMermaid;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderMermaid extends RenderLiving {

	protected ModelMermaid model;
	
	public RenderMermaid(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		this.model = (ModelMermaid)this.mainModel;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("atlantismod:textures/entity/Mermaid.png");
	}

	public void renderMermaid(EntityMermaid entity, double par2, double par4, double par6, float par8, float par9) {
        super.doRender(entity, par2, par4, par6, par8, par9);
    }

	public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
        renderMermaid((EntityMermaid)par1EntityLiving, par2, par4, par6, par8, par9);
    }

	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
        renderMermaid((EntityMermaid)par1Entity, par2, par4, par6, par8, par9);
    }
	
}
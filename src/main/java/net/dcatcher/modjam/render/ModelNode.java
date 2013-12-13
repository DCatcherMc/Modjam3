package net.dcatcher.modjam.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNode extends ModelBase
{
  //fields
    ModelRenderer Base;
    ModelRenderer Podium;
    ModelRenderer Pillar;
    ModelRenderer Cube;
  
  public ModelNode()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(0F, 0F, 0F, 16, 2, 16);
      Base.setRotationPoint(-8F, 22F, -8F);
      Base.setTextureSize(64, 64);
      Base.mirror = true;
      setRotation(Base, 0F, 0F, 0F);
      Podium = new ModelRenderer(this, 0, 18);
      Podium.addBox(0F, 0F, 0F, 14, 1, 14);
      Podium.setRotationPoint(-7F, 21F, -7F);
      Podium.setTextureSize(64, 64);
      Podium.mirror = true;
      setRotation(Podium, 0F, 0F, 0F);
      Pillar = new ModelRenderer(this, 0, 33);
      Pillar.addBox(0F, 0F, 0F, 4, 6, 4);
      Pillar.setRotationPoint(-2F, 15F, -2F);
      Pillar.setTextureSize(64, 64);
      Pillar.mirror = true;
      setRotation(Pillar, 0F, 0F, 0F);
      Cube = new ModelRenderer(this, 0, 43);
      Cube.addBox(0F, 0F, 0F, 4, 4, 4);
      Cube.setRotationPoint(-2F, 9F, -1F);
      Cube.setTextureSize(64, 64);
      Cube.mirror = true;
      setRotation(Cube, 0.7853982F, 0.7853982F, 0.7853982F);
  }
  
  public void render(float f5)
  {
    Base.render(f5);
    Podium.render(f5);
    Pillar.render(f5);
    Cube.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}

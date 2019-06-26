package com.bewitchment.client.render.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Witches_garb_var2 - Ingoleth, cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelWitchesArmorVariantTwo extends ModelBase {
	public ModelRenderer legLeft;
	public ModelRenderer legRight;
	public ModelRenderer Body;
	public ModelRenderer bipedHead;
	public ModelRenderer tunicLeftBack;
	public ModelRenderer tunicLeftFront;
	public ModelRenderer tunicLeft;
	public ModelRenderer tunicLeftBack_1;
	public ModelRenderer tunicFront;
	public ModelRenderer tunicLeft_1;
	public ModelRenderer tunicRightFront;
	public ModelRenderer tunicRightBack;
	public ModelRenderer tunicRight;
	public ModelRenderer tunicRightFront_1;
	public ModelRenderer tunicRightBack_1;
	public ModelRenderer tunicRight_1;
	public ModelRenderer armLeft;
	public ModelRenderer armRight;
	public ModelRenderer shoulderLeft;
	public ModelRenderer sleeveLeft;
	public ModelRenderer shoulderRight;
	public ModelRenderer sleeveRight;
	public ModelRenderer hood01;
	public ModelRenderer hoodFringe01;
	public ModelRenderer hoodFringeL01;
	public ModelRenderer hoodFringeR01;
	public ModelRenderer hoodFringeL02;
	public ModelRenderer hoodFringeR02;
	public ModelRenderer hoodFringeL03;
	public ModelRenderer hoodFringeR03;
	public ModelRenderer hoodShade;
	public ModelRenderer hoodFringeL04;
	public ModelRenderer hoodFringeR04;
	public ModelRenderer hoodPipe01;
	public ModelRenderer hoodPipe02;

	public ModelWitchesArmorVariantTwo() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.sleeveLeft = new ModelRenderer(this, 49, 98);
		this.sleeveLeft.setRotationPoint(1.01F, 10.1F, 2.0F);
		this.sleeveLeft.addBox(-4.0F, -4.0F, 0.0F, 4, 4, 2, 0.0F);
		this.setRotateAngle(sleeveLeft, 0.5235987755982988F, 0.0F, 0.0F);
		this.tunicLeft_1 = new ModelRenderer(this, 23, 77);
		this.tunicLeft_1.setRotationPoint(-0.01F, 10.0F, -1.0F);
		this.tunicLeft_1.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
		this.setRotateAngle(tunicLeft_1, 0.2617993877991494F, 0.0F, 0.0F);
		this.shoulderRight = new ModelRenderer(this, 0, 32);
		this.shoulderRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shoulderRight.addBox(-1.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F);
		this.setRotateAngle(shoulderRight, 0.0F, 0.0F, 0.08726646259971647F);
		this.hoodPipe02 = new ModelRenderer(this, 65, 54);
		this.hoodPipe02.setRotationPoint(0.0F, -0.3F, 3.1F);
		this.hoodPipe02.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 4, 0.0F);
		this.setRotateAngle(hoodPipe02, -0.45378560551852565F, 0.0F, 0.0F);
		this.bipedHead = new ModelRenderer(this, 0, 0);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		this.hoodFringeR03 = new ModelRenderer(this, 97, 33);
		this.hoodFringeR03.mirror = true;
		this.hoodFringeR03.setRotationPoint(-5.15F, -0.7F, 0.1F);
		this.hoodFringeR03.addBox(0.0F, -0.9F, -5.37F, 5, 2, 10, 0.0F);
		this.setRotateAngle(hoodFringeR03, 0.0F, 0.0F, 0.3141592653589793F);
		this.hoodFringeL04 = new ModelRenderer(this, 57, 20);
		this.hoodFringeL04.setRotationPoint(2.7F, -8.4F, 0.1F);
		this.hoodFringeL04.addBox(-3.2F, -1.0F, -5.38F, 4, 2, 11, 0.0F);
		this.setRotateAngle(hoodFringeL04, 0.0F, 0.0F, 0.3141592653589793F);
		this.hoodFringeR02 = new ModelRenderer(this, 97, 19);
		this.hoodFringeR02.mirror = true;
		this.hoodFringeR02.setRotationPoint(-4.85F, -1.2F, 0.1F);
		this.hoodFringeR02.addBox(-1.0F, -0.5F, -5.38F, 1, 2, 10, 0.0F);
		this.setRotateAngle(hoodFringeR02, 0.0F, 0.0F, -0.20943951023931953F);
		this.legRight = new ModelRenderer(this, 0, 16);
		this.legRight.mirror = true;
		this.legRight.setRotationPoint(2.0F, 12.0F, 0.0F);
		this.legRight.addBox(-2.0F, 0.0F, -2.0F, 0, 0, 0, 0.0F);
		this.tunicLeftBack = new ModelRenderer(this, 53, 65);
		this.tunicLeftBack.setRotationPoint(2.01F, 0.0F, 2.1F);
		this.tunicLeftBack.addBox(0.0F, 0.0F, 0.0F, 4, 10, 1, 0.0F);
		this.setRotateAngle(tunicLeftBack, 3.01941960595019F, 0.0F, 3.141592653589793F);
		this.tunicRightBack_1 = new ModelRenderer(this, 53, 77);
		this.tunicRightBack_1.setRotationPoint(-0.01F, 10.0F, -1.0F);
		this.tunicRightBack_1.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
		this.setRotateAngle(tunicRightBack_1, 0.2617993877991494F, 0.0F, 0.0F);
		this.hoodFringeR04 = new ModelRenderer(this, 57, 20);
		this.hoodFringeR04.mirror = true;
		this.hoodFringeR04.setRotationPoint(-2.7F, -8.4F, 0.1F);
		this.hoodFringeR04.addBox(-0.9F, -1.0F, -5.38F, 4, 2, 11, 0.0F);
		this.setRotateAngle(hoodFringeR04, 0.0F, 0.0F, -0.3141592653589793F);
		this.hoodPipe01 = new ModelRenderer(this, 65, 43);
		this.hoodPipe01.setRotationPoint(0.0F, -7.0F, 4.2F);
		this.hoodPipe01.addBox(-3.0F, -2.5F, 0.0F, 6, 6, 4, 0.0F);
		this.setRotateAngle(hoodPipe01, -0.40142572795869574F, 0.0F, 0.0F);
		this.hood01 = new ModelRenderer(this, 70, 0);
		this.hood01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.hood01.addBox(-4.5F, -9.0F, -4.7F, 9, 9, 10, 0.0F);
		this.tunicLeft = new ModelRenderer(this, 23, 65);
		this.tunicLeft.setRotationPoint(-2.01F, 0.0F, -2.1F);
		this.tunicLeft.addBox(0.0F, 0.0F, -1.0F, 4, 10, 1, 0.0F);
		this.setRotateAngle(tunicLeft, 0.12217304763960307F, -1.5707963267948966F, 0.0F);
		this.armRight = new ModelRenderer(this, 47, 81);
		this.armRight.mirror = true;
		this.armRight.setRotationPoint(5.0F, 2.0F, 0.0F);
		this.armRight.addBox(-1.0F, -1.9F, -2.0F, 4, 12, 4, 0.0F);
		this.shoulderLeft = new ModelRenderer(this, 0, 32);
		this.shoulderLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.shoulderLeft.addBox(-1.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F);
		this.setRotateAngle(shoulderLeft, 0.0F, 3.141592653589793F, -0.08726646259971647F);
		this.armLeft = new ModelRenderer(this, 47, 81);
		this.armLeft.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.armLeft.addBox(-3.0F, -1.9F, -2.0F, 4, 12, 4, 0.0F);
		this.sleeveRight = new ModelRenderer(this, 49, 98);
		this.sleeveRight.setRotationPoint(0.99F, 10.1F, 2.0F);
		this.sleeveRight.addBox(-2.0F, -4.0F, 0.0F, 4, 4, 2, 0.0F);
		this.setRotateAngle(sleeveRight, 0.5235987755982988F, 0.0F, 0.0F);
		this.tunicRightFront_1 = new ModelRenderer(this, 53, 77);
		this.tunicRightFront_1.setRotationPoint(-0.01F, 10.0F, 1.0F);
		this.tunicRightFront_1.addBox(0.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
		this.setRotateAngle(tunicRightFront_1, -0.2617993877991494F, 0.0F, 0.0F);
		this.tunicRightFront = new ModelRenderer(this, 53, 65);
		this.tunicRightFront.setRotationPoint(-1.99F, 0.0F, -2.1F);
		this.tunicRightFront.addBox(0.0F, 0.0F, 0.0F, 4, 10, 1, 0.0F);
		this.setRotateAngle(tunicRightFront, -0.12217304763960307F, 0.0F, 0.0F);
		this.tunicLeftFront = new ModelRenderer(this, 53, 65);
		this.tunicLeftFront.setRotationPoint(2.01F, 0.0F, -2.1F);
		this.tunicLeftFront.addBox(0.0F, 0.0F, -1.0F, 4, 10, 1, 0.0F);
		this.setRotateAngle(tunicLeftFront, -3.01941960595019F, 0.0F, 3.141592653589793F);
		this.tunicRight = new ModelRenderer(this, 23, 65);
		this.tunicRight.setRotationPoint(2.01F, 0.0F, -2.1F);
		this.tunicRight.addBox(0.0F, 0.0F, 0.0F, 4, 10, 1, 0.0F);
		this.setRotateAngle(tunicRight, -0.12217304763960307F, -1.5707963267948966F, 0.0F);
		this.tunicFront = new ModelRenderer(this, 53, 77);
		this.tunicFront.setRotationPoint(-0.01F, 10.0F, -1.0F);
		this.tunicFront.addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
		this.setRotateAngle(tunicFront, 0.2617993877991494F, 0.0F, 0.0F);
		this.hoodFringeL02 = new ModelRenderer(this, 97, 19);
		this.hoodFringeL02.setRotationPoint(4.85F, -1.2F, 0.1F);
		this.hoodFringeL02.addBox(0.0F, -0.5F, -5.38F, 1, 2, 10, 0.0F);
		this.setRotateAngle(hoodFringeL02, 0.0F, 0.0F, 0.20943951023931953F);
		this.hoodFringeL03 = new ModelRenderer(this, 97, 33);
		this.hoodFringeL03.setRotationPoint(5.15F, -0.7F, 0.1F);
		this.hoodFringeL03.addBox(-5.0F, -0.9F, -5.37F, 5, 2, 10, 0.0F);
		this.setRotateAngle(hoodFringeL03, 0.0F, 0.0F, -0.3141592653589793F);
		this.tunicLeftBack_1 = new ModelRenderer(this, 53, 77);
		this.tunicLeftBack_1.setRotationPoint(-0.01F, 10.0F, 1.0F);
		this.tunicLeftBack_1.addBox(0.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
		this.setRotateAngle(tunicLeftBack_1, -0.2617993877991494F, 0.0F, 0.0F);
		this.legLeft = new ModelRenderer(this, 3, 32);
		this.legLeft.setRotationPoint(-2.0F, 12.0F, 0.0F);
		this.legLeft.addBox(-2.0F, 0.0F, -2.0F, 0, 0, 0, 0.0F);
		this.hoodFringeR01 = new ModelRenderer(this, 77, 24);
		this.hoodFringeR01.mirror = true;
		this.hoodFringeR01.setRotationPoint(-1.9F, -8.2F, 0.1F);
		this.hoodFringeR01.addBox(-2.0F, -0.3F, -5.39F, 2, 8, 10, 0.0F);
		this.setRotateAngle(hoodFringeR01, 0.0F, 0.0F, 0.2792526803190927F);
		this.hoodFringeL01 = new ModelRenderer(this, 77, 24);
		this.hoodFringeL01.setRotationPoint(1.9F, -8.2F, 0.1F);
		this.hoodFringeL01.addBox(0.0F, -0.3F, -5.39F, 2, 8, 10, 0.0F);
		this.setRotateAngle(hoodFringeL01, 0.0F, 0.0F, -0.2792526803190927F);
		this.Body = new ModelRenderer(this, 3, 81);
		this.Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Body.addBox(-4.0F, -0.01F, -2.0F, 8, 12, 4, 0.0F);
		this.hoodFringe01 = new ModelRenderer(this, 66, 0);
		this.hoodFringe01.setRotationPoint(0.0F, 0.0F, 0.1F);
		this.hoodFringe01.addBox(-3.0F, -8.9F, -5.4F, 6, 2, 1, 0.0F);
		this.hoodShade = new ModelRenderer(this, 105, 0);
		this.hoodShade.setRotationPoint(0.0F, -7.3F, -5.2F);
		this.hoodShade.addBox(-4.0F, 0.0F, 0.0F, 8, 8, 0, 0.0F);
		this.setRotateAngle(hoodShade, 0.05235987755982988F, 0.0F, 0.0F);
		this.tunicRight_1 = new ModelRenderer(this, 23, 77);
		this.tunicRight_1.setRotationPoint(-0.01F, 10.0F, 1.0F);
		this.tunicRight_1.addBox(0.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
		this.setRotateAngle(tunicRight_1, -0.2617993877991494F, 0.0F, 0.0F);
		this.tunicRightBack = new ModelRenderer(this, 53, 65);
		this.tunicRightBack.setRotationPoint(-1.99F, 0.0F, 2.1F);
		this.tunicRightBack.addBox(0.0F, 0.0F, -1.0F, 4, 10, 1, 0.0F);
		this.setRotateAngle(tunicRightBack, 0.12217304763960307F, 0.0F, 0.0F);
		this.armLeft.addChild(this.sleeveLeft);
		this.tunicLeft.addChild(this.tunicLeft_1);
		this.armRight.addChild(this.shoulderRight);
		this.hoodPipe01.addChild(this.hoodPipe02);
		this.hood01.addChild(this.hoodFringeR03);
		this.hood01.addChild(this.hoodFringeL04);
		this.hood01.addChild(this.hoodFringeR02);
		this.legLeft.addChild(this.tunicLeftBack);
		this.tunicRightBack.addChild(this.tunicRightBack_1);
		this.hood01.addChild(this.hoodFringeR04);
		this.hood01.addChild(this.hoodPipe01);
		this.bipedHead.addChild(this.hood01);
		this.legLeft.addChild(this.tunicLeft);
		this.Body.addChild(this.armRight);
		this.armLeft.addChild(this.shoulderLeft);
		this.Body.addChild(this.armLeft);
		this.armRight.addChild(this.sleeveRight);
		this.tunicRightFront.addChild(this.tunicRightFront_1);
		this.legRight.addChild(this.tunicRightFront);
		this.legLeft.addChild(this.tunicLeftFront);
		this.legRight.addChild(this.tunicRight);
		this.tunicLeftFront.addChild(this.tunicFront);
		this.hood01.addChild(this.hoodFringeL02);
		this.hood01.addChild(this.hoodFringeL03);
		this.tunicLeftBack.addChild(this.tunicLeftBack_1);
		this.hood01.addChild(this.hoodFringeR01);
		this.hood01.addChild(this.hoodFringeL01);
		this.hood01.addChild(this.hoodFringe01);
		this.hood01.addChild(this.hoodShade);
		this.tunicRight.addChild(this.tunicRight_1);
		this.legRight.addChild(this.tunicRightBack);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.bipedHead.render(f5);
		this.legRight.render(f5);
		this.legLeft.render(f5);
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
		GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
		GlStateManager.scale(1.01D, 1.0D, 1.01D);
		GlStateManager.translate(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
		GlStateManager.translate(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
		this.Body.render(f5);
		GlStateManager.popMatrix();
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
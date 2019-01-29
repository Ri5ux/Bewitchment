package com.bewitchment.client.render.entity.model;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.entity.Entity;

/**
 * demon2 - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelDemon extends AdvancedModelBase {
	public AdvancedModelRenderer bipedBody;
	public AdvancedModelRenderer tail01;
	public AdvancedModelRenderer lWing01;
	public AdvancedModelRenderer rWing01;
	public AdvancedModelRenderer bipedHead;
	public AdvancedModelRenderer bipedLeftArm;
	public AdvancedModelRenderer bipedRightArm;
	public AdvancedModelRenderer bipedLeftLeg;
	public AdvancedModelRenderer bipedRightLeg;
	public AdvancedModelRenderer tail02;
	public AdvancedModelRenderer tail03;
	public AdvancedModelRenderer tail04;
	public AdvancedModelRenderer tail05;
	public AdvancedModelRenderer tailTip01;
	public AdvancedModelRenderer tailTip02;
	public AdvancedModelRenderer lWing02;
	public AdvancedModelRenderer lWing03;
	public AdvancedModelRenderer lWingMembrane;
	public AdvancedModelRenderer lWing04;
	public AdvancedModelRenderer rWing02;
	public AdvancedModelRenderer rWing03;
	public AdvancedModelRenderer rWingMembrane;
	public AdvancedModelRenderer rWing04;
	public AdvancedModelRenderer lHorn01;
	public AdvancedModelRenderer rHorn01;
	public AdvancedModelRenderer lHorn02;
	public AdvancedModelRenderer lHorn03a;
	public AdvancedModelRenderer lHorn03b;
	public AdvancedModelRenderer lHorn03c;
	public AdvancedModelRenderer lHorn03d;
	public AdvancedModelRenderer lHorn04;
	public AdvancedModelRenderer rHorn02;
	public AdvancedModelRenderer rHorn03a;
	public AdvancedModelRenderer rHorn03b;
	public AdvancedModelRenderer rHorn03c;
	public AdvancedModelRenderer rHorn03d;
	public AdvancedModelRenderer rHorn04;
	public AdvancedModelRenderer lLeg02;
	public AdvancedModelRenderer lLeg03;
	public AdvancedModelRenderer lHoof;
	public AdvancedModelRenderer rLeg02;
	public AdvancedModelRenderer rLeg03;
	public AdvancedModelRenderer rHoof;

	private ModelAnimator animator;

	public ModelDemon() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.bipedRightArm = new AdvancedModelRenderer(this, 44, 16);
		this.bipedRightArm.mirror = true;
		this.bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 14, 4, 0.0F);
		this.setRotateAngle(bipedRightArm, 0.0F, 0.0F, 0.10000736613927509F);
		this.bipedRightLeg = new AdvancedModelRenderer(this, 0, 17);
		this.bipedRightLeg.mirror = true;
		this.bipedRightLeg.setRotationPoint(-2.1F, 12.2F, 0.1F);
		this.bipedRightLeg.addBox(-2.0F, -1.0F, -2.5F, 4, 8, 5, 0.0F);
		this.setRotateAngle(bipedRightLeg, -0.2617993877991494F, 0.0F, 0.10471975511965977F);
		this.rHorn03b = new AdvancedModelRenderer(this, 35, 5);
		this.rHorn03b.mirror = true;
		this.rHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03b.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.lLeg03 = new AdvancedModelRenderer(this, 0, 41);
		this.lLeg03.setRotationPoint(0.0F, 5.2F, 0.2F);
		this.lLeg03.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
		this.setRotateAngle(lLeg03, -0.41887902047863906F, 0.0F, 0.0F);
		this.lWingMembrane = new AdvancedModelRenderer(this, 41, 26);
		this.lWingMembrane.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lWingMembrane.addBox(0.0F, 0.4F, -2.2F, 0, 14, 11, 0.0F);
		this.setRotateAngle(lWingMembrane, -0.091106186954104F, 0.0F, 0.0F);
		this.tail05 = new AdvancedModelRenderer(this, 15, 45);
		this.tail05.setRotationPoint(0.0F, 0.0F, 4.9F);
		this.tail05.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
		this.setRotateAngle(tail05, 0.22689280275926282F, 0.0F, 0.0F);
		this.lHorn03a = new AdvancedModelRenderer(this, 35, 5);
		this.lHorn03a.setRotationPoint(0.0F, -1.6F, 0.0F);
		this.lHorn03a.addBox(-0.8F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn03a, -0.13962634015954636F, 0.0F, -0.06981317007977318F);
		this.bipedBody = new AdvancedModelRenderer(this, 19, 17);
		this.bipedBody.setRotationPoint(0.0F, -6.0F, 0.0F);
		this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 13, 4, 0.0F);
		this.rHorn01 = new AdvancedModelRenderer(this, 32, 0);
		this.rHorn01.mirror = true;
		this.rHorn01.setRotationPoint(-2.9F, -7.4F, -1.3F);
		this.rHorn01.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rHorn01, 0.10471975511965977F, 0.0F, -0.41887902047863906F);
		this.lWing03 = new AdvancedModelRenderer(this, 29, 54);
		this.lWing03.setRotationPoint(0.1F, -0.5F, 7.1F);
		this.lWing03.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.setRotateAngle(lWing03, 0.20943951023931953F, 0.0F, 0.0F);
		this.rHorn03a = new AdvancedModelRenderer(this, 35, 5);
		this.rHorn03a.mirror = true;
		this.rHorn03a.setRotationPoint(0.0F, -1.6F, 0.0F);
		this.rHorn03a.addBox(-0.8F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn03a, -0.13962634015954636F, 0.0F, 0.06981317007977318F);
		this.rWingMembrane = new AdvancedModelRenderer(this, 41, 26);
		this.rWingMembrane.mirror = true;
		this.rWingMembrane.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rWingMembrane.addBox(0.0F, 0.4F, -2.2F, 0, 14, 11, 0.0F);
		this.setRotateAngle(rWingMembrane, -0.091106186954104F, 0.0F, 0.0F);
		this.bipedLeftLeg = new AdvancedModelRenderer(this, 0, 17);
		this.bipedLeftLeg.setRotationPoint(2.1F, 12.2F, 0.1F);
		this.bipedLeftLeg.addBox(-2.0F, -1.0F, -2.5F, 4, 8, 5, 0.0F);
		this.setRotateAngle(bipedLeftLeg, -0.2617993877991494F, 0.0F, -0.10471975511965977F);
		this.tailTip01 = new AdvancedModelRenderer(this, 16, 53);
		this.tailTip01.setRotationPoint(0.0F, 0.0F, 4.5F);
		this.tailTip01.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F);
		this.setRotateAngle(tailTip01, 0.2617993877991494F, 0.0F, 0.0F);
		this.bipedHead = new AdvancedModelRenderer(this, 0, 0);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
		this.lHorn02 = new AdvancedModelRenderer(this, 32, 0);
		this.lHorn02.setRotationPoint(0.0F, -1.7F, 0.0F);
		this.lHorn02.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(lHorn02, -0.10471975511965977F, 0.0F, -0.19198621771937624F);
		this.tail04 = new AdvancedModelRenderer(this, 15, 45);
		this.tail04.setRotationPoint(0.0F, 0.0F, 4.9F);
		this.tail04.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
		this.setRotateAngle(tail04, 0.13962634015954636F, 0.0F, 0.0F);
		this.lWing01 = new AdvancedModelRenderer(this, 26, 35);
		this.lWing01.setRotationPoint(2.5F, 3.2F, 1.4F);
		this.lWing01.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 5, 0.0F);
		this.setRotateAngle(lWing01, 0.27314402793711257F, 0.5235987755982988F, 0.0F);
		this.lWing02 = new AdvancedModelRenderer(this, 27, 44);
		this.lWing02.setRotationPoint(0.1F, 0.2F, 4.3F);
		this.lWing02.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
		this.setRotateAngle(lWing02, 0.5235987755982988F, 0.0F, 0.0F);
		this.rWing04 = new AdvancedModelRenderer(this, 24, 55);
		this.rWing04.mirror = true;
		this.rWing04.setRotationPoint(0.0F, 7.7F, 0.0F);
		this.rWing04.addBox(-0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F);
		this.setRotateAngle(rWing04, -0.41887902047863906F, 0.0F, 0.0F);
		this.rLeg02 = new AdvancedModelRenderer(this, 0, 30);
		this.rLeg02.mirror = true;
		this.rLeg02.setRotationPoint(0.0F, 5.7F, -0.4F);
		this.rLeg02.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
		this.setRotateAngle(rLeg02, 0.6981317007977318F, 0.0F, -0.10471975511965977F);
		this.lHoof = new AdvancedModelRenderer(this, 0, 53);
		this.lHoof.setRotationPoint(0.0F, 6.8F, 0.0F);
		this.lHoof.addBox(-1.5F, 0.0F, -2.9F, 3, 1, 4, 0.0F);
		this.tailTip02 = new AdvancedModelRenderer(this, 15, 58);
		this.tailTip02.setRotationPoint(0.0F, 0.1F, 0.8F);
		this.tailTip02.addBox(-1.5F, -0.5F, -0.5F, 2, 1, 2, 0.0F);
		this.setRotateAngle(tailTip02, 0.0F, 0.7853981633974483F, 0.0F);
		this.rHoof = new AdvancedModelRenderer(this, 0, 53);
		this.rHoof.mirror = true;
		this.rHoof.setRotationPoint(0.0F, 6.8F, 0.0F);
		this.rHoof.addBox(-1.5F, 0.0F, -2.9F, 3, 1, 4, 0.0F);
		this.rHorn03c = new AdvancedModelRenderer(this, 35, 5);
		this.rHorn03c.mirror = true;
		this.rHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03c.addBox(-0.8F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.lHorn01 = new AdvancedModelRenderer(this, 32, 0);
		this.lHorn01.setRotationPoint(2.9F, -7.4F, -1.3F);
		this.lHorn01.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(lHorn01, 0.10471975511965977F, 0.0F, 0.41887902047863906F);
		this.lWing04 = new AdvancedModelRenderer(this, 24, 55);
		this.lWing04.setRotationPoint(0.0F, 7.7F, 0.0F);
		this.lWing04.addBox(-0.5F, 0.0F, -0.5F, 1, 8, 1, 0.0F);
		this.setRotateAngle(lWing04, -0.41887902047863906F, 0.0F, 0.0F);
		this.rHorn02 = new AdvancedModelRenderer(this, 32, 0);
		this.rHorn02.mirror = true;
		this.rHorn02.setRotationPoint(0.0F, -1.7F, 0.0F);
		this.rHorn02.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rHorn02, -0.10471975511965977F, 0.0F, 0.19198621771937624F);
		this.rHorn03d = new AdvancedModelRenderer(this, 35, 5);
		this.rHorn03d.mirror = true;
		this.rHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03d.addBox(-0.2F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.rHorn04 = new AdvancedModelRenderer(this, 35, 10);
		this.rHorn04.mirror = true;
		this.rHorn04.setRotationPoint(0.0F, -1.7F, 0.0F);
		this.rHorn04.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn04, -0.13962634015954636F, 0.0F, 0.10471975511965977F);
		this.rLeg03 = new AdvancedModelRenderer(this, 0, 41);
		this.rLeg03.mirror = true;
		this.rLeg03.setRotationPoint(0.0F, 5.2F, 0.2F);
		this.rLeg03.addBox(-1.0F, 0.0F, -1.5F, 2, 7, 3, 0.0F);
		this.setRotateAngle(rLeg03, -0.41887902047863906F, 0.0F, 0.0F);
		this.tail01 = new AdvancedModelRenderer(this, 13, 37);
		this.tail01.setRotationPoint(0.0F, 11.4F, 1.3F);
		this.tail01.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(tail01, -0.8726646259971648F, 0.0F, 0.0F);
		this.bipedLeftArm = new AdvancedModelRenderer(this, 44, 16);
		this.bipedLeftArm.setRotationPoint(5.0F, 2.0F, -0.0F);
		this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 14, 4, 0.0F);
		this.setRotateAngle(bipedLeftArm, 0.0F, 0.0F, -0.10000736613927509F);
		this.rWing02 = new AdvancedModelRenderer(this, 27, 44);
		this.rWing02.mirror = true;
		this.rWing02.setRotationPoint(-0.1F, 0.2F, 4.3F);
		this.rWing02.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 8, 0.0F);
		this.setRotateAngle(rWing02, 0.5235987755982988F, 0.0F, 0.0F);
		this.tail03 = new AdvancedModelRenderer(this, 15, 45);
		this.tail03.setRotationPoint(0.0F, 0.0F, 2.9F);
		this.tail03.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
		this.setRotateAngle(tail03, 0.06981317007977318F, 0.0F, 0.0F);
		this.lHorn03d = new AdvancedModelRenderer(this, 35, 5);
		this.lHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03d.addBox(-0.2F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.tail02 = new AdvancedModelRenderer(this, 13, 37);
		this.tail02.setRotationPoint(0.0F, 0.0F, 3.8F);
		this.tail02.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotateAngle(tail02, -0.13962634015954636F, 0.0F, 0.0F);
		this.rWing03 = new AdvancedModelRenderer(this, 29, 54);
		this.rWing03.mirror = true;
		this.rWing03.setRotationPoint(-0.1F, -0.5F, 7.1F);
		this.rWing03.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
		this.setRotateAngle(rWing03, 0.20943951023931953F, 0.0F, 0.0F);
		this.rWing01 = new AdvancedModelRenderer(this, 26, 35);
		this.rWing01.mirror = true;
		this.rWing01.setRotationPoint(-2.5F, 3.2F, 1.4F);
		this.rWing01.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 5, 0.0F);
		this.setRotateAngle(rWing01, 0.27314402793711257F, -0.5235987755982988F, 0.0F);
		this.lHorn03c = new AdvancedModelRenderer(this, 35, 5);
		this.lHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03c.addBox(-0.8F, -2.0F, -0.2F, 1, 2, 1, 0.0F);
		this.lHorn04 = new AdvancedModelRenderer(this, 35, 10);
		this.lHorn04.setRotationPoint(0.0F, -1.7F, 0.0F);
		this.lHorn04.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn04, -0.13962634015954636F, 0.0F, -0.10471975511965977F);
		this.lLeg02 = new AdvancedModelRenderer(this, 0, 30);
		this.lLeg02.setRotationPoint(0.0F, 5.7F, -0.4F);
		this.lLeg02.addBox(-1.5F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
		this.setRotateAngle(lLeg02, 0.6981317007977318F, 0.0F, 0.10471975511965977F);
		this.lHorn03b = new AdvancedModelRenderer(this, 35, 5);
		this.lHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03b.addBox(-0.2F, -2.0F, -0.8F, 1, 2, 1, 0.0F);
		this.bipedBody.addChild(this.bipedRightArm);
		this.bipedBody.addChild(this.bipedRightLeg);
		this.rHorn03a.addChild(this.rHorn03b);
		this.lLeg02.addChild(this.lLeg03);
		this.lWing02.addChild(this.lWingMembrane);
		this.tail04.addChild(this.tail05);
		this.lHorn02.addChild(this.lHorn03a);
		this.bipedHead.addChild(this.rHorn01);
		this.lWing02.addChild(this.lWing03);
		this.rHorn02.addChild(this.rHorn03a);
		this.rWing02.addChild(this.rWingMembrane);
		this.bipedBody.addChild(this.bipedLeftLeg);
		this.tail05.addChild(this.tailTip01);
		this.bipedBody.addChild(this.bipedHead);
		this.lHorn01.addChild(this.lHorn02);
		this.tail03.addChild(this.tail04);
		this.bipedBody.addChild(this.lWing01);
		this.lWing01.addChild(this.lWing02);
		this.rWing03.addChild(this.rWing04);
		this.bipedRightLeg.addChild(this.rLeg02);
		this.lLeg03.addChild(this.lHoof);
		this.tailTip01.addChild(this.tailTip02);
		this.rLeg03.addChild(this.rHoof);
		this.rHorn03a.addChild(this.rHorn03c);
		this.bipedHead.addChild(this.lHorn01);
		this.lWing03.addChild(this.lWing04);
		this.rHorn01.addChild(this.rHorn02);
		this.rHorn03a.addChild(this.rHorn03d);
		this.rHorn03a.addChild(this.rHorn04);
		this.rLeg02.addChild(this.rLeg03);
		this.bipedBody.addChild(this.tail01);
		this.bipedBody.addChild(this.bipedLeftArm);
		this.rWing01.addChild(this.rWing02);
		this.tail02.addChild(this.tail03);
		this.lHorn03a.addChild(this.lHorn03d);
		this.tail01.addChild(this.tail02);
		this.rWing02.addChild(this.rWing03);
		this.bipedBody.addChild(this.rWing01);
		this.lHorn03a.addChild(this.lHorn03c);
		this.lHorn03a.addChild(this.lHorn04);
		this.bipedLeftLeg.addChild(this.lLeg02);
		this.lHorn03a.addChild(this.lHorn03b);
		this.updateDefaultPose();
		animator = ModelAnimator.create();
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
		this.bipedBody.render(f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.resetToDefaultPose();

		//f = entity.ticksExisted;
		//f1 = 0.5f;

		float globalSpeed = 1;
		float globalHeight = 1;
		float globalDegree = 1;

		bob(bipedBody, 0.3f * globalSpeed, 0.8f * globalHeight, false, f, f1);
		walk(bipedRightArm, 0.6f, 0.5f, false, 0, 0.2f, f, f1);
		walk(bipedLeftArm, 0.6f, 0.5f, true, 0, 0.2f, f, f1);
		walk(rLeg03, 0.6f, 0.5f, true, 0, 0.2f, f, f1);
		walk(lLeg03, 0.6f, 0.5f, false, 0, 0.2f, f, f1);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
		AdvancedModelRenderer.rotateAngleX = x;
		AdvancedModelRenderer.rotateAngleY = y;
		AdvancedModelRenderer.rotateAngleZ = z;
	}

	public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.resetToDefaultPose();
		this.setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
	}
}

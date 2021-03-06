package com.bewitchment.client.render.entity.model.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * statueBaphomet - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelStatueBaphomet extends ModelBase {
	public ModelRenderer plith01;
	public ModelRenderer bipedBody;
	public ModelRenderer plith02;
	public ModelRenderer stomach;
	public ModelRenderer boobs;
	public ModelRenderer bipedHead;
	public ModelRenderer bipedLeftArm;
	public ModelRenderer bipedRightArm;
	public ModelRenderer bipedLeftLeg;
	public ModelRenderer bipedRightLeg;
	public ModelRenderer lWing01;
	public ModelRenderer rWing01;
	public ModelRenderer hips;
	public ModelRenderer loinclothF;
	public ModelRenderer loinclothF02;
	public ModelRenderer lHorn01;
	public ModelRenderer rHorn01;
	public ModelRenderer snout;
	public ModelRenderer jawUpper01;
	public ModelRenderer jawLower;
	public ModelRenderer lEar;
	public ModelRenderer rEar;
	public ModelRenderer torch01;
	public ModelRenderer lHorn02a;
	public ModelRenderer lHorn02b;
	public ModelRenderer lHorn02c;
	public ModelRenderer lHorn03d;
	public ModelRenderer lHorn03a;
	public ModelRenderer lHorn03b;
	public ModelRenderer lHorn03c;
	public ModelRenderer lHorn03d_1;
	public ModelRenderer lHorn04;
	public ModelRenderer lHorn05;
	public ModelRenderer rHorn02a;
	public ModelRenderer rHorn02b;
	public ModelRenderer rHorn02c;
	public ModelRenderer rHorn03d;
	public ModelRenderer rHorn03a;
	public ModelRenderer rHorn03b;
	public ModelRenderer rHorn03c;
	public ModelRenderer rHorn03d_1;
	public ModelRenderer rHorn04;
	public ModelRenderer rHorn05;
	public ModelRenderer jawUpper02;
	public ModelRenderer beard;
	public ModelRenderer torch02a;
	public ModelRenderer torch02b;
	public ModelRenderer torch02c;
	public ModelRenderer torch02d;
	public ModelRenderer torch03a;
	public ModelRenderer torch03b;
	public ModelRenderer torch03c;
	public ModelRenderer torch03c_1;
	public ModelRenderer torch03e;
	public ModelRenderer lArm02;
	public ModelRenderer rArm02;
	public ModelRenderer lLeg02;
	public ModelRenderer lLeg03;
	public ModelRenderer lHoof;
	public ModelRenderer rLeg02;
	public ModelRenderer rLeg03;
	public ModelRenderer rHoof;
	public ModelRenderer lWing02;
	public ModelRenderer lWing03;
	public ModelRenderer lWingFeathers01;
	public ModelRenderer lWing04;
	public ModelRenderer lWingFeathers02;
	public ModelRenderer lWingFeathers02b;
	public ModelRenderer lWingFeathers02c;
	public ModelRenderer rWing02;
	public ModelRenderer rWing03;
	public ModelRenderer rWingFeathers01;
	public ModelRenderer rWing04;
	public ModelRenderer rWingFeathers02;
	public ModelRenderer rWingFeathers02b;
	public ModelRenderer rWingFeathers02c;

	public ModelStatueBaphomet() {
		this.textureWidth = 128;
		this.textureHeight = 128;
		this.lEar = new ModelRenderer(this, 48, 0);
		this.lEar.setRotationPoint(2.6F, -5.4F, 0.1F);
		this.lEar.addBox(0.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
		this.setRotateAngle(lEar, -0.3490658503988659F, 0.0F, 0.3141592653589793F);
		this.rLeg03 = new ModelRenderer(this, 0, 44);
		this.rLeg03.mirror = true;
		this.rLeg03.setRotationPoint(0.0F, 6.0F, 0.2F);
		this.rLeg03.addBox(-1.0F, 0.0F, -1.5F, 2, 8, 3, 0.0F);
		this.setRotateAngle(rLeg03, -0.5235987755982988F, 0.0F, -0.5462880558742251F);
		this.lHorn03c = new ModelRenderer(this, 0, 4);
		this.lHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03c.addBox(-0.7F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.lArm02 = new ModelRenderer(this, 61, 19);
		this.lArm02.setRotationPoint(0.5F, 6.0F, -0.0F);
		this.lArm02.addBox(-1.5F, -0.3F, -2.0F, 3, 9, 4, 0.0F);
		this.setRotateAngle(lArm02, -0.17453292519943295F, 0.0F, -0.20943951023931953F);
		this.lWingFeathers02c = new ModelRenderer(this, 0, 65);
		this.lWingFeathers02c.mirror = true;
		this.lWingFeathers02c.setRotationPoint(0.0F, 2.3F, -2.8F);
		this.lWingFeathers02c.addBox(-0.5F, 0.7F, -3.8F, 1, 18, 3, 0.0F);
		this.setRotateAngle(lWingFeathers02c, -0.4363323129985824F, 0.0F, 0.0F);
		this.lHorn02b = new ModelRenderer(this, 0, 0);
		this.lHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn02b.addBox(-0.2F, -3.0F, -0.8F, 1, 3, 1, 0.0F);
		this.rArm02 = new ModelRenderer(this, 61, 19);
		this.rArm02.mirror = true;
		this.rArm02.setRotationPoint(-0.5F, 5.2F, -0.0F);
		this.rArm02.addBox(-1.5F, -1.1F, -2.0F, 3, 9, 4, 0.0F);
		this.setRotateAngle(rArm02, -0.17453292519943295F, 0.0F, 1.53588974175501F);
		this.bipedRightArm = new ModelRenderer(this, 46, 19);
		this.bipedRightArm.mirror = true;
		this.bipedRightArm.setRotationPoint(-5.0F, 1.9F, 1.0F);
		this.bipedRightArm.addBox(-2.0F, -2.0F, -2.0F, 3, 8, 4, 0.0F);
		this.setRotateAngle(bipedRightArm, 0.08726646259971647F, 0.0F, 1.0471975511965976F);
		this.torch01 = new ModelRenderer(this, 117, 0);
		this.torch01.setRotationPoint(0.0F, -6.6F, -1.2F);
		this.torch01.addBox(-1.0F, -2.5F, -1.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(torch01, 0.0F, 0.7853981633974483F, 0.0F);
		this.rHorn02b = new ModelRenderer(this, 0, 0);
		this.rHorn02b.mirror = true;
		this.rHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn02b.addBox(-0.2F, -3.0F, -0.8F, 1, 3, 1, 0.0F);
		this.rWing02 = new ModelRenderer(this, 43, 41);
		this.rWing02.mirror = true;
		this.rWing02.setRotationPoint(-0.1F, 0.2F, 5.6F);
		this.rWing02.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 9, 0.0F);
		this.setRotateAngle(rWing02, 0.5235987755982988F, -0.13962634015954636F, 0.0F);
		this.torch03a = new ModelRenderer(this, 115, 12);
		this.torch03a.setRotationPoint(0.0F, -3.6F, 0.0F);
		this.torch03a.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.rEar = new ModelRenderer(this, 48, 0);
		this.rEar.mirror = true;
		this.rEar.setRotationPoint(-2.6F, -5.4F, 0.1F);
		this.rEar.addBox(-4.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
		this.setRotateAngle(rEar, -0.3490658503988659F, 0.0F, -0.3141592653589793F);
		this.rHorn02a = new ModelRenderer(this, 0, 0);
		this.rHorn02a.mirror = true;
		this.rHorn02a.setRotationPoint(0.0F, -2.2F, 0.0F);
		this.rHorn02a.addBox(-0.8F, -3.0F, -0.8F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn02a, -0.17453292519943295F, 0.0F, -0.2617993877991494F);
		this.lHorn05 = new ModelRenderer(this, 4, 4);
		this.lHorn05.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.lHorn05.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn05, 0.05235987755982988F, 0.0F, -0.13962634015954636F);
		this.stomach = new ModelRenderer(this, 19, 31);
		this.stomach.setRotationPoint(0.0F, 5.6F, 0.0F);
		this.stomach.addBox(-3.5F, 0.0F, -2.0F, 7, 7, 4, 0.0F);
		this.rHorn03d = new ModelRenderer(this, 0, 0);
		this.rHorn03d.mirror = true;
		this.rHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03d.addBox(-0.2F, -3.0F, -0.2F, 1, 3, 1, 0.0F);
		this.jawLower = new ModelRenderer(this, 48, 5);
		this.jawLower.setRotationPoint(0.0F, -1.0F, -3.0F);
		this.jawLower.addBox(-2.0F, -0.5F, -4.0F, 4, 1, 4, 0.0F);
		this.setRotateAngle(jawLower, -0.03490658503988659F, 0.0F, 0.0F);
		this.lWingFeathers02 = new ModelRenderer(this, 0, 65);
		this.lWingFeathers02.mirror = true;
		this.lWingFeathers02.setRotationPoint(0.0F, 2.3F, 0.0F);
		this.lWingFeathers02.addBox(-0.5F, 2.8F, -0.7F, 1, 21, 3, 0.0F);
		this.setRotateAngle(lWingFeathers02, -0.4363323129985824F, 0.0F, 0.0F);
		this.lWingFeathers02b = new ModelRenderer(this, 0, 65);
		this.lWingFeathers02b.mirror = true;
		this.lWingFeathers02b.setRotationPoint(0.0F, 2.3F, 0.0F);
		this.lWingFeathers02b.addBox(-0.5F, 0.7F, -3.6F, 1, 21, 3, 0.0F);
		this.setRotateAngle(lWingFeathers02b, -0.4363323129985824F, 0.0F, 0.0F);
		this.rWing04 = new ModelRenderer(this, 51, 52);
		this.rWing04.mirror = true;
		this.rWing04.setRotationPoint(0.0F, 8.6F, 0.2F);
		this.rWing04.addBox(-0.5F, 0.0F, -0.5F, 1, 11, 1, 0.0F);
		this.setRotateAngle(rWing04, -0.47123889803846897F, 0.0F, 0.0F);
		this.rHorn03d_1 = new ModelRenderer(this, 0, 4);
		this.rHorn03d_1.mirror = true;
		this.rHorn03d_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03d_1.addBox(-0.3F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.lLeg02 = new ModelRenderer(this, 0, 32);
		this.lLeg02.setRotationPoint(0.5F, 7.4F, -1.7F);
		this.lLeg02.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 4, 0.0F);
		this.setRotateAngle(lLeg02, 0.5410520681182421F, -0.13962634015954636F, 1.5009831567151235F);
		this.rHorn03b = new ModelRenderer(this, 0, 4);
		this.rHorn03b.mirror = true;
		this.rHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03b.addBox(-0.3F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		this.bipedHead = new ModelRenderer(this, 1, 2);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 1.0F);
		this.bipedHead.addBox(-3.5F, -7.0F, -3.5F, 7, 7, 7, 0.0F);
		this.rWingFeathers02b = new ModelRenderer(this, 0, 65);
		this.rWingFeathers02b.setRotationPoint(0.0F, 2.3F, 0.0F);
		this.rWingFeathers02b.addBox(-0.5F, 0.7F, -3.6F, 1, 21, 3, 0.0F);
		this.setRotateAngle(rWingFeathers02b, -0.4363323129985824F, 0.0F, 0.0F);
		this.rWing01 = new ModelRenderer(this, 43, 32);
		this.rWing01.mirror = true;
		this.rWing01.setRotationPoint(-1.8F, 2.8F, 1.4F);
		this.rWing01.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 6, 0.0F);
		this.setRotateAngle(rWing01, 0.6283185307179586F, -0.6457718232379019F, 0.0F);
		this.lHorn03a = new ModelRenderer(this, 0, 4);
		this.lHorn03a.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.lHorn03a.addBox(-0.7F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn03a, -0.10471975511965977F, 0.0F, 0.17453292519943295F);
		this.lHorn01 = new ModelRenderer(this, 23, 0);
		this.lHorn01.setRotationPoint(2.9F, -7.2F, -0.2F);
		this.lHorn01.addBox(-1.0F, -2.7F, -1.0F, 2, 4, 2, 0.0F);
		this.setRotateAngle(lHorn01, -0.17453292519943295F, 0.13962634015954636F, 0.40142572795869574F);
		this.beard = new ModelRenderer(this, 18, 59);
		this.beard.setRotationPoint(0.0F, 0.3F, -2.4F);
		this.beard.addBox(-1.5F, 0.0F, -1.0F, 3, 3, 2, 0.0F);
		this.setRotateAngle(beard, -0.03490658503988659F, 0.0F, 0.0F);
		this.lWing02 = new ModelRenderer(this, 43, 41);
		this.lWing02.setRotationPoint(0.1F, 0.2F, 5.6F);
		this.lWing02.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 9, 0.0F);
		this.setRotateAngle(lWing02, 0.5235987755982988F, 0.13962634015954636F, 0.0F);
		this.rHorn02c = new ModelRenderer(this, 0, 0);
		this.rHorn02c.mirror = true;
		this.rHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn02c.addBox(-0.8F, -3.0F, -0.2F, 1, 3, 1, 0.0F);
		this.snout = new ModelRenderer(this, 29, 2);
		this.snout.setRotationPoint(0.0F, -4.6F, -2.5F);
		this.snout.addBox(-2.0F, -1.9F, -5.1F, 4, 3, 5, 0.0F);
		this.setRotateAngle(snout, 0.5235987755982988F, 0.0F, 0.0F);
		this.torch02d = new ModelRenderer(this, 117, 6);
		this.torch02d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.torch02d.addBox(-0.8F, -3.8F, -0.2F, 1, 4, 1, 0.0F);
		this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
		this.bipedLeftLeg.setRotationPoint(2.4F, 13.7F, 0.3F);
		this.bipedLeftLeg.addBox(-2.0F, -1.6F, -2.9F, 4, 11, 5, 0.0F);
		this.setRotateAngle(bipedLeftLeg, -1.5707963267948966F, -0.6283185307179586F, -0.13962634015954636F);
		this.lHorn03b = new ModelRenderer(this, 0, 4);
		this.lHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03b.addBox(-0.3F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		this.rHorn04 = new ModelRenderer(this, 4, 0);
		this.rHorn04.mirror = true;
		this.rHorn04.setRotationPoint(0.0F, -2.8F, 0.0F);
		this.rHorn04.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn04, 0.05235987755982988F, 0.0F, -0.13962634015954636F);
		this.torch02b = new ModelRenderer(this, 117, 6);
		this.torch02b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.torch02b.addBox(-0.8F, -3.8F, -0.8F, 1, 4, 1, 0.0F);
		this.hips = new ModelRenderer(this, 16, 43);
		this.hips.setRotationPoint(0.0F, 5.4F, 0.0F);
		this.hips.addBox(-4.0F, 0.0F, -2.3F, 8, 3, 5, 0.0F);
		this.rWingFeathers01 = new ModelRenderer(this, 78, 28);
		this.rWingFeathers01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rWingFeathers01.addBox(-0.5F, -0.6F, -11.1F, 1, 10, 18, 0.0F);
		this.setRotateAngle(rWingFeathers01, -0.17453292519943295F, 0.0F, 0.0F);
		this.lHoof = new ModelRenderer(this, 0, 55);
		this.lHoof.setRotationPoint(0.0F, 7.9F, 0.0F);
		this.lHoof.addBox(-1.5F, -0.9F, -2.8F, 3, 2, 4, 0.0F);
		this.setRotateAngle(lHoof, 1.7453292519943295F, 0.0F, 0.0F);
		this.torch03b = new ModelRenderer(this, 122, 6);
		this.torch03b.setRotationPoint(0.6F, -1.5F, -0.6F);
		this.torch03b.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(torch03b, 0.24434609527920614F, 0.13962634015954636F, 0.2792526803190927F);
		this.rWingFeathers02c = new ModelRenderer(this, 0, 65);
		this.rWingFeathers02c.setRotationPoint(0.0F, 2.3F, -2.8F);
		this.rWingFeathers02c.addBox(-0.5F, 0.7F, -3.8F, 1, 18, 3, 0.0F);
		this.setRotateAngle(rWingFeathers02c, -0.4363323129985824F, 0.0F, 0.0F);
		this.lHorn03d_1 = new ModelRenderer(this, 0, 4);
		this.lHorn03d_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03d_1.addBox(-0.3F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.lWing03 = new ModelRenderer(this, 42, 53);
		this.lWing03.setRotationPoint(0.1F, 0.4F, 8.0F);
		this.lWing03.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
		this.setRotateAngle(lWing03, -0.3490658503988659F, 0.0F, 0.0F);
		this.bipedRightLeg = new ModelRenderer(this, 0, 16);
		this.bipedRightLeg.mirror = true;
		this.bipedRightLeg.setRotationPoint(-2.4F, 13.7F, 0.3F);
		this.bipedRightLeg.addBox(-2.0F, -1.6F, -2.9F, 4, 11, 5, 0.0F);
		this.setRotateAngle(bipedRightLeg, -1.5707963267948966F, 0.6283185307179586F, 0.13962634015954636F);
		this.plith02 = new ModelRenderer(this, 68, 64);
		this.plith02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.plith02.addBox(-7.5F, -2.7F, -7.5F, 15, 3, 15, 0.0F);
		this.loinclothF02 = new ModelRenderer(this, 65, 13);
		this.loinclothF02.setRotationPoint(0.0F, 8.8F, 0.0F);
		this.loinclothF02.addBox(-4.5F, -0.25F, -0.33F, 9, 4, 1, 0.0F);
		this.setRotateAngle(loinclothF02, 0.9105382707654417F, 0.0F, 0.0F);
		this.plith01 = new ModelRenderer(this, 60, 84);
		this.plith01.setRotationPoint(0.0F, 19.0F, 0.0F);
		this.plith01.addBox(-8.5F, 0.0F, -8.5F, 17, 5, 17, 0.0F);
		this.rHorn05 = new ModelRenderer(this, 4, 4);
		this.rHorn05.mirror = true;
		this.rHorn05.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.rHorn05.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn05, 0.05235987755982988F, 0.0F, 0.13962634015954636F);
		this.jawUpper01 = new ModelRenderer(this, 43, 11);
		this.jawUpper01.setRotationPoint(0.0F, -2.5F, -2.2F);
		this.jawUpper01.addBox(-1.6F, -1.0F, -5.0F, 4, 2, 5, 0.0F);
		this.setRotateAngle(jawUpper01, 0.06981317007977318F, 0.0F, 0.0F);
		this.torch02a = new ModelRenderer(this, 117, 6);
		this.torch02a.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.torch02a.addBox(-0.2F, -3.8F, -0.8F, 1, 4, 1, 0.0F);
		this.lHorn02a = new ModelRenderer(this, 0, 0);
		this.lHorn02a.setRotationPoint(0.0F, -2.2F, 0.0F);
		this.lHorn02a.addBox(-0.8F, -3.0F, -0.8F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn02a, -0.17453292519943295F, 0.0F, 0.2617993877991494F);
		this.bipedLeftArm = new ModelRenderer(this, 46, 19);
		this.bipedLeftArm.setRotationPoint(5.0F, 1.9F, 1.0F);
		this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 3, 8, 4, 0.0F);
		this.setRotateAngle(bipedLeftArm, 0.08726646259971647F, 0.0F, -0.45378560551852565F);
		this.rWing03 = new ModelRenderer(this, 42, 53);
		this.rWing03.mirror = true;
		this.rWing03.setRotationPoint(-0.1F, 0.4F, 8.0F);
		this.rWing03.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
		this.setRotateAngle(rWing03, -0.3490658503988659F, 0.0F, 0.0F);
		this.bipedBody = new ModelRenderer(this, 19, 19);
		this.bipedBody.setRotationPoint(0.0F, 2.6F, 1.5F);
		this.bipedBody.addBox(-4.0F, 0.0F, -2.5F, 8, 6, 5, 0.0F);
		this.rHorn01 = new ModelRenderer(this, 23, 0);
		this.rHorn01.mirror = true;
		this.rHorn01.setRotationPoint(-2.9F, -7.2F, -0.2F);
		this.rHorn01.addBox(-1.0F, -2.7F, -1.0F, 2, 4, 2, 0.0F);
		this.setRotateAngle(rHorn01, -0.17453292519943295F, -0.13962634015954636F, -0.40142572795869574F);
		this.torch03c = new ModelRenderer(this, 122, 6);
		this.torch03c.mirror = true;
		this.torch03c.setRotationPoint(-0.6F, -1.5F, -0.6F);
		this.torch03c.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(torch03c, 0.24434609527920614F, -0.20943951023931953F, -0.2792526803190927F);
		this.loinclothF = new ModelRenderer(this, 65, 0);
		this.loinclothF.setRotationPoint(0.0F, -0.8F, -1.8F);
		this.loinclothF.addBox(-5.0F, 0.0F, -0.5F, 10, 9, 3, 0.0F);
		this.setRotateAngle(loinclothF, -1.48352986419518F, 0.0F, 0.0F);
		this.torch03e = new ModelRenderer(this, 122, 10);
		this.torch03e.mirror = true;
		this.torch03e.setRotationPoint(-0.6F, -1.5F, 0.6F);
		this.torch03e.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(torch03e, -0.24434609527920614F, 0.13962634015954636F, -0.2792526803190927F);
		this.lHorn02c = new ModelRenderer(this, 0, 0);
		this.lHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn02c.addBox(-0.8F, -3.0F, -0.2F, 1, 3, 1, 0.0F);
		this.lLeg03 = new ModelRenderer(this, 0, 44);
		this.lLeg03.setRotationPoint(0.0F, 6.0F, 0.2F);
		this.lLeg03.addBox(-1.0F, 0.0F, -1.5F, 2, 8, 3, 0.0F);
		this.setRotateAngle(lLeg03, -0.36425021489121656F, -0.2617993877991494F, 0.40142572795869574F);
		this.boobs = new ModelRenderer(this, 57, 42);
		this.boobs.setRotationPoint(0.0F, 1.9F, -0.9F);
		this.boobs.addBox(-3.5F, 0.0F, -2.0F, 7, 3, 3, 0.0F);
		this.setRotateAngle(boobs, -0.6981317007977318F, 0.0F, 0.0F);
		this.jawUpper02 = new ModelRenderer(this, 30, 11);
		this.jawUpper02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.jawUpper02.addBox(-2.3F, -1.0F, -5.0F, 1, 2, 5, 0.0F);
		this.rHorn03a = new ModelRenderer(this, 0, 4);
		this.rHorn03a.mirror = true;
		this.rHorn03a.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.rHorn03a.addBox(-0.7F, -3.0F, -0.7F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn03a, -0.10471975511965977F, 0.0F, -0.17453292519943295F);
		this.torch02c = new ModelRenderer(this, 117, 6);
		this.torch02c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.torch02c.addBox(-0.2F, -3.8F, -0.2F, 1, 4, 1, 0.0F);
		this.rHoof = new ModelRenderer(this, 0, 55);
		this.rHoof.mirror = true;
		this.rHoof.setRotationPoint(0.0F, 7.9F, 0.0F);
		this.rHoof.addBox(-1.5F, -0.9F, -2.8F, 3, 2, 4, 0.0F);
		this.setRotateAngle(rHoof, 1.7453292519943295F, 0.0F, 0.0F);
		this.rHorn03c = new ModelRenderer(this, 0, 4);
		this.rHorn03c.mirror = true;
		this.rHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03c.addBox(-0.7F, -3.0F, -0.3F, 1, 3, 1, 0.0F);
		this.torch03c_1 = new ModelRenderer(this, 122, 10);
		this.torch03c_1.setRotationPoint(0.6F, -1.5F, 0.6F);
		this.torch03c_1.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(torch03c_1, -0.24434609527920614F, -0.20943951023931953F, 0.2792526803190927F);
		this.rLeg02 = new ModelRenderer(this, 0, 32);
		this.rLeg02.mirror = true;
		this.rLeg02.setRotationPoint(-0.5F, 7.4F, -1.7F);
		this.rLeg02.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 4, 0.0F);
		this.setRotateAngle(rLeg02, 0.6981317007977318F, 0.17453292519943295F, -1.3962634015954636F);
		this.lWingFeathers01 = new ModelRenderer(this, 78, 28);
		this.lWingFeathers01.mirror = true;
		this.lWingFeathers01.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lWingFeathers01.addBox(-0.5F, -0.6F, -11.1F, 1, 10, 18, 0.0F);
		this.setRotateAngle(lWingFeathers01, -0.17453292519943295F, 0.0F, 0.0F);
		this.lHorn03d = new ModelRenderer(this, 0, 0);
		this.lHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03d.addBox(-0.2F, -3.0F, -0.2F, 1, 3, 1, 0.0F);
		this.rWingFeathers02 = new ModelRenderer(this, 0, 65);
		this.rWingFeathers02.setRotationPoint(-0.5F, 2.3F, 0.0F);
		this.rWingFeathers02.addBox(0.0F, 2.8F, -0.7F, 1, 21, 3, 0.0F);
		this.setRotateAngle(rWingFeathers02, -0.4363323129985824F, 0.0F, 0.0F);
		this.lWing04 = new ModelRenderer(this, 51, 52);
		this.lWing04.setRotationPoint(0.0F, 8.6F, 0.2F);
		this.lWing04.addBox(-0.5F, 0.0F, -0.5F, 1, 11, 1, 0.0F);
		this.setRotateAngle(lWing04, -0.47123889803846897F, 0.0F, 0.0F);
		this.lHorn04 = new ModelRenderer(this, 4, 0);
		this.lHorn04.setRotationPoint(0.0F, -2.8F, 0.0F);
		this.lHorn04.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn04, 0.05235987755982988F, 0.0F, 0.13962634015954636F);
		this.lWing01 = new ModelRenderer(this, 43, 32);
		this.lWing01.setRotationPoint(1.8F, 2.8F, 1.4F);
		this.lWing01.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 6, 0.0F);
		this.setRotateAngle(lWing01, 0.6283185307179586F, 0.6457718232379019F, 0.0F);
		this.bipedHead.addChild(this.lEar);
		this.rLeg02.addChild(this.rLeg03);
		this.lHorn03a.addChild(this.lHorn03c);
		this.bipedLeftArm.addChild(this.lArm02);
		this.lWing03.addChild(this.lWingFeathers02c);
		this.lHorn02a.addChild(this.lHorn02b);
		this.bipedRightArm.addChild(this.rArm02);
		this.bipedBody.addChild(this.bipedRightArm);
		this.bipedHead.addChild(this.torch01);
		this.rHorn02a.addChild(this.rHorn02b);
		this.rWing01.addChild(this.rWing02);
		this.torch02a.addChild(this.torch03a);
		this.bipedHead.addChild(this.rEar);
		this.rHorn01.addChild(this.rHorn02a);
		this.lHorn04.addChild(this.lHorn05);
		this.bipedBody.addChild(this.stomach);
		this.rHorn02a.addChild(this.rHorn03d);
		this.bipedHead.addChild(this.jawLower);
		this.lWing03.addChild(this.lWingFeathers02);
		this.lWing03.addChild(this.lWingFeathers02b);
		this.rWing03.addChild(this.rWing04);
		this.rHorn03a.addChild(this.rHorn03d_1);
		this.bipedLeftLeg.addChild(this.lLeg02);
		this.rHorn03a.addChild(this.rHorn03b);
		this.bipedBody.addChild(this.bipedHead);
		this.rWing03.addChild(this.rWingFeathers02b);
		this.bipedBody.addChild(this.rWing01);
		this.lHorn02a.addChild(this.lHorn03a);
		this.bipedHead.addChild(this.lHorn01);
		this.jawLower.addChild(this.beard);
		this.lWing01.addChild(this.lWing02);
		this.rHorn02a.addChild(this.rHorn02c);
		this.bipedHead.addChild(this.snout);
		this.torch02a.addChild(this.torch02d);
		this.bipedBody.addChild(this.bipedLeftLeg);
		this.lHorn03a.addChild(this.lHorn03b);
		this.rHorn03a.addChild(this.rHorn04);
		this.torch02a.addChild(this.torch02b);
		this.stomach.addChild(this.hips);
		this.rWing02.addChild(this.rWingFeathers01);
		this.lLeg03.addChild(this.lHoof);
		this.torch03a.addChild(this.torch03b);
		this.rWing03.addChild(this.rWingFeathers02c);
		this.lHorn03a.addChild(this.lHorn03d_1);
		this.lWing02.addChild(this.lWing03);
		this.bipedBody.addChild(this.bipedRightLeg);
		this.plith01.addChild(this.plith02);
		this.loinclothF.addChild(this.loinclothF02);
		this.rHorn04.addChild(this.rHorn05);
		this.bipedHead.addChild(this.jawUpper01);
		this.torch01.addChild(this.torch02a);
		this.lHorn01.addChild(this.lHorn02a);
		this.bipedBody.addChild(this.bipedLeftArm);
		this.rWing02.addChild(this.rWing03);
		this.bipedHead.addChild(this.rHorn01);
		this.torch03a.addChild(this.torch03c);
		this.hips.addChild(this.loinclothF);
		this.torch03a.addChild(this.torch03e);
		this.lHorn02a.addChild(this.lHorn02c);
		this.lLeg02.addChild(this.lLeg03);
		this.bipedBody.addChild(this.boobs);
		this.jawUpper01.addChild(this.jawUpper02);
		this.rHorn02a.addChild(this.rHorn03a);
		this.torch02a.addChild(this.torch02c);
		this.rLeg03.addChild(this.rHoof);
		this.rHorn03a.addChild(this.rHorn03c);
		this.torch03a.addChild(this.torch03c_1);
		this.bipedRightLeg.addChild(this.rLeg02);
		this.lWing02.addChild(this.lWingFeathers01);
		this.lHorn02a.addChild(this.lHorn03d);
		this.rWing03.addChild(this.rWingFeathers02);
		this.lWing03.addChild(this.lWing04);
		this.lHorn03a.addChild(this.lHorn04);
		this.bipedBody.addChild(this.lWing01);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.plith01.render(f5);
		this.bipedBody.render(f5);
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

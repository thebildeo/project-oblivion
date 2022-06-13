package oblivion.blocks.pressure.distribution;

import oblivon.blocks.pressure.*;

public class PressureConveyor extends PressureBlock {
	// public TextureRegion bottomRegion, capRegion, arrowRegion;

	public PressureConveyor(Sting name) {
		super(name);
		rotate = true;
		acceptsHeat = outputsHeat = true;
	}

	// @Override
	// public void load() {
	// 	bottomRegion = Core.atlas.find(name + "-bottom");
	// 	capRegion = Core.atlas.find(name + "-cap");
	// 	arrowRegion = Core.atlas.find(name + "-arrow");
	// }

	public class PressureConveyorBuild extends PressureBuild {
		// @Override
		// public void updateTile() {
		// 	overPressure();
		// 	if (outputsPressure(pressureModule().pressure * pressureFlowPercent, this)) {
		// 		if (front() instanceof PressureBuild) {
		// 			transferHeat((PressureBuild) front());
		// 		}
		// 	}
		// 	subPressure(pressureModule().pressure * pressureLeakPercent, this);
		// }

		// @Override
		// public void draw() {
		// 	Draw.rect(bottomRegion, x, y, 0f);
		// 	drawPressure(OblivionPal.pressure);
		// 	Draw.rect(region, x, y, 0f);
		// 	for (int i = 0; i < 4; i++) {
		// 		Building next = nearby(i);
		// 		if (next instanceof PressureBuild && i != 0) {
		// 			if (!(((PressureBuild) next).outputsPressure(pressureModule().pressure * pressureFlowPercent, this))) {
		// 				Draw.rect(capRegion, x, y, i * 90 + rotate ? rotdeg() : 0f);
		// 			}
		// 		}				
		// 	}
		// 	if (front() instanceof PressureBuild) {
		// 		if (!(((PressureBuild) front()).acceptsPressure(pressureModule().pressure * pressureFlowPercent, this))) {
		// 			Draw.rect(capRegion, x, y, rotate ? rotdeg() : 0f);
		// 		}
		// 	}
		// 	Draw.rect(arrowRegion, x, y, rotate ? rotdeg() : 0f);
		// }
	}
}
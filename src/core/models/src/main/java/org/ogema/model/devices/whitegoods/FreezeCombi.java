/**
 * This file is part of OGEMA.
 *
 * OGEMA is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3
 * as published by the Free Software Foundation.
 *
 * OGEMA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OGEMA. If not, see <http://www.gnu.org/licenses/>.
 */
package org.ogema.model.devices.whitegoods;

import org.ogema.core.model.units.VolumeResource;
import org.ogema.model.actors.MultiSwitch;
import org.ogema.model.actors.OnOffSwitch;
import org.ogema.model.connections.ElectricityConnection;
import org.ogema.model.sensors.TemperatureSensor;
import org.ogema.model.prototypes.PhysicalElement;
import org.ogema.model.ranges.PowerRange;

/** 
 * Fridge/Freezer combination. This models devices with a cooling space and a
 * freezing space that share a common electricity generator.
 */
public interface FreezeCombi extends PhysicalElement {

	/**
	 * Switch to control when the device draws electrical power to generate cold. If the device has separate switches to
	 * control when cooling fluid is used for actual cooling another switch model should be used.
	 */
	OnOffSwitch onOffSwitch();

	/**
	 * Power setting.
	 */
	MultiSwitch setting();

	/** 
	 * Electrical electricityConnection and measurement.
	 */
	ElectricityConnection electricityConnection();

	/**
	 * Rated power.
	 */
	PowerRange ratedPower();

	/**
	 * Temperature of the cooling part of the device.
	 */
	TemperatureSensor temperatureSensorCooling();

	/**
	 * Temperature of the freezing part of the device.
	 */
	TemperatureSensor temperatureSensorFreezing();

	/**
	 * Cooling space size
	 */
	VolumeResource volumeCooling();

	/**
	 * Freezing space size
	 */
	VolumeResource volumeFreezing();
}

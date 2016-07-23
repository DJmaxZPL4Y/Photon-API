/*
 * Copyright (c) 2016 MCPhoton <http://mcphoton.org> and contributors.
 *
 * This file is part of the Photon API <https://github.com/mcphoton/Photon-API>.
 *
 * The Photon API is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The Photon API is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.mcphoton.utils;

/**
 * An EulerAngle is composed of three rotation (yaw, pitch, roll) based on three axis. Angles are in radians.
 * 
 * @author DJmaxZPLAY
 */
public class EulerAngles {

	private float yaw, pitch, roll;
	
	/**
	 * Creates an EulerAngle(0F, 0F, 0F)
	 */
	public EulerAngles() {
		this(0F, 0F, 0F);
	}
	
	/**
	 * Creates an EulerAngle with the three axis. Angles are in radians.
	 */
	public EulerAngles(float yaw, float pitch, float roll) {	
		this.yaw = yaw;
		this.pitch = pitch;
		this.roll = roll;		
	}
	
	public EulerAngles add(float yaw, float pitch, float roll) {
		this.yaw += yaw;
		this.pitch += pitch;
		this.roll += roll;
		return this;
	}
	
	public EulerAngles subtract(float yaw, float pitch, float roll) {
		this.yaw -= yaw;
		this.pitch -= pitch;
		this.roll -= roll;
		return this;
	}
	
	@Override
	public String toString() {
		return "EulerAngles(" + yaw + ", " + pitch + ", " + roll + ')';
	}	
}

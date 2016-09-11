package org.mcphoton.entity.living;

import org.mcphoton.entity.AbstractEntity;
import org.mcphoton.entity.MetadataWriter;

/**
 *
 * @author TheElectronWill
 */
public abstract class AbstractLivingEntity extends AbstractEntity implements LivingEntity {

	boolean invulnerable;
	float health;
	float pitch, yaw, headYaw;
	int airLevel, stuckArrowsNumber;

	@Override
	public boolean isInvulnerable() {
		return invulnerable;
	}

	@Override
	public void setInvulnerable(boolean invulnerable) {
		this.invulnerable = invulnerable;
	}

	@Override
	public float getHealth() {
		return health;
	}

	@Override
	public void setHealth(float health) {
		this.health = health;
	}

	@Override
	public void damage(float damage) {
		this.health -= damage;
	}

	@Override
	public void kill() {
		this.health = 0;
	}

	@Override
	public int getAirLevel() {
		return airLevel;
	}

	@Override
	public void setAirLevel(int level) {
		this.airLevel = level;
	}

	@Override
	public int getMaxAirLevel() {
		return 300;
	}

	@Override
	public int getStuckArrowsNumber() {
		return stuckArrowsNumber;
	}

	@Override
	public void setStuckArrowsNumber(int stucksArrowsNumber) {
		this.stuckArrowsNumber = stucksArrowsNumber;
	}

	@Override
	public float getPitch() {
		return pitch;
	}

	@Override
	public void setPitch(float pitch) {
		this.pitch = pitch;
	}

	@Override
	public float getYaw() {
		return yaw;
	}

	@Override
	public void setYaw(float yaw) {
		this.yaw = yaw;
	}

	@Override
	public float getHeadYaw() {
		return headYaw;
	}

	@Override
	public void setHeadYaw(float headYaw) {
		this.headYaw = headYaw;
	}

	@Override
	public void writeMetadata(MetadataWriter writer) {
		super.writeMetadata(writer);
		writer.writeVarInt(1, airLevel);
		writer.writeByte(6, 0);// hand inactive
		writer.writeFloat(7, health);
		//TODO 8: potion effect (for the color)
		//TODO 9: is potion effect ambient
		writer.writeVarInt(10, stuckArrowsNumber);
	}

}

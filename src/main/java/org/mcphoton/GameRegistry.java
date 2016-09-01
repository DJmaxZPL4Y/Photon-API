package org.mcphoton;

import org.mcphoton.block.BlockType;
import org.mcphoton.entity.EntityType;
import org.mcphoton.item.ItemType;

/**
 * Registry for items, blocks and entities.
 *
 * @author TheElectronWill
 */
public interface GameRegistry {

	// -------- Blocks --------
	/**
	 * Registers a BlockType. The id is determined automatically.
	 *
	 * @param type the type to register.
	 * @return the registered id.
	 */
	int registerBlock(BlockType type);

	/**
	 * Registers a block type with the specified id.
	 *
	 * @param type the type to register.
	 * @param id the type's id.
	 */
	void registerBlock(BlockType type, int id);

	/**
	 * Gets the BlockType registered with the specified id.
	 *
	 * @param id the type's id (without metadata).
	 * @return the corresponding BlockType, or null if not found.
	 */
	BlockType getRegisteredBlock(int id);

	/**
	 * Gets the BlockType registered with the specified name.
	 *
	 * @param id the type's name.
	 * @return the corresponding BlockType, or null if not found.
	 */
	BlockType getRegisteredBlock(String name);

	/**
	 * Checks if there is a BlockType registered with the specified id.
	 *
	 * @param id the type's id.
	 * @return true if there is a BlockType with that id, false otherwise.
	 */
	boolean isBlockRegistered(int id);

	/**
	 * Checks if there is a BlockType registered with the specified name.
	 *
	 * @param name the type's name.
	 * @return true if there is a BlockType with that name, false otherwise.
	 */
	boolean isBlockRegistered(String name);

	// -------- Items --------
	/**
	 * Registers an ItemType. The id is determined automatically.
	 *
	 * @param type the type to register.
	 * @return the registered id.
	 */
	int registerItem(ItemType type);

	/**
	 * Registers a ItemType with the specified id.
	 *
	 * @param type the type to register.
	 * @param id the type's id.
	 */
	void registerItem(ItemType type, int id);

	/**
	 * Gets the ItemType registered with the specified id.
	 *
	 * @param id the type's id (without damage value).
	 * @return the corresponding ItemType, or null if not found.
	 */
	ItemType getRegisteredItem(int id);

	/**
	 * Gets the ItemType registered with the specified name.
	 *
	 * @param id the type's name.
	 * @return the corresponding ItemType, or null if not found.
	 */
	ItemType getRegisteredItem(String name);

	/**
	 * Checks if there is a ItemType registered with the specified id.
	 *
	 * @param id the type's id.
	 * @return true if there is a ItemType with that id, false otherwise.
	 */
	boolean isItemRegistered(int id);

	/**
	 * Checks if there is a ItemType registered with the specified name.
	 *
	 * @param name the type's name.
	 * @return true if there is a ItemType with that name, false otherwise.
	 */
	boolean isItemRegistered(String name);

	// -------- Entities --------
	/**
	 * Registers an EntityType. The id is determined automatically.
	 *
	 * @param type the type to register.
	 * @return the registered id.
	 */
	int registerEntity(EntityType type);

	/**
	 * Registers a EntityType with the specified id.
	 *
	 * @param type the type to register.
	 * @param id the type's id.
	 */
	void registerEntity(EntityType type, int id);

	/**
	 * Gets the EntityType registered with the specified id.
	 *
	 * @param id the type's id.
	 * @return the corresponding EntityType, or null if not found.
	 */
	EntityType getRegisteredEntity(int id);

	/**
	 * Gets the EntityType registered with the specified name.
	 *
	 * @param id the type's name.
	 * @return the corresponding EntityType, or null if not found.
	 */
	EntityType getRegisteredEntity(String name);

	/**
	 * Checks if there is a EntityType registered with the specified id.
	 *
	 * @param id the type's id.
	 * @return true if there is a EntityType with that id, false otherwise.
	 */
	boolean isEntityRegistered(int id);

	/**
	 * Checks if there is a EntityType registered with the specified name.
	 *
	 * @param name the type's name.
	 * @return true if there is a EntityType with that name, false otherwise.
	 */
	boolean isEntityRegistered(String name);

}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresources.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.aetheriumresources.block.entity.AmethystMachineBlockEntity;
import net.mcreator.aetheriumresources.AetheriumresourcesMod;

public class AetheriumresourcesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			AetheriumresourcesMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> AMETHYST_MACHINE = register("amethyst_machine",
			AetheriumresourcesModBlocks.AMETHYST_MACHINE, AmethystMachineBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}

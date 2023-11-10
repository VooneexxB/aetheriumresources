
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresources.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.aetheriumresources.block.entity.TwistedBushStage3BlockEntity;
import net.mcreator.aetheriumresources.block.entity.TwistedBushStage2BlockEntity;
import net.mcreator.aetheriumresources.block.entity.TwistedBushStage1BlockEntity;
import net.mcreator.aetheriumresources.block.entity.TwistedBushStage0BlockEntity;
import net.mcreator.aetheriumresources.block.entity.MicroscopioBlockEntity;
import net.mcreator.aetheriumresources.block.entity.DarkCarrotStage3BlockEntity;
import net.mcreator.aetheriumresources.block.entity.DarkCarrotStage2BlockEntity;
import net.mcreator.aetheriumresources.block.entity.DarkCarrotStage1BlockEntity;
import net.mcreator.aetheriumresources.block.entity.DarkCarrotStage0BlockEntity;
import net.mcreator.aetheriumresources.block.entity.AmethystPurifierBlockEntity;
import net.mcreator.aetheriumresources.AetheriumresourcesMod;

public class AetheriumresourcesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			AetheriumresourcesMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> MICROSCOPIO = register("microscopio", AetheriumresourcesModBlocks.MICROSCOPIO,
			MicroscopioBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_CARROT_STAGE_0 = register("dark_carrot_stage_0",
			AetheriumresourcesModBlocks.DARK_CARROT_STAGE_0, DarkCarrotStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_CARROT_STAGE_1 = register("dark_carrot_stage_1",
			AetheriumresourcesModBlocks.DARK_CARROT_STAGE_1, DarkCarrotStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_CARROT_STAGE_2 = register("dark_carrot_stage_2",
			AetheriumresourcesModBlocks.DARK_CARROT_STAGE_2, DarkCarrotStage2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_CARROT_STAGE_3 = register("dark_carrot_stage_3",
			AetheriumresourcesModBlocks.DARK_CARROT_STAGE_3, DarkCarrotStage3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TWISTED_BUSH_STAGE_0 = register("twisted_bush_stage_0",
			AetheriumresourcesModBlocks.TWISTED_BUSH_STAGE_0, TwistedBushStage0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TWISTED_BUSH_STAGE_1 = register("twisted_bush_stage_1",
			AetheriumresourcesModBlocks.TWISTED_BUSH_STAGE_1, TwistedBushStage1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TWISTED_BUSH_STAGE_2 = register("twisted_bush_stage_2",
			AetheriumresourcesModBlocks.TWISTED_BUSH_STAGE_2, TwistedBushStage2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TWISTED_BUSH_STAGE_3 = register("twisted_bush_stage_3",
			AetheriumresourcesModBlocks.TWISTED_BUSH_STAGE_3, TwistedBushStage3BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> AMETHYST_PURIFIER = register("amethyst_purifier",
			AetheriumresourcesModBlocks.AMETHYST_PURIFIER, AmethystPurifierBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresources.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.aetheriumresources.block.TwistedMatterBlock;
import net.mcreator.aetheriumresources.block.TwistedGrassBlock;
import net.mcreator.aetheriumresources.block.TwistedForestWoodBlock;
import net.mcreator.aetheriumresources.block.TwistedForestLogBlock;
import net.mcreator.aetheriumresources.block.StrippedDarkMatterForestLogBlock;
import net.mcreator.aetheriumresources.block.PolishedDarkMatterWallBlock;
import net.mcreator.aetheriumresources.block.PolishedDarkMatterStairsBlock;
import net.mcreator.aetheriumresources.block.PolishedDarkMatterSlabBlock;
import net.mcreator.aetheriumresources.block.PolishedDarkMatterBlock;
import net.mcreator.aetheriumresources.block.FailureDecorativoBlock;
import net.mcreator.aetheriumresources.block.ErrorDecorativoBlock;
import net.mcreator.aetheriumresources.block.ErrorBlock;
import net.mcreator.aetheriumresources.block.Error2Block;
import net.mcreator.aetheriumresources.block.EnrichedDarkMatterBlock;
import net.mcreator.aetheriumresources.block.DarkmattertileswallsBlock;
import net.mcreator.aetheriumresources.block.DarkmattertilesslabBlock;
import net.mcreator.aetheriumresources.block.DarkmatterbrickswallBlock;
import net.mcreator.aetheriumresources.block.DarkmatterbricksstairsBlock;
import net.mcreator.aetheriumresources.block.DarkmatterbricksslabBlock;
import net.mcreator.aetheriumresources.block.DarkmatterBlock;
import net.mcreator.aetheriumresources.block.DarkgrassBlock;
import net.mcreator.aetheriumresources.block.DarkMatterTilesStairsBlock;
import net.mcreator.aetheriumresources.block.DarkMatterTilesBlock;
import net.mcreator.aetheriumresources.block.DarkMatterGemBlockBlock;
import net.mcreator.aetheriumresources.block.DarkMatterForestWoodBlock;
import net.mcreator.aetheriumresources.block.DarkMatterForestStairsBlock;
import net.mcreator.aetheriumresources.block.DarkMatterForestSlabBlock;
import net.mcreator.aetheriumresources.block.DarkMatterForestPressurePlateBlock;
import net.mcreator.aetheriumresources.block.DarkMatterForestPlanksBlock;
import net.mcreator.aetheriumresources.block.DarkMatterForestLogBlock;
import net.mcreator.aetheriumresources.block.DarkMatterForestLeavesBlock;
import net.mcreator.aetheriumresources.block.DarkMatterForestFenceGateBlock;
import net.mcreator.aetheriumresources.block.DarkMatterForestFenceBlock;
import net.mcreator.aetheriumresources.block.DarkMatterForestButtonBlock;
import net.mcreator.aetheriumresources.block.DarkMatterBricksBlock;
import net.mcreator.aetheriumresources.block.DarkForestPlanksTrapdoorBlock;
import net.mcreator.aetheriumresources.block.DarkForestPlanksDoorBlock;
import net.mcreator.aetheriumresources.block.ChiseledDarkMatterBlock;
import net.mcreator.aetheriumresources.block.BORDERPortalBlock;
import net.mcreator.aetheriumresources.block.AmethystMachineBlock;
import net.mcreator.aetheriumresources.block.AaBlock;
import net.mcreator.aetheriumresources.AetheriumresourcesMod;

public class AetheriumresourcesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AetheriumresourcesMod.MODID);
	public static final RegistryObject<Block> ERROR = REGISTRY.register("error", () -> new ErrorBlock());
	public static final RegistryObject<Block> ERROR_2 = REGISTRY.register("error_2", () -> new Error2Block());
	public static final RegistryObject<Block> ERROR_DECORATIVO = REGISTRY.register("error_decorativo", () -> new ErrorDecorativoBlock());
	public static final RegistryObject<Block> FAILURE_DECORATIVO = REGISTRY.register("failure_decorativo", () -> new FailureDecorativoBlock());
	public static final RegistryObject<Block> ENRICHED_DARK_MATTER = REGISTRY.register("enriched_dark_matter", () -> new EnrichedDarkMatterBlock());
	public static final RegistryObject<Block> DARKGRASS = REGISTRY.register("darkgrass", () -> new DarkgrassBlock());
	public static final RegistryObject<Block> DARKMATTER = REGISTRY.register("darkmatter", () -> new DarkmatterBlock());
	public static final RegistryObject<Block> DARK_MATTER_BRICKS = REGISTRY.register("dark_matter_bricks", () -> new DarkMatterBricksBlock());
	public static final RegistryObject<Block> DARKMATTERBRICKSSTAIRS = REGISTRY.register("darkmatterbricksstairs",
			() -> new DarkmatterbricksstairsBlock());
	public static final RegistryObject<Block> DARKMATTERBRICKSSLAB = REGISTRY.register("darkmatterbricksslab", () -> new DarkmatterbricksslabBlock());
	public static final RegistryObject<Block> DARKMATTERBRICKSWALL = REGISTRY.register("darkmatterbrickswall", () -> new DarkmatterbrickswallBlock());
	public static final RegistryObject<Block> DARK_MATTER_TILES = REGISTRY.register("dark_matter_tiles", () -> new DarkMatterTilesBlock());
	public static final RegistryObject<Block> DARK_MATTER_TILES_STAIRS = REGISTRY.register("dark_matter_tiles_stairs",
			() -> new DarkMatterTilesStairsBlock());
	public static final RegistryObject<Block> DARKMATTERTILESSLAB = REGISTRY.register("darkmattertilesslab", () -> new DarkmattertilesslabBlock());
	public static final RegistryObject<Block> DARKMATTERTILESWALLS = REGISTRY.register("darkmattertileswalls", () -> new DarkmattertileswallsBlock());
	public static final RegistryObject<Block> POLISHED_DARK_MATTER = REGISTRY.register("polished_dark_matter", () -> new PolishedDarkMatterBlock());
	public static final RegistryObject<Block> POLISHED_DARK_MATTER_STAIRS = REGISTRY.register("polished_dark_matter_stairs",
			() -> new PolishedDarkMatterStairsBlock());
	public static final RegistryObject<Block> POLISHED_DARK_MATTER_SLAB = REGISTRY.register("polished_dark_matter_slab",
			() -> new PolishedDarkMatterSlabBlock());
	public static final RegistryObject<Block> POLISHED_DARK_MATTER_WALL = REGISTRY.register("polished_dark_matter_wall",
			() -> new PolishedDarkMatterWallBlock());
	public static final RegistryObject<Block> CHISELED_DARK_MATTER = REGISTRY.register("chiseled_dark_matter", () -> new ChiseledDarkMatterBlock());
	public static final RegistryObject<Block> DARK_MATTER_FOREST_WOOD = REGISTRY.register("dark_matter_forest_wood",
			() -> new DarkMatterForestWoodBlock());
	public static final RegistryObject<Block> DARK_MATTER_FOREST_LOG = REGISTRY.register("dark_matter_forest_log",
			() -> new DarkMatterForestLogBlock());
	public static final RegistryObject<Block> STRIPPED_DARK_MATTER_FOREST_LOG = REGISTRY.register("stripped_dark_matter_forest_log",
			() -> new StrippedDarkMatterForestLogBlock());
	public static final RegistryObject<Block> DARK_MATTER_FOREST_PLANKS = REGISTRY.register("dark_matter_forest_planks",
			() -> new DarkMatterForestPlanksBlock());
	public static final RegistryObject<Block> DARK_MATTER_FOREST_LEAVES = REGISTRY.register("dark_matter_forest_leaves",
			() -> new DarkMatterForestLeavesBlock());
	public static final RegistryObject<Block> DARK_MATTER_FOREST_STAIRS = REGISTRY.register("dark_matter_forest_stairs",
			() -> new DarkMatterForestStairsBlock());
	public static final RegistryObject<Block> DARK_MATTER_FOREST_SLAB = REGISTRY.register("dark_matter_forest_slab",
			() -> new DarkMatterForestSlabBlock());
	public static final RegistryObject<Block> DARK_FOREST_PLANKS_TRAPDOOR = REGISTRY.register("dark_forest_planks_trapdoor",
			() -> new DarkForestPlanksTrapdoorBlock());
	public static final RegistryObject<Block> DARK_MATTER_FOREST_FENCE = REGISTRY.register("dark_matter_forest_fence",
			() -> new DarkMatterForestFenceBlock());
	public static final RegistryObject<Block> DARK_MATTER_FOREST_FENCE_GATE = REGISTRY.register("dark_matter_forest_fence_gate",
			() -> new DarkMatterForestFenceGateBlock());
	public static final RegistryObject<Block> DARK_FOREST_PLANKS_DOOR = REGISTRY.register("dark_forest_planks_door",
			() -> new DarkForestPlanksDoorBlock());
	public static final RegistryObject<Block> DARK_MATTER_FOREST_PRESSURE_PLATE = REGISTRY.register("dark_matter_forest_pressure_plate",
			() -> new DarkMatterForestPressurePlateBlock());
	public static final RegistryObject<Block> DARK_MATTER_FOREST_BUTTON = REGISTRY.register("dark_matter_forest_button",
			() -> new DarkMatterForestButtonBlock());
	public static final RegistryObject<Block> AMETHYST_MACHINE = REGISTRY.register("amethyst_machine", () -> new AmethystMachineBlock());
	public static final RegistryObject<Block> EGGBED = REGISTRY.register("eggbed", () -> new AaBlock());
	public static final RegistryObject<Block> DARK_MATTER_GEM_BLOCK = REGISTRY.register("dark_matter_gem_block", () -> new DarkMatterGemBlockBlock());
	public static final RegistryObject<Block> BORDER_PORTAL = REGISTRY.register("border_portal", () -> new BORDERPortalBlock());
	public static final RegistryObject<Block> TWISTED_MATTER = REGISTRY.register("twisted_matter", () -> new TwistedMatterBlock());
	public static final RegistryObject<Block> TWISTED_GRASS = REGISTRY.register("twisted_grass", () -> new TwistedGrassBlock());
	public static final RegistryObject<Block> TWISTED_FOREST_LOG = REGISTRY.register("twisted_forest_log", () -> new TwistedForestLogBlock());
	public static final RegistryObject<Block> TWISTED_FOREST_WOOD = REGISTRY.register("twisted_forest_wood", () -> new TwistedForestWoodBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			FailureDecorativoBlock.registerRenderLayer();
			DarkgrassBlock.registerRenderLayer();
			DarkMatterForestLeavesBlock.registerRenderLayer();
			DarkForestPlanksTrapdoorBlock.registerRenderLayer();
			DarkForestPlanksDoorBlock.registerRenderLayer();
			DarkMatterForestButtonBlock.registerRenderLayer();
			AaBlock.registerRenderLayer();
			BORDERPortalBlock.registerRenderLayer();
			TwistedGrassBlock.registerRenderLayer();
		}
	}
}

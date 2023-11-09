
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

import net.mcreator.aetheriumresources.block.TwistedmatterunderwaterBlock;
import net.mcreator.aetheriumresources.block.TwistedTrapdoorBlock;
import net.mcreator.aetheriumresources.block.TwistedMatterTilesWallBlock;
import net.mcreator.aetheriumresources.block.TwistedMatterTilesStairsBlock;
import net.mcreator.aetheriumresources.block.TwistedMatterTilesSlabBlock;
import net.mcreator.aetheriumresources.block.TwistedMatterTilesBlock;
import net.mcreator.aetheriumresources.block.TwistedMatterGemBlockBlock;
import net.mcreator.aetheriumresources.block.TwistedMatterFarmlandBlock;
import net.mcreator.aetheriumresources.block.TwistedMatterBricksWallBlock;
import net.mcreator.aetheriumresources.block.TwistedMatterBricksStairsBlock;
import net.mcreator.aetheriumresources.block.TwistedMatterBricksSlabBlock;
import net.mcreator.aetheriumresources.block.TwistedMatterBricksBlock;
import net.mcreator.aetheriumresources.block.TwistedMatterBlock;
import net.mcreator.aetheriumresources.block.TwistedGrassBlock;
import net.mcreator.aetheriumresources.block.TwistedForestWoodBlock;
import net.mcreator.aetheriumresources.block.TwistedForestStairsBlock;
import net.mcreator.aetheriumresources.block.TwistedForestSlabBlock;
import net.mcreator.aetheriumresources.block.TwistedForestPressurePlateBlock;
import net.mcreator.aetheriumresources.block.TwistedForestPlanksBlock;
import net.mcreator.aetheriumresources.block.TwistedForestLogBlock;
import net.mcreator.aetheriumresources.block.TwistedForestLeavesBlock;
import net.mcreator.aetheriumresources.block.TwistedForestFenceGateBlock;
import net.mcreator.aetheriumresources.block.TwistedForestFenceBlock;
import net.mcreator.aetheriumresources.block.TwistedForestDoorBlock;
import net.mcreator.aetheriumresources.block.TwistedForestButtonBlock;
import net.mcreator.aetheriumresources.block.StrippedTwistedForestWoodBlock;
import net.mcreator.aetheriumresources.block.StrippedTwistedForestLogBlock;
import net.mcreator.aetheriumresources.block.StrippedDarkMatterForestWoodBlock;
import net.mcreator.aetheriumresources.block.StrippedDarkMatterForestLogBlock;
import net.mcreator.aetheriumresources.block.PolishedTwistedMatterWallBlock;
import net.mcreator.aetheriumresources.block.PolishedTwistedMatterStairsBlock;
import net.mcreator.aetheriumresources.block.PolishedTwistedMatterSlabBlock;
import net.mcreator.aetheriumresources.block.PolishedTwistedMatterBlock;
import net.mcreator.aetheriumresources.block.PolishedDarkMatterWallBlock;
import net.mcreator.aetheriumresources.block.PolishedDarkMatterStairsBlock;
import net.mcreator.aetheriumresources.block.PolishedDarkMatterSlabBlock;
import net.mcreator.aetheriumresources.block.PolishedDarkMatterBlock;
import net.mcreator.aetheriumresources.block.MicroscopioBlock;
import net.mcreator.aetheriumresources.block.FailureDecorativoBlock;
import net.mcreator.aetheriumresources.block.ErrorDecorativoBlock;
import net.mcreator.aetheriumresources.block.ErrorBlock;
import net.mcreator.aetheriumresources.block.Error2Block;
import net.mcreator.aetheriumresources.block.EnrichedTwistedMatterBlock;
import net.mcreator.aetheriumresources.block.EnrichedDarkMatterBlock;
import net.mcreator.aetheriumresources.block.DarkmattertileswallsBlock;
import net.mcreator.aetheriumresources.block.DarkmattertilesslabBlock;
import net.mcreator.aetheriumresources.block.DarkmatterbrickswallBlock;
import net.mcreator.aetheriumresources.block.DarkmatterbricksstairsBlock;
import net.mcreator.aetheriumresources.block.DarkmatterbricksslabBlock;
import net.mcreator.aetheriumresources.block.DarkmatterUnderwaterBlock;
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
import net.mcreator.aetheriumresources.block.DarkMatterFarmlandBlock;
import net.mcreator.aetheriumresources.block.DarkMatterBricksBlock;
import net.mcreator.aetheriumresources.block.DarkForestPlanksTrapdoorBlock;
import net.mcreator.aetheriumresources.block.DarkForestPlanksDoorBlock;
import net.mcreator.aetheriumresources.block.DarkCarrotStage3Block;
import net.mcreator.aetheriumresources.block.DarkCarrotStage2Block;
import net.mcreator.aetheriumresources.block.DarkCarrotStage1Block;
import net.mcreator.aetheriumresources.block.DarkCarrotStage0Block;
import net.mcreator.aetheriumresources.block.ChiseledDarkMatterBlock;
import net.mcreator.aetheriumresources.block.BlocoAmetistaPurificadaBlock;
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
	public static final RegistryObject<Block> STRIPPED_DARK_MATTER_FOREST_WOOD = REGISTRY.register("stripped_dark_matter_forest_wood",
			() -> new StrippedDarkMatterForestWoodBlock());
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
	public static final RegistryObject<Block> TWISTED_MATTER = REGISTRY.register("twisted_matter", () -> new TwistedMatterBlock());
	public static final RegistryObject<Block> TWISTED_GRASS = REGISTRY.register("twisted_grass", () -> new TwistedGrassBlock());
	public static final RegistryObject<Block> TWISTED_FOREST_LOG = REGISTRY.register("twisted_forest_log", () -> new TwistedForestLogBlock());
	public static final RegistryObject<Block> TWISTED_FOREST_WOOD = REGISTRY.register("twisted_forest_wood", () -> new TwistedForestWoodBlock());
	public static final RegistryObject<Block> STRIPPED_TWISTED_FOREST_LOG = REGISTRY.register("stripped_twisted_forest_log",
			() -> new StrippedTwistedForestLogBlock());
	public static final RegistryObject<Block> STRIPPED_TWISTED_FOREST_WOOD = REGISTRY.register("stripped_twisted_forest_wood",
			() -> new StrippedTwistedForestWoodBlock());
	public static final RegistryObject<Block> TWISTED_FOREST_PLANKS = REGISTRY.register("twisted_forest_planks",
			() -> new TwistedForestPlanksBlock());
	public static final RegistryObject<Block> TWISTED_FOREST_STAIRS = REGISTRY.register("twisted_forest_stairs",
			() -> new TwistedForestStairsBlock());
	public static final RegistryObject<Block> TWISTED_FOREST_SLAB = REGISTRY.register("twisted_forest_slab", () -> new TwistedForestSlabBlock());
	public static final RegistryObject<Block> TWISTED_FOREST_FENCE = REGISTRY.register("twisted_forest_fence", () -> new TwistedForestFenceBlock());
	public static final RegistryObject<Block> AMETHYST_MACHINE = REGISTRY.register("amethyst_machine", () -> new AmethystMachineBlock());
	public static final RegistryObject<Block> EGGBED = REGISTRY.register("eggbed", () -> new AaBlock());
	public static final RegistryObject<Block> DARK_MATTER_GEM_BLOCK = REGISTRY.register("dark_matter_gem_block", () -> new DarkMatterGemBlockBlock());
	public static final RegistryObject<Block> BORDER_PORTAL = REGISTRY.register("border_portal", () -> new BORDERPortalBlock());
	public static final RegistryObject<Block> TWISTED_FOREST_LEAVES = REGISTRY.register("twisted_forest_leaves",
			() -> new TwistedForestLeavesBlock());
	public static final RegistryObject<Block> TWISTED_FOREST_FENCE_GATE = REGISTRY.register("twisted_forest_fence_gate",
			() -> new TwistedForestFenceGateBlock());
	public static final RegistryObject<Block> TWISTED_FOREST_PRESSURE_PLATE = REGISTRY.register("twisted_forest_pressure_plate",
			() -> new TwistedForestPressurePlateBlock());
	public static final RegistryObject<Block> TWISTED_FOREST_BUTTON = REGISTRY.register("twisted_forest_button",
			() -> new TwistedForestButtonBlock());
	public static final RegistryObject<Block> TWISTED_TRAPDOOR = REGISTRY.register("twisted_trapdoor", () -> new TwistedTrapdoorBlock());
	public static final RegistryObject<Block> TWISTED_FOREST_DOOR = REGISTRY.register("twisted_forest_door", () -> new TwistedForestDoorBlock());
	public static final RegistryObject<Block> TWISTED_MATTER_BRICKS = REGISTRY.register("twisted_matter_bricks",
			() -> new TwistedMatterBricksBlock());
	public static final RegistryObject<Block> TWISTED_MATTER_BRICKS_SLAB = REGISTRY.register("twisted_matter_bricks_slab",
			() -> new TwistedMatterBricksSlabBlock());
	public static final RegistryObject<Block> TWISTED_MATTER_BRICKS_WALL = REGISTRY.register("twisted_matter_bricks_wall",
			() -> new TwistedMatterBricksWallBlock());
	public static final RegistryObject<Block> TWISTED_MATTER_BRICKS_STAIRS = REGISTRY.register("twisted_matter_bricks_stairs",
			() -> new TwistedMatterBricksStairsBlock());
	public static final RegistryObject<Block> TWISTED_MATTER_TILES = REGISTRY.register("twisted_matter_tiles", () -> new TwistedMatterTilesBlock());
	public static final RegistryObject<Block> TWISTED_MATTER_TILES_SLAB = REGISTRY.register("twisted_matter_tiles_slab",
			() -> new TwistedMatterTilesSlabBlock());
	public static final RegistryObject<Block> TWISTED_MATTER_TILES_WALL = REGISTRY.register("twisted_matter_tiles_wall",
			() -> new TwistedMatterTilesWallBlock());
	public static final RegistryObject<Block> TWISTED_MATTER_TILES_STAIRS = REGISTRY.register("twisted_matter_tiles_stairs",
			() -> new TwistedMatterTilesStairsBlock());
	public static final RegistryObject<Block> POLISHED_TWISTED_MATTER = REGISTRY.register("polished_twisted_matter",
			() -> new PolishedTwistedMatterBlock());
	public static final RegistryObject<Block> POLISHED_TWISTED_MATTER_SLAB = REGISTRY.register("polished_twisted_matter_slab",
			() -> new PolishedTwistedMatterSlabBlock());
	public static final RegistryObject<Block> POLISHED_TWISTED_MATTER_WALL = REGISTRY.register("polished_twisted_matter_wall",
			() -> new PolishedTwistedMatterWallBlock());
	public static final RegistryObject<Block> POLISHED_TWISTED_MATTER_STAIRS = REGISTRY.register("polished_twisted_matter_stairs",
			() -> new PolishedTwistedMatterStairsBlock());
	public static final RegistryObject<Block> BLOCO_AMETISTA_PURIFICADA = REGISTRY.register("bloco_ametista_purificada",
			() -> new BlocoAmetistaPurificadaBlock());
	public static final RegistryObject<Block> MICROSCOPIO = REGISTRY.register("microscopio", () -> new MicroscopioBlock());
	public static final RegistryObject<Block> ENRICHED_TWISTED_MATTER = REGISTRY.register("enriched_twisted_matter",
			() -> new EnrichedTwistedMatterBlock());
	public static final RegistryObject<Block> TWISTED_MATTER_GEM_BLOCK = REGISTRY.register("twisted_matter_gem_block",
			() -> new TwistedMatterGemBlockBlock());
	public static final RegistryObject<Block> DARK_CARROT_STAGE_0 = REGISTRY.register("dark_carrot_stage_0", () -> new DarkCarrotStage0Block());
	public static final RegistryObject<Block> DARK_CARROT_STAGE_1 = REGISTRY.register("dark_carrot_stage_1", () -> new DarkCarrotStage1Block());
	public static final RegistryObject<Block> DARK_CARROT_STAGE_2 = REGISTRY.register("dark_carrot_stage_2", () -> new DarkCarrotStage2Block());
	public static final RegistryObject<Block> DARK_CARROT_STAGE_3 = REGISTRY.register("dark_carrot_stage_3", () -> new DarkCarrotStage3Block());
	public static final RegistryObject<Block> DARK_MATTER_FARMLAND = REGISTRY.register("dark_matter_farmland", () -> new DarkMatterFarmlandBlock());
	public static final RegistryObject<Block> TWISTED_MATTER_FARMLAND = REGISTRY.register("twisted_matter_farmland",
			() -> new TwistedMatterFarmlandBlock());
	public static final RegistryObject<Block> TWISTEDMATTERUNDERWATER = REGISTRY.register("twistedmatterunderwater",
			() -> new TwistedmatterunderwaterBlock());
	public static final RegistryObject<Block> DARKMATTER_UNDERWATER = REGISTRY.register("darkmatter_underwater",
			() -> new DarkmatterUnderwaterBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			FailureDecorativoBlock.registerRenderLayer();
			DarkgrassBlock.registerRenderLayer();
			DarkForestPlanksTrapdoorBlock.registerRenderLayer();
			DarkForestPlanksDoorBlock.registerRenderLayer();
			DarkMatterForestButtonBlock.registerRenderLayer();
			TwistedGrassBlock.registerRenderLayer();
			AaBlock.registerRenderLayer();
			BORDERPortalBlock.registerRenderLayer();
			TwistedTrapdoorBlock.registerRenderLayer();
			MicroscopioBlock.registerRenderLayer();
			DarkCarrotStage0Block.registerRenderLayer();
			DarkCarrotStage1Block.registerRenderLayer();
			DarkCarrotStage2Block.registerRenderLayer();
			DarkCarrotStage3Block.registerRenderLayer();
			DarkMatterFarmlandBlock.registerRenderLayer();
			TwistedMatterFarmlandBlock.registerRenderLayer();
		}
	}
}

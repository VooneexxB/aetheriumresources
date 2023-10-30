
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

import net.mcreator.aetheriumresources.block.ParasitematterBlock;
import net.mcreator.aetheriumresources.block.FailureDecorativoBlock;
import net.mcreator.aetheriumresources.block.ErrorDecorativoBlock;
import net.mcreator.aetheriumresources.block.ErrorBlock;
import net.mcreator.aetheriumresources.block.Error2Block;
import net.mcreator.aetheriumresources.block.DarkmatterBlock;
import net.mcreator.aetheriumresources.block.DarkgrassBlock;
import net.mcreator.aetheriumresources.block.BORDERPortalBlock;
import net.mcreator.aetheriumresources.block.AmethystMachineBlock;
import net.mcreator.aetheriumresources.block.AaBlock;
import net.mcreator.aetheriumresources.AetheriumresourcesMod;

public class AetheriumresourcesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AetheriumresourcesMod.MODID);
	public static final RegistryObject<Block> ERROR = REGISTRY.register("error", () -> new ErrorBlock());
	public static final RegistryObject<Block> ERROR_2 = REGISTRY.register("error_2", () -> new Error2Block());
	public static final RegistryObject<Block> EGGBED = REGISTRY.register("eggbed", () -> new AaBlock());
	public static final RegistryObject<Block> ERROR_DECORATIVO = REGISTRY.register("error_decorativo", () -> new ErrorDecorativoBlock());
	public static final RegistryObject<Block> FAILURE_DECORATIVO = REGISTRY.register("failure_decorativo", () -> new FailureDecorativoBlock());
	public static final RegistryObject<Block> AMETHYST_MACHINE = REGISTRY.register("amethyst_machine", () -> new AmethystMachineBlock());
	public static final RegistryObject<Block> DARKMATTER = REGISTRY.register("darkmatter", () -> new DarkmatterBlock());
	public static final RegistryObject<Block> BORDER_PORTAL = REGISTRY.register("border_portal", () -> new BORDERPortalBlock());
	public static final RegistryObject<Block> DARKGRASS = REGISTRY.register("darkgrass", () -> new DarkgrassBlock());
	public static final RegistryObject<Block> PARASITEMATTER = REGISTRY.register("parasitematter", () -> new ParasitematterBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			AaBlock.registerRenderLayer();
			FailureDecorativoBlock.registerRenderLayer();
			BORDERPortalBlock.registerRenderLayer();
			DarkgrassBlock.registerRenderLayer();
		}
	}
}

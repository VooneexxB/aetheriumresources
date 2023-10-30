
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.aetheriumresources.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.aetheriumresources.item.ThunderstormItem;
import net.mcreator.aetheriumresources.item.SimulacraItem;
import net.mcreator.aetheriumresources.item.SeringadesangueItem;
import net.mcreator.aetheriumresources.item.SeringaItem;
import net.mcreator.aetheriumresources.item.SeringaGlitchItem;
import net.mcreator.aetheriumresources.item.SeringaAntidotoItem;
import net.mcreator.aetheriumresources.item.RealitymisfortuneItem;
import net.mcreator.aetheriumresources.item.ParasiteMatterPiecesItem;
import net.mcreator.aetheriumresources.item.PARASYTEItem;
import net.mcreator.aetheriumresources.item.MateriaorganicaItem;
import net.mcreator.aetheriumresources.item.GlitchytaleItem;
import net.mcreator.aetheriumresources.item.Disco3Item;
import net.mcreator.aetheriumresources.item.Disco2Item;
import net.mcreator.aetheriumresources.item.BloodySkyItem;
import net.mcreator.aetheriumresources.item.BORDERItem;
import net.mcreator.aetheriumresources.AetheriumresourcesMod;

public class AetheriumresourcesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AetheriumresourcesMod.MODID);
	public static final RegistryObject<Item> ERROR = block(AetheriumresourcesModBlocks.ERROR, AetheriumresourcesModTabs.TAB_AETHERIUM_TAB);
	public static final RegistryObject<Item> GLITCHYTALE = REGISTRY.register("glitchytale", () -> new GlitchytaleItem());
	public static final RegistryObject<Item> ERROR_2 = block(AetheriumresourcesModBlocks.ERROR_2, AetheriumresourcesModTabs.TAB_AETHERIUM_TAB);
	public static final RegistryObject<Item> EGGBED = block(AetheriumresourcesModBlocks.EGGBED, AetheriumresourcesModTabs.TAB_AETHERIUM_TAB);
	public static final RegistryObject<Item> ERROR_DECORATIVO = block(AetheriumresourcesModBlocks.ERROR_DECORATIVO,
			AetheriumresourcesModTabs.TAB_AETHERIUM_TAB);
	public static final RegistryObject<Item> FAILURE_DECORATIVO = block(AetheriumresourcesModBlocks.FAILURE_DECORATIVO,
			AetheriumresourcesModTabs.TAB_AETHERIUM_TAB);
	public static final RegistryObject<Item> SERINGA = REGISTRY.register("seringa", () -> new SeringaItem());
	public static final RegistryObject<Item> SERINGA_GLITCH = REGISTRY.register("seringa_glitch", () -> new SeringaGlitchItem());
	public static final RegistryObject<Item> MATERIAORGANICA = REGISTRY.register("materiaorganica", () -> new MateriaorganicaItem());
	public static final RegistryObject<Item> SERINGADESANGUE = REGISTRY.register("seringadesangue", () -> new SeringadesangueItem());
	public static final RegistryObject<Item> DISCO_2 = REGISTRY.register("disco_2", () -> new Disco2Item());
	public static final RegistryObject<Item> DISCO_3 = REGISTRY.register("disco_3", () -> new Disco3Item());
	public static final RegistryObject<Item> REALITYMISFORTUNE = REGISTRY.register("realitymisfortune", () -> new RealitymisfortuneItem());
	public static final RegistryObject<Item> AMETHYST_MACHINE = block(AetheriumresourcesModBlocks.AMETHYST_MACHINE,
			AetheriumresourcesModTabs.TAB_AETHERIUM_TAB);
	public static final RegistryObject<Item> DARKMATTER = block(AetheriumresourcesModBlocks.DARKMATTER, AetheriumresourcesModTabs.TAB_AETHERIUM_TAB);
	public static final RegistryObject<Item> BORDER = REGISTRY.register("border", () -> new BORDERItem());
	public static final RegistryObject<Item> DARKGRASS = block(AetheriumresourcesModBlocks.DARKGRASS, AetheriumresourcesModTabs.TAB_AETHERIUM_TAB);
	public static final RegistryObject<Item> PARASYTE = REGISTRY.register("parasyte", () -> new PARASYTEItem());
	public static final RegistryObject<Item> PARASITE_MATTER_PIECES = REGISTRY.register("parasite_matter_pieces",
			() -> new ParasiteMatterPiecesItem());
	public static final RegistryObject<Item> PARASITEMATTER = block(AetheriumresourcesModBlocks.PARASITEMATTER,
			AetheriumresourcesModTabs.TAB_AETHERIUM_TAB);
	public static final RegistryObject<Item> THUNDERSTORM = REGISTRY.register("thunderstorm", () -> new ThunderstormItem());
	public static final RegistryObject<Item> BLOODY_SKY = REGISTRY.register("bloody_sky", () -> new BloodySkyItem());
	public static final RegistryObject<Item> SIMULACRA = REGISTRY.register("simulacra", () -> new SimulacraItem());
	public static final RegistryObject<Item> SERINGA_ANTIDOTO = REGISTRY.register("seringa_antidoto", () -> new SeringaAntidotoItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

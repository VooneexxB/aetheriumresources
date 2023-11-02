
package net.mcreator.aetheriumresources.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.aetheriumresources.world.inventory.AmethystMachineGUIMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AmethystMachineGUIScreen extends AbstractContainerScreen<AmethystMachineGUIMenu> {
	private final static HashMap<String, Object> guistate = AmethystMachineGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AmethystMachineGUIScreen(AmethystMachineGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("aetheriumresources:textures/screens/amethyst_machine_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("aetheriumresources:textures/screens/ametista_slot.png"));
		this.blit(ms, this.leftPos + 76, this.topPos + 7, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("aetheriumresources:textures/screens/materia_slot.png"));
		this.blit(ms, this.leftPos + 47, this.topPos + 31, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("aetheriumresources:textures/screens/glitch_overlay.png"));
		this.blit(ms, this.leftPos + -1, this.topPos + 0, 0, 0, 176, 166, 176, 166);

		RenderSystem.setShaderTexture(0, new ResourceLocation("aetheriumresources:textures/screens/materia_slot.png"));
		this.blit(ms, this.leftPos + 105, this.topPos + 31, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("aetheriumresources:textures/screens/progresso.png"));
		this.blit(ms, this.leftPos + 81, this.topPos + 30, 0, 0, 7, 22, 7, 22);

		RenderSystem.setShaderTexture(0, new ResourceLocation("aetheriumresources:textures/screens/combustao_slot.png"));
		this.blit(ms, this.leftPos + 48, this.topPos + 53, 0, 0, 14, 14, 14, 14);

		RenderSystem.setShaderTexture(0, new ResourceLocation("aetheriumresources:textures/screens/combustao_slot.png"));
		this.blit(ms, this.leftPos + 107, this.topPos + 53, 0, 0, 14, 14, 14, 14);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}


package net.mcreator.aetheriumresources.world.features.ores;

public class EnrichedTwistedMatterFeature extends OreFeature {

	public static EnrichedTwistedMatterFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new EnrichedTwistedMatterFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("aetheriumresources:enriched_twisted_matter", FEATURE, new OreConfiguration(
				EnrichedTwistedMatterFeatureRuleTest.INSTANCE, AetheriumresourcesModBlocks.ENRICHED_TWISTED_MATTER.get().defaultBlockState(), 16));
		PLACED_FEATURE = PlacementUtils.register("aetheriumresources:enriched_twisted_matter", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(10), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	private final Set<ResourceKey<Level>> generate_dimensions = Set
			.of(ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("aetheriumresources:border")));

	public EnrichedTwistedMatterFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class EnrichedTwistedMatterFeatureRuleTest extends RuleTest {

		static final EnrichedTwistedMatterFeatureRuleTest INSTANCE = new EnrichedTwistedMatterFeatureRuleTest();

		private static final com.mojang.serialization.Codec<EnrichedTwistedMatterFeatureRuleTest> CODEC = com.mojang.serialization.Codec
				.unit(() -> INSTANCE);
		private static final RuleTestType<EnrichedTwistedMatterFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("aetheriumresources:enriched_twisted_matter_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(AetheriumresourcesModBlocks.TWISTED_MATTER.get());
			}

			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}


package net.mcreator.aetheriumresources.world.features.ores;

public class TwistedmatterunderwaterFeature extends OreFeature {

	public static TwistedmatterunderwaterFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new TwistedmatterunderwaterFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("aetheriumresources:twistedmatterunderwater", FEATURE, new OreConfiguration(
				TwistedmatterunderwaterFeatureRuleTest.INSTANCE, AetheriumresourcesModBlocks.TWISTEDMATTERUNDERWATER.get().defaultBlockState(), 16));
		PLACED_FEATURE = PlacementUtils.register("aetheriumresources:twistedmatterunderwater", CONFIGURED_FEATURE,
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

	public TwistedmatterunderwaterFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;

		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class TwistedmatterunderwaterFeatureRuleTest extends RuleTest {

		static final TwistedmatterunderwaterFeatureRuleTest INSTANCE = new TwistedmatterunderwaterFeatureRuleTest();

		private static final com.mojang.serialization.Codec<TwistedmatterunderwaterFeatureRuleTest> CODEC = com.mojang.serialization.Codec
				.unit(() -> INSTANCE);
		private static final RuleTestType<TwistedmatterunderwaterFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("aetheriumresources:twistedmatterunderwater_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of();
			}

			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}

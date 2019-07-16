/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multiworld.worldgen;

import java.util.List;
import java.util.Random;

import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;

/**
 *
 * @author Fernando
 */
public abstract class MultiWorldChunkGen extends org.bukkit.generator.ChunkGenerator implements ChunkGen, BlockConstants
{
	@Override
	public List<BlockPopulator> getDefaultPopulators(World world)
	{
		List<BlockPopulator> list = super.getDefaultPopulators(world);
		return list;
	}

	public short[][] generateExtBlockSections(World world, Random random, int x, int z, BiomeGrid biomes) {
		// TODO Auto-generated method stub
		return null;
	}
}

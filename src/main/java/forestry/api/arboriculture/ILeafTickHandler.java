/*******************************************************************************
 * Copyright 2011-2014 SirSengir
 *
 * This work (the API) is licensed under the "MIT" License, see LICENSE.txt for details.
 ******************************************************************************/
package forestry.api.arboriculture;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public interface ILeafTickHandler {
	boolean onRandomLeafTick(ITree tree, World world, BlockPos pos, boolean isDestroyed);
}

/*******************************************************************************
 * Copyright 2011-2014 SirSengir
 *
 * This work (the API) is licensed under the "MIT" License, see LICENSE.txt for details.
 ******************************************************************************/
package forestry.api.arboriculture;

import forestry.api.genetics.IAllele;

/**
 * Simple allele encapsulating an {@link IGrowthProvider}.
 */
public interface IAlleleGrowth extends IAllele {

	IGrowthProvider getProvider();

}

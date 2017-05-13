package EnderUnknown.Chemistry.proxy;

import EnderUnknown.Chemistry.Metallurgy.Blocks.BlockManager;
import EnderUnknown.Chemistry.Metallurgy.Metals.MetalManager;

public class ClientProxy extends CommonProxy{

	
	@Override
	public void registerRenders() {

		MetalManager.registerRenders();
		BlockManager.registerRenders();
		
	}
}

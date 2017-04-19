package nuke.darkness.proxy;

import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.*;
import nuke.darkness.*;
import nuke.darkness.gui.*;

public class CommonProxy {

	public void preInit( FMLPreInitializationEvent e ) {
		ModStuffs.init();
	}

	public void init( FMLInitializationEvent e ) {
		//TERegistry.registerTEs();
		//ModRecipes.registerRecipes(); 
	}

	public void postInit( FMLPostInitializationEvent e ) {
		NetworkRegistry.INSTANCE.registerGuiHandler(Darkness.instance, new GuiHandler());
	}
}
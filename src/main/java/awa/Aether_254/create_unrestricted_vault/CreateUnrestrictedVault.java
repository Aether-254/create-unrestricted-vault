package awa.Aether_254.create_unrestricted_vault;

import awa.Aether_254.create_unrestricted_vault.client.UnrestrictedVaultModMenu;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLLoader;

@Mod("create_unrestricted_vault")
public final class CreateUnrestrictedVault {
    public CreateUnrestrictedVault() {
        UnrestrictedVaultConfig.load();
        if (FMLLoader.getDist() == Dist.CLIENT)
            UnrestrictedVaultModMenu.register();
    }
}

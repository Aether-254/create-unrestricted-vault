package awa.Aether_254.create_unrestricted_vault;

import awa.Aether_254.create_unrestricted_vault.client.UnrestrictedVaultModMenu;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.loading.FMLEnvironment;

@Mod("create_unrestricted_vault")
public final class CreateUnrestrictedVault {
    public CreateUnrestrictedVault(ModContainer container) {
        UnrestrictedVaultConfig.load();
        if (FMLEnvironment.dist == Dist.CLIENT)
            UnrestrictedVaultModMenu.register(container);
    }
}

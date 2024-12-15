package basemod.patches.com.megacrit.cardcrawl.helpers.Hitbox;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch2;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.helpers.Hitbox;

// Fixes Hitbox rendering not resetting the SpriteBatch color which sometimes causes items that don#t first set sb color to be tinted red
@SpirePatch2(clz= Hitbox.class, method = "render")
public class FixRedSbColorNotBeingResetPatch {
    @SpirePostfixPatch
    public static void patch(Hitbox __instance, SpriteBatch sb) {
        if (Settings.isDebug || Settings.isInfo) {
            sb.setColor(Color.WHITE);
        }
    }
}

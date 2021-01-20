package team.aura_dev.aurasudo.platform.common.player;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.UUID;
import javax.annotation.Nonnull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import team.aura_dev.aurasudo.api.player.PlayerData;

/**
 * Simple class to represent players in a platform independent way.
 *
 * <p>If the platform offers a way to display a display name (like with added prefixes/suffixes or a
 * nickname) then it needs to override this class.
 */
@SuppressFBWarnings(
    value = "RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE",
    justification = "Code generated by lombok.")
@Data
@Getter(onMethod = @__({@Nonnull}))
@EqualsAndHashCode(of = "uuid")
public class PlayerDataCommon implements PlayerData {
  @NonNull protected final UUID uuid;
  @NonNull protected final String playerName;
  protected boolean sudoActive = false;

  /**
   * A nice name for the player.<br>
   * Can be overridden to allow showing of prefixes and nicknames.
   *
   * @return a nicer variant of the player name
   */
  @Override
  @Nonnull
  public String getDisplayName() {
    return playerName;
  }

  @Override
  public boolean getSudoActive() {
    return sudoActive;
  }

  public void setSudoActive(boolean active) {
    sudoActive = active;
  }
}

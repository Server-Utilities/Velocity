/*
 * Copyright (C) 2018 Velocity Contributors
 *
 * The Velocity API is licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in the api top-level directory.
 */

package com.velocitypowered.api.event.player;

import com.google.common.base.Preconditions;
import com.velocitypowered.api.proxy.connection.Player;
import com.velocitypowered.api.proxy.messages.PluginChannelId;
import java.util.List;

/**
 * This event is fired when a client ({@link Player}) sends a plugin message through the
 * register channel.
 */
public final class PlayerChannelRegisterEventImpl implements PlayerChannelRegisterEvent {

  private final Player player;
  private final List<PluginChannelId> channels;

  public PlayerChannelRegisterEventImpl(Player player, List<PluginChannelId> channels) {
    this.player = Preconditions.checkNotNull(player, "player");
    this.channels = Preconditions.checkNotNull(channels, "channels");
  }

  @Override
  public Player player() {
    return player;
  }

  @Override
  public List<PluginChannelId> channels() {
    return channels;
  }

  @Override
  public String toString() {
    return "PlayerChannelRegisterEvent{"
            + "player=" + player
            + ", channels=" + channels
            + '}';
  }
}
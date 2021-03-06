/*
 * Copyright 2015 Austin Keener, Michael Ritter, Florian Spieß, and the JDA contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dv8tion.jda.api.entities;

import net.dv8tion.jda.api.JDA;

import javax.annotation.Nonnull;

/**
 * Abstract Channel interface for all {@link ChannelType ChannelTypes}.
 */
public interface AbstractChannel extends ISnowflake
{
    /**
     * The human readable name of this channel.
     *
     * @return The name of this channel
     */
    @Nonnull
    String getName();

    /**
     * The {@link net.dv8tion.jda.api.entities.ChannelType ChannelType} for this channel
     *
     * @return The channel type
     */
    @Nonnull
    ChannelType getType();

    /**
     * Returns the {@link net.dv8tion.jda.api.JDA JDA} instance of this channel
     *
     * @return the corresponding JDA instance
     */
    @Nonnull
    JDA getJDA();
}

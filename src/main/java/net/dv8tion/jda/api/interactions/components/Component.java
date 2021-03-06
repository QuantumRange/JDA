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

package net.dv8tion.jda.api.interactions.components;

import net.dv8tion.jda.api.utils.data.SerializableData;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Component of a Message.
 * <br>These are used to extend messages with interactive elements such as buttons or dropdown menus.
 *
 * @see net.dv8tion.jda.api.interactions.components.Button Button
 * @see ActionRow
 */
public interface Component extends SerializableData
{
    /**
     * The type of component.
     *
     * @return {@link Type}
     */
    @Nonnull
    Type getType();

    /**
     * The component ID or null.
     * <br>Some components such as link buttons don't have this.
     *
     * <p>This need not be a numeric ID! All these component IDs are custom and not generated by Discord.
     *
     * @return The component ID or null if not present
     */
    @Nullable
    String getId();

    /**
     * The component types
     */
    enum Type
    {
        UNKNOWN(-1),
        /** A row of interactive components on a message */
        ACTION_ROW(1),
        /** A button */
        BUTTON(2)
        ;

        private final int key;

        Type(int key)
        {
            this.key = key;
        }

        /**
         * Maps the provided type id to the respective enum instance.
         *
         * @param  type
         *         The raw type id
         *
         * @return The Type or {@link #UNKNOWN}
         */
        @Nonnull
        public static Type fromKey(int type)
        {
            for (Type t : values())
            {
                if (t.key == type)
                    return t;
            }
            return UNKNOWN;
        }
    }
}

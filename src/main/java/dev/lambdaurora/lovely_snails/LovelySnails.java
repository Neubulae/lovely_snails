/*
 * Copyright (c) 2021 LambdAurora <aurora42lambda@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package dev.lambdaurora.lovely_snails;

import dev.lambdaurora.lovely_snails.registry.LovelySnailsRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

/**
 * Represents the Lovely Snails mod.
 *
 * @author LambdAurora
 * @version 1.0.0
 * @since 1.0.0
 */
public class LovelySnails implements ModInitializer {
    public static final String NAMESPACE = "lovely_snails";

    @Override
    public void onInitialize() {
        LovelySnailsRegistry.init();
    }

    public static Identifier id(String path) {
        return new Identifier(NAMESPACE, path);
    }
}

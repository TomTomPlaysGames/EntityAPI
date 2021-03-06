/*
 * Copyright (C) EntityAPI Team
 *
 * This file is part of EntityAPI.
 *
 * EntityAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * EntityAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with EntityAPI.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.entityapi.api.entity.mind.attribute;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.entityapi.api.entity.mind.Attribute;
import org.entityapi.api.entity.mind.Mind;

public class InventoryAttribute extends Attribute {

    private Inventory inventory;

    public InventoryAttribute() {
        this(36);
    }

    public InventoryAttribute(int inventorySize) {
        this.inventory = Bukkit.createInventory(getMind().getControllableEntity(), inventorySize);
    }

    protected InventoryAttribute(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public InventoryAttribute copyTo(Mind mind) {
        this.mind = mind;
        return new InventoryAttribute(this.inventory.getSize());
    }

    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public String getKey() {
        return "Inventory";
    }
}
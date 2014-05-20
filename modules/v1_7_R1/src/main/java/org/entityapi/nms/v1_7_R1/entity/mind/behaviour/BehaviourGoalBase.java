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

package org.entityapi.nms.v1_7_R1.entity.mind.behaviour;

import net.minecraft.server.v1_7_R1.EntityLiving;
import org.entityapi.api.entity.ControllableEntity;
import org.entityapi.api.entity.mind.behaviour.BehaviourType;
import org.entityapi.nms.v1_7_R1.BasicEntityUtil;

public abstract class BehaviourGoalBase implements org.entityapi.api.entity.mind.behaviour.BehaviourGoal {

    private ControllableEntity controllableEntity;

    public BehaviourGoalBase(ControllableEntity controllableEntity) {
        this.controllableEntity = controllableEntity;
    }

    public ControllableEntity getControllableEntity() {
        return controllableEntity;
    }

    public EntityLiving getHandle() {
        return BasicEntityUtil.getInstance().getHandle(this.getControllableEntity());
    }

    public abstract BehaviourType getType();

    public abstract String getDefaultKey();

    public abstract boolean shouldStart(); //a

    public boolean shouldContinue() { //b
        return shouldStart();
    }

    public void start() { //c
    }

    public void finish() { //d
    }

    public boolean isContinuous() {
        return true;
    }

    public void tick() {
    } //e
}
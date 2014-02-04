package io.snw.entityapi.entity;

import io.snw.entityapi.EntityManager;
import io.snw.entityapi.api.ControllableEntityType;
import io.snw.entityapi.api.EntitySound;
import net.minecraft.server.v1_7_R1.EntityChicken;
import org.bukkit.entity.Chicken;

public class ControllableChicken extends ControllableBaseEntity<Chicken> {

    public ControllableChicken(int id, EntityManager manager) {
        super(id, ControllableEntityType.CHICKEN, manager);
    }

    public ControllableChicken(int id, ControllableBatEntity entityHandle, EntityManager manager) {
        this(id, manager);
        this.handle = entityHandle;
        this.loot = entityHandle.getDefaultMaterialLoot();
    }

    @Override
    public void initSounds() {
        this.setSound(EntitySound.IDLE, "mob.chicken.idle");
        this.setSound(EntitySound.HURT, "mob.chicken.hurt");
        this.setSound(EntitySound.DEATH, "mob.chicken.hurt");
        this.setSound(EntitySound.STEP, "mob.chicken.step");
        this.setSound(EntitySound.LAY_EGG, "mob.chicken.plop");
    }
}
package com.brand.blockus.blocks.Asphalt;


import com.brand.blockus.blocks.Base.StairsBase;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AsphaltStairs extends StairsBase {

	public AsphaltStairs(BlockState state, String name, float hardness, float resistance) {
		super(state, name, hardness, resistance);
	}

	@Override
	public void onSteppedOn(World world_1, BlockPos blockPos_1, Entity entity_1) {
		if (entity_1.getType() != EntityType.ITEM && 
				entity_1.getType() != EntityType.FALLING_BLOCK && 
				entity_1.getType() != EntityType.EXPERIENCE_ORB &&
				entity_1.getType() != EntityType.END_CRYSTAL && 
			    entity_1.getType() != EntityType.EVOKER_FANGS && 
			    entity_1.getType() != EntityType.LEASH_KNOT && 
			    entity_1.getType() != EntityType.ITEM_FRAME &&
			    entity_1.getType() != EntityType.TNT && 
			    entity_1.getType() != EntityType.TRIDENT &&
			    entity_1.getType() != EntityType.PAINTING &&
				entity_1.getType() != EntityType.BOAT && 
				entity_1.getType() != EntityType.MINECART && 
				entity_1.getType() != EntityType.CHEST_MINECART && 
				entity_1.getType() != EntityType.FURNACE_MINECART && 
				entity_1.getType() != EntityType.HOPPER_MINECART && 
				entity_1.getType() != EntityType.SPAWNER_MINECART && 
				entity_1.getType() != EntityType.TNT_MINECART && 
				entity_1.getType() != EntityType.COMMAND_BLOCK_MINECART && 
				entity_1.getType() != EntityType.ARMOR_STAND) {
			((LivingEntity) entity_1).addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 10, 4, true, false, false));
		}
	}
  }
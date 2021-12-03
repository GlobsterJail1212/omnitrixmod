package com.example.omnitrixmod.container;

import com.example.omnitrixmod.items.omnitrixprototype;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;

public class omnitrixdatacontainer1 extends Container {


    private final IItemHandler playerInventory;

    public omnitrixdatacontainer1(int id, final PlayerInventory playerInventory, PacketBuffer containerProvider){
        super(ContainerTypes.OMNITRIX_CONTAINER.get(),id);
        this.playerInventory = new InvWrapper(playerInventory);

    }
    public omnitrixdatacontainer1(int id, final PlayerInventory playerInventory, PlayerEntity playerEntity){
        super(ContainerTypes.OMNITRIX_CONTAINER.get(),id);
        this.playerInventory = new InvWrapper(playerInventory);

    }


    @Override
    public boolean stillValid(PlayerEntity p_75145_1_) {
        return true;
    }
}

package com.example.omnitrixmod.items;

import com.example.omnitrixmod.container.omnitrixdatacontainer1;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.registries.ObjectHolder;

import javax.annotation.Nullable;

public class omnitrixprototype extends Item {
    public static final ResourceLocation model = new ResourceLocation("assets/models/item/omnitrixprototype");
    public static Item INSTANCE = new omnitrixprototype(new Properties().tab(ItemGroup.TAB_TOOLS)).setRegistryName("omnitrixprototype");

    public omnitrixprototype(Properties properties) {
        super(properties);
    }


    @Override
    public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack stack = playerIn.getOffhandItem();
        if (!worldIn.isClientSide) {
            INamedContainerProvider provider = createContainerProvider();
            NetworkHooks.openGui((ServerPlayerEntity) playerIn, provider);
            return ActionResult.success(playerIn.getItemInHand(handIn));
        }
        return ActionResult.fail(playerIn.getItemInHand(handIn));
    }


    private INamedContainerProvider createContainerProvider() {
        return new INamedContainerProvider() {
            @Override
            public ITextComponent getDisplayName() {
                return new TranslationTextComponent("screen.omnitrixmod.omnitrixgui");
            }

            @Nullable
            @Override
            public Container createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
                return (Container) new omnitrixdatacontainer1(i, playerInventory, playerEntity);
            }
        };
    }
}
package com.gregtechceu.gtceu.api.machine.feature;

import net.minecraft.core.Direction;
import org.jetbrains.annotations.Nullable;

/**
 * @author KilaBash
 * @date 2023/3/2
 * @implNote IAutoOutputItem
 */
public interface IAutoOutputItem {

    boolean isAutoOutputItems();

    void setAutoOutputItems(boolean allow);

    boolean isAllowInputFromOutputSideItems();

    void setAllowInputFromOutputSideItems(boolean allow);

    @Nullable
    Direction getOutputFacingItems();

    void setOutputFacingItems(Direction outputFacing);

}

package com.gregtechceu.gtceu.api.pipenet;


public interface IPipeType<NodeDataType extends IAttachData> {

    float getThickness();

    NodeDataType modifyProperties(NodeDataType baseProperties);

    boolean isPaintable();

}

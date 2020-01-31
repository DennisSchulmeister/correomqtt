package com.exxeta.correomqtt.plugin.spi;

import com.exxeta.correomqtt.plugin.model.MessageExtensionDTO;
import javafx.scene.layout.HBox;

public interface DetailViewHook extends BaseExtensionPoint {

    void onOpenDetailView(MessageExtensionDTO messageDTO, HBox labelArea);
}

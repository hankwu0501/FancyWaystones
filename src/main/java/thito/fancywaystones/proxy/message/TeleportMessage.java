package thito.fancywaystones.proxy.message;

import thito.fancywaystones.proxy.SerializableLocation;

import java.util.*;

public class TeleportMessage extends Message {
    private static final long serialVersionUID = 1L;
    private boolean sendFeedback;
    private SerializableLocation source, target;
    private UUID playerUUID;

    public TeleportMessage(UUID playerUUID, boolean sendFeedback, SerializableLocation source, SerializableLocation target) {
        this.playerUUID = playerUUID;
        this.sendFeedback = sendFeedback;
        this.source = source;
        this.target = target;
    }

    public UUID getPlayerUUID() {
        return playerUUID;
    }

    public boolean isSendFeedback() {
        return sendFeedback;
    }

    public SerializableLocation getSource() {
        return source;
    }

    public SerializableLocation getTarget() {
        return target;
    }
}

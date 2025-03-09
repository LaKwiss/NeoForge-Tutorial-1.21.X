package net.kaupenjoe.tutorialmod.networking;

import net.neoforged.neoforge.network.handling.IPayloadContext;

public class ServerPayloadHandler {
    public static void handleDataOnMain(final ModPayload payload, final IPayloadContext context) {
        switch (payload.value()) {
            case 1:
                //Run the process
        }
    }
}

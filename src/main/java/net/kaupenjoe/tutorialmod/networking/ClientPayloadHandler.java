package net.kaupenjoe.tutorialmod.networking;

import net.neoforged.neoforge.network.handling.IPayloadContext;

public class ClientPayloadHandler {
    public static void handleDataOnMain(final ModPayload payload, final IPayloadContext context) {
        System.out.println("Received data on main thread: " + payload.data());
    }
}

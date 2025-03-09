package net.kaupenjoe.tutorialmod.networking;

import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record ModPayload(int value, String data) implements CustomPacketPayload {
    public static final CustomPacketPayload.Type<ModPayload> TYPE = new CustomPacketPayload.Type<>(ResourceLocation.fromNamespaceAndPath("tutorialmod", "mod_payload"));

    public static final StreamCodec<ByteBuf, ModPayload> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.VAR_INT,
            ModPayload::value,
            ByteBufCodecs.STRING_UTF8,
            ModPayload::data,
            ModPayload::new
    );


    @Override
    public Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}
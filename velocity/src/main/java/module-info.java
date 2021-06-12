module com.vexsoftware.votifier {
    requires transitive com.google.gson;
    requires com.velocitypowered.api;
    requires java.logging;
    requires io.netty.buffer;
    requires io.netty.codec;
    requires io.netty.common;
    requires io.netty.transport;
    requires io.netty.transport.epoll;
    exports com.vexsoftware.votifier.model;
}

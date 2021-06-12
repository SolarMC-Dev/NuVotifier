module com.vexsoftware.votifier {
    requires transitive com.google.gson;
    requires io.netty.buffer;
    requires io.netty.codec;
    requires io.netty.common;
    requires io.netty.transport;
    requires io.netty.transport.epoll;
    requires java.logging;
    requires org.apache.commons.lang3;
    requires transitive org.bukkit;
    exports com.vexsoftware.votifier.model;
}

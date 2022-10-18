package org.example.http;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * in order to learn java!
 * created at 2022/10/17 00:27
 *
 * @author felixwc
 */
@Slf4j
public class HttpConsole {
    public static void start(){
        NioEventLoopGroup boss = new NioEventLoopGroup(1);
        NioEventLoopGroup work = new NioEventLoopGroup(8);
        try{
            ServerBootstrap server = new ServerBootstrap()
                    .group(boss,work)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                                ch.pipeline().addLast(new LoggingHandler(LogLevel.DEBUG));
                                ch.pipeline().addLast(new HttpServerCodec());
                                ch.pipeline().addLast(new ChannelInitializer<SocketChannel>() {
                                    @Override
                                    protected void initChannel(SocketChannel ch) throws Exception {
                                        System.out.println(ch.remoteAddress());
                                        ch.writeAndFlush("hello");
                                    }
                                });
                        }
                    });
            ChannelFuture future = server.bind(12345).sync();
            future.channel().closeFuture().sync();
        }catch (Exception e){
            log.info("http server failed: {}",e.getMessage());
        }finally {
            boss.shutdownGracefully();
            work.shutdownGracefully();
        }
    }
}

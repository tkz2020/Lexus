# Lexus
lexus-rpc（一个新手练习的RPC项目）

第一阶段的目标：

1、注册中心（zookeeper 实现的API是curator,可参考Jupiter的实现,注册中心可选redis或者zookeeper或者本地注册）

2、序列化（java  hessian  fastjson  protobuf   kryo）

3、扩展Executor，实现自定义线程池

4、Netty的网络通信包括Netty的编码和解码

5、SPI的ClassLoader

6、自定义Log的实现（可参考Motan的实现）

7、动态代理（可参考Jupiter的实现）

8、负载均衡（可参考Jupiter和Dubbo的实现，前期和实现两种，后期在进行扩展）

9、集群的容错机制（可参考Dubbo,分别是：FailOver、FailFast、FailSafe、FailBack、Forking、Broadcast）

10、服务的暴露和引用

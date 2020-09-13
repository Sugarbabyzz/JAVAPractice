package demo03;

public class Client {

    public static void main(String[] args) {

        // 真实角色
        Host host = new Host();

        // 代理角色：现在没有
        ProxyInvocationHandler handler = new ProxyInvocationHandler();

        // 通过调用程序处理角色，来处理要调用的接口对象
        handler.setRent(host);
        Rent proxy = (Rent) handler.getProxy();  // 这里的proxy就是动态生成的代理类

        proxy.rent();
    }
}

package demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {


    // 被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成代理类
    public Object getProxy() {
        // 三个固定参数（ClassLoader，代理的接口，InvocationHandler实现类）
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 动态代理的本质，就是使用反射机制实现
        seeHouse();
        Object result = method.invoke(rent, args);
        fee();

        return result;
    }

    public void seeHouse() {
        System.out.println("看房子");
    }

    public void fee() {
        System.out.println("收中介费");
    }
}

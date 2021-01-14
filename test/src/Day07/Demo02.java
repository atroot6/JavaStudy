package Day07;

public class Demo02 {
    /*
    JavaBean: 是一种用Java语言写成的可重用性组件
    所谓的JavaBean是一个符合如下标准的类
        1.类是公共的
        2.具有一个空参数的构造方法
        3.属性私有,且具有对应的get\set方法
    用户可以使用JavaBean 将功能\处理\值\数据库访问和其他任何可以用java代码创造的对象进行打包,并且其他开发者可以通过内部的JSP页面\Servlet\其他JavaBean\
    aoolet程序或者应用来使用这些对象.用户可以认为JavaBean提供一种随时随地粘贴复制的功能,而不用关心任何改变

    UML类图
        + - 分别代表权限 共有  私有
        方法 下划线则代表 构造方法
        冒号: 后面代表的是返回值类型

        MVC 三层结构 view(视图) \ controller(控制器) \ model (模型)
        controller 控制器: 1.获取客户端输入 2.调用模型 3.将数据交给视图展示  控制器不作出具体的操作 只做一个中转 交给模型来操作 ->调用模型 进行业务操作(JavaBean)
        Mode    模型  业务逻辑操作 查询数据库  封装数据
        view    视图  前台页面展示数据  JSP\Html   数据展示
        JSP:（全称JavaServer Pages）是由Sun公司主导创建的一种动态网页技术标准。JSP部署于网络服务器上，
        可以响应客户端发送的请求，并根据请求内容动态地生成HTML、XML或其他格式文档的Web网页，然后返回给请求者。


     */
    public static void main(String[] args) {

    }
}

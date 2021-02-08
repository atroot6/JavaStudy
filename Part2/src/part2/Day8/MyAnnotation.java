package part2.Day8;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * 注解自定义  参照@SuppressWarnings 来自定义
 * 声明 @interface,内部定义成员value   如果注解有成员,在使用注解的时候就必须指明成员的值
 * 如果指定成员的默认值,那么就需要使用default来定义    提供了默认值 那么就可以不用在使用的时候必须写上 value的参数
 * 例如 String value() default "hello";
 * <p>
 * jdk提供的 四种基本元注解
 * Retention\Target\Documented\Inherited
 * <p>
 * Retention 指定所修饰的Annotation的生命周期  1.SOURCE(在编译时就被抛弃) 2.CLASS(编译时保留,运行时抛弃) 3.RUNTIME(在运行时也保留)
 * 注意:只有在声明为RUNTIME时才能通过反射来调取
 * Target:用于限定被修饰的Annotation
 * 能够修饰的类型TYPE\FIELD\METHOD\PARAMETER\CONSTRUCTOR\LOCAL_VARIABLE\ANNOTATION_TYPE\PACKAGE\TYPE_PARAMETER\TYPE_USE
 * Documented:用于指定被该元注解修饰的注解,将会被提取成为JavaDoc文档
 * Inherited:被该元注解修饰的注解会具有继承性,其子类将自动继承注解
 * <p>
 * JDK8.0+ 1.可重复性注解  1.在MyAnnotation上声明@Repeatable(),成员值为Annotations.class
 *                       2.保持MyAnnotation\MyAnnotations中的Retention(生命周期)\Target(应用目标)等元注解一致
 *         2.类型注解     1.ElementType.TYPE_PARAMETER 表示该注解 能卸载类型变量的声明语句当中
 *                       2.ElementType.TYPE_USE 表示该注解能写在使用类型的任何语句当中
 * 以上jdk8新增的两条特性都是需要提前声明在Target中的
 */
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, ANNOTATION_TYPE, PACKAGE, TYPE_PARAMETER, TYPE_USE})

@SuppressWarnings("unused")
@interface MyAnnotation {
    String value() default "hello";
}
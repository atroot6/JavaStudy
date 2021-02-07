package part2.Day8;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解自定义  参照@SuppressWarnings 来自定义
 * 声明 @interface,内部定义成员value   如果注解有成员,在使用注解的时候就必须指明成员的值
 * 如果指定成员的默认值,那么就需要使用default来定义    提供了默认值 那么就可以不用在使用的时候必须写上 value的参数
 * 例如 String value() default "hello";
 * <p>
 * jdk提供的 四种基本元注解
 * Retention\Target\Documented\Inherited
 *
 * Retention 指定所修饰的Annotation的生命周期  1.SOURCE(在编译时就被抛弃) 2.CLASS(编译时保留,运行时抛弃) 3.RUNTIME(在运行时也保留)
 *      注意:只有在声明为RUNTIME时才能通过反射来调取
 * Target:用于限定被修饰的Annotation
 * 能够修饰的类型TYPE\FIELD\METHOD\PARAMETER\CONSTRUCTOR\LOCAL_VARIABLE\ANNOTATION_TYPE\PACKAGE\TYPE_PARAMETER\TYPE_USE
 * Documented:用于指定被该元注解修饰的注解,将会被提取成为JavaDoc文档
 * Inherited:被该元注解修饰的注解会具有继承性,其子类将自动继承注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({})
@SuppressWarnings("unused")
public @interface MyAnnotation {
    String value() default "hello";
}
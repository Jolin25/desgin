### 演示开闭原则
* old包里是原本的样子
* OCP包里是想要使用开闭原则，从而对原本的Alter类进行了重构之后的样子。
    * 这样的话，想要增加新的告警内容就可以直接扩展，而不是修改原本的内容了。
    * 这时如果要新增功能就可以这样：
        * 现在，我们再来看下，基于重构之后的代码，如果再添加上面讲到的那个新功能，每秒钟接口超时请求个数超过某个最大阈值就告警，我们又该如何改动代码呢？主要的改动有下面四处。
            * 第一处改动是：在 ApiStatInfo 类中添加新的属性 timeoutCount。
            * 第二处改动是：添加新的 TimeoutAlertHander 类。
            * 第三处改动是：在 ApplicationContext 类的 initializeBeans() 方法中，往 alert 对象中注册新的 timeoutAlertHandler。
            * 第四处改动是：在使用 Alert 类的时候，需要给 check() 函数的入参 apiStatInfo 对象设置 timeoutCount 的值。
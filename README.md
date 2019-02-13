# dependencies
gradle 依赖管理 学习笔记
gradle的依賴管理
要使用的类库直接引入，不需要去下载各种jar以及jar依赖的其他ar
gradle的依赖管理会帮我们加载此类库依赖的Jar.这样可以避免各种
jar的版本不一致导致的各种问题。

依赖管理：在什么地方以什么形式引入外部代码
关键字 compile  testCompile(只在测试的时候编译) 引入我们要使用的类库 指定 group  name  version 即可
例如：
compile("org.apache.httpcomponents", "httpclient", "4.5")
同事我们还要指定我们的类库所在的仓库位置
如：
repositories {
jcenter();
mavenCentral();
}

依赖冲突：
 当两个类库依赖同一个类库的不同的版本的时候，gradle会默认只加载高版本的库。
 当我们希望用低版本的库时可以用exclude 来指定不加载高版本的即可例如：
compile("org.apache.httpcomponents", "httpclient", "4.5") {
exclude("commons-logging", "commons-logging")//指定不加載某些依賴的庫
}

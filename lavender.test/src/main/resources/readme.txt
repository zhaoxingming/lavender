以jar包的方式提供给其他工程引用。本工程会依赖测试相关jar包，包括junit,spring test,dbunit,jmockit等
目的有三个：
1、统一引入测试相关依赖
2、统一管理所有测试资源，包括测试bean的配置，测试properties的管理，不用再每个工程中管理。
3、统一的测试父类


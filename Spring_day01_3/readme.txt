spring配置数据库
此例需要导入oracle驱动
注：由于myeclipse自动集成的环境中，c3p0的jar包有问题，所以需要重新导入一个c3p0jar包覆盖原来的。
   方法：将项目发布到tomcat，右键tomcat下发布后的项目，选择Browse...，找到jar包复制除c3p0的包，然后在项目中buildpath
             将原有jar包删除，再重新导入，在导入另外的c3p0包。
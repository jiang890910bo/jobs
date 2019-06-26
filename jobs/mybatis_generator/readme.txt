使用命令生成时，如果报类似这样的错：

 [ERROR] XML Parser Error on line 11: 注释中不允许出现字符串 "--"
错误原因
      generatorConfig.xml中出现<!-- -->注释，报错
去掉所有的<!--注释-->
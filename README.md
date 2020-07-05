# covid2019-client
### 项目简介

Covid2019 visualization for tracking the status in the world.

这个项目主要对新冠肺炎数据进行可视化展示，项目的主要架构如下：

1. 数据来源：[DXY-COVID-19-Data](https://github.com/BlankerL/DXY-COVID-19-Data) ，该数据来源于 [丁香园](https://ncov.dxy.cn/ncovh5/view/pneumonia)
2. 爬虫程序 ：[covid2019-crawer](https://github.com/wpwbb510582246/covid2019-crawer)，该爬虫基于 [DXY-COVID-19-Crawler](https://github.com/BlankerL/DXY-COVID-19-Crawler)，然后进行了相应改进。爬虫程序会将爬取到的数据存储到 `MongoDB`中，由于数据在可视化展示时会有少许复杂，所以在爬取数据时一方面将数据写入 `MongoDB`，另一方面需要写入 `Hive` 的外表中，进行清洗过后存入 `MySQL` 数据库，然后将 `MySQL` 中的数据用于可视化展示。

#### TODO

##### 2020-07-05

1. 将 `CDH` 在虚拟机上安装完成，然后安装相应组件(`HDFS`、`ZooKeeper`、`Hive`等)。
2. 完善爬虫程序 [covid2019-crawer](https://github.com/wpwbb510582246/covid2019-crawer) ，添加将数据写入 `Hive` 的外表中的功能。
3. 完善清洗程序的设计与开发。
4. 开发疫情数据的接口。
5. 将可视化程序中的测试数据替换为接口中的数据。

#### 更新记录

##### 2020-07-05

1. 项目初始化。
2. 完成可视化程序中中国地图的省市下钻功能。
3. 完善说明文档。
Cluster Deployment

To deploy clusters exactly as I've configred them for my demo, use the scripts in each of these three directories to spin up three seperate clusters for Kafka, Spark, and Cassandra. To tweak the amount/type of nodes in each of these clusters, edit the corresponding .yml file. Note that a Spark cluster requires a master node, while Cassandra and Kafka do not. All deployment for these clusters will be managed through Pegasus.


haha